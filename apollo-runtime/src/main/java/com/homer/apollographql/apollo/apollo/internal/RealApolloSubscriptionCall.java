package com.homer.apollographql.apollo.apollo.internal;

import com.homer.apollographql.apollo.apollo.ApolloSubscriptionCall;
import com.homer.apollographql.apollo.api.Response;
import com.homer.apollographql.apollo.api.Subscription;
import com.homer.apollographql.apollo.api.internal.ApolloLogger;
import com.homer.apollographql.apollo.api.internal.ResponseFieldMapper;
import com.homer.apollographql.apollo.cache.CacheHeaders;
import com.homer.apollographql.apollo.cache.normalized.ApolloStore;
import com.homer.apollographql.apollo.cache.normalized.ApolloStoreOperation;
import com.homer.apollographql.apollo.cache.normalized.Record;
import com.homer.apollographql.apollo.apollo.exception.ApolloCanceledException;
import com.homer.apollographql.apollo.apollo.exception.ApolloNetworkException;
import com.homer.apollographql.apollo.cache.normalized.internal.ResponseNormalizer;
import com.homer.apollographql.apollo.cache.normalized.internal.Transaction;
import com.homer.apollographql.apollo.cache.normalized.internal.WriteableStore;
import com.homer.apollographql.apollo.apollo.internal.subscription.ApolloSubscriptionException;
import com.homer.apollographql.apollo.apollo.internal.subscription.SubscriptionManager;
import com.homer.apollographql.apollo.apollo.internal.subscription.SubscriptionResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

import static com.ahomer.pollographql.apollo.api.internal.Utils.checkNotNull;

public class RealApolloSubscriptionCall<T> implements ApolloSubscriptionCall<T> {
  private final Subscription<?, T, ?> subscription;
  private final SubscriptionManager subscriptionManager;
  private final ApolloStore apolloStore;
  private final CachePolicy cachePolicy;
  private final Executor dispatcher;
  private final ResponseFieldMapperFactory responseFieldMapperFactory;
  private final ApolloLogger logger;
  private final AtomicReference<CallState> state = new AtomicReference<>(CallState.IDLE);
  private SubscriptionManagerCallback<T> subscriptionCallback;

  public RealApolloSubscriptionCall(@NotNull Subscription<?, T, ?> subscription, @NotNull SubscriptionManager subscriptionManager,
      @NotNull ApolloStore apolloStore, @NotNull CachePolicy cachePolicy, @NotNull Executor dispatcher,
      @NotNull ResponseFieldMapperFactory responseFieldMapperFactory, @NotNull ApolloLogger logger) {
    this.subscription = subscription;
    this.subscriptionManager = subscriptionManager;
    this.apolloStore = apolloStore;
    this.cachePolicy = cachePolicy;
    this.dispatcher = dispatcher;
    this.responseFieldMapperFactory = responseFieldMapperFactory;
    this.logger = logger;
  }

  @Override
  public void execute(@NotNull final Callback<T> callback) throws ApolloCanceledException {
    checkNotNull(callback, "callback == null");
    synchronized (this) {
      switch (state.get()) {
        case IDLE: {
          state.set(CallState.ACTIVE);

          if (cachePolicy == CachePolicy.CACHE_AND_NETWORK) {
            dispatcher.execute(new Runnable() {
              @Override public void run() {
                final Response<T> cachedResponse = resolveFromCache();
                if (cachedResponse != null) {
                  callback.onResponse(cachedResponse);
                }
              }
            });
          }

          subscriptionCallback = new SubscriptionManagerCallback<>(callback, this);
          subscriptionManager.subscribe(subscription, subscriptionCallback);
          break;
        }

        case CANCELED:
          throw new ApolloCanceledException();

        case TERMINATED:
        case ACTIVE:
          throw new IllegalStateException("Already Executed");

        default:
          throw new IllegalStateException("Unknown state");
      }
    }
  }

  @Override
  public void cancel() {
    synchronized (this) {
      switch (state.get()) {
        case IDLE: {
          state.set(CallState.CANCELED);
          break;
        }

        case ACTIVE: {
          try {
            subscriptionManager.unsubscribe(subscription);
          } finally {
            state.set(CallState.CANCELED);
            subscriptionCallback.release();
          }
          break;
        }

        case CANCELED:
        case TERMINATED:
          // These are not illegal states, but cancelling does nothing
          break;

        default:
          throw new IllegalStateException("Unknown state");
      }
    }
  }

  @SuppressWarnings("MethodDoesntCallSuperMethod")
  @Override
  public ApolloSubscriptionCall<T> clone() {
    return new RealApolloSubscriptionCall<>(subscription, subscriptionManager, apolloStore, cachePolicy, dispatcher,
        responseFieldMapperFactory, logger);
  }

  @Override public boolean isCanceled() {
    return state.get() == CallState.CANCELED;
  }

  @NotNull @Override public ApolloSubscriptionCall<T> cachePolicy(@NotNull CachePolicy cachePolicy) {
    checkNotNull(cachePolicy, "cachePolicy is null");
    return new RealApolloSubscriptionCall<>(subscription, subscriptionManager, apolloStore, cachePolicy, dispatcher,
        responseFieldMapperFactory, logger);
  }

  private void terminate() {
    synchronized (this) {
      switch (state.get()) {
        case ACTIVE: {
          state.set(CallState.TERMINATED);
          subscriptionCallback.release();
          break;
        }

        case CANCELED:
          break;

        case IDLE:
        case TERMINATED:
          throw new IllegalStateException(
              CallState.IllegalStateMessage.forCurrentState(state.get()).expected(CallState.ACTIVE, CallState.CANCELED));

        default:
          throw new IllegalStateException("Unknown state");
      }
    }
  }

  @SuppressWarnings("unchecked")
  private Response<T> resolveFromCache() {
    final ResponseNormalizer<Record> responseNormalizer = apolloStore.cacheResponseNormalizer();
    final ResponseFieldMapper responseFieldMapper = responseFieldMapperFactory.create(subscription);

    final ApolloStoreOperation<Response> apolloStoreOperation = apolloStore.read(subscription, responseFieldMapper, responseNormalizer,
        CacheHeaders.NONE);

    Response<T> cachedResponse = null;
    try {
      cachedResponse = apolloStoreOperation.execute();
    } catch (Exception e) {
      logger.e(e, "Failed to fetch subscription `%s` from the store", subscription);
    }

    if (cachedResponse != null && cachedResponse.getData() != null) {
      logger.d("Cache HIT for subscription `%s`", subscription);
      return cachedResponse;
    } else {
      logger.d("Cache MISS for subscription `%s`", subscription);
      return null;
    }
  }

  private void cacheResponse(final SubscriptionResponse<T> networkResponse) {
    if (networkResponse.cacheRecords.isEmpty() || cachePolicy == CachePolicy.NO_CACHE) {
      return;
    }

    dispatcher.execute(new Runnable() {
      @Override public void run() {
        final Set<String> cacheKeys;
        try {
          cacheKeys = apolloStore.writeTransaction(new Transaction<WriteableStore, Set<String>>() {
            @Nullable @Override public Set<String> execute(WriteableStore cache) {
              return cache.merge(networkResponse.cacheRecords, CacheHeaders.NONE);
            }
          });
        } catch (Exception e) {
          logger.e(e, "Failed to cache response for subscription `%s`", subscription);
          return;
        }

        try {
          apolloStore.publish(cacheKeys);
        } catch (Exception e) {
          logger.e(e, "Failed to publish cache changes for subscription `%s`", subscription);
        }
      }
    });
  }

  private static final class SubscriptionManagerCallback<T> implements SubscriptionManager.Callback<T> {
    private Callback<T> originalCallback;
    private RealApolloSubscriptionCall<T> delegate;

    SubscriptionManagerCallback(Callback<T> originalCallback, RealApolloSubscriptionCall<T> delegate) {
      this.originalCallback = originalCallback;
      this.delegate = delegate;
    }

    @Override
    public void onResponse(@NotNull SubscriptionResponse<T> response) {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        delegate.cacheResponse(response);
        callback.onResponse(response.response);
      }
    }

    @Override
    public void onError(@NotNull ApolloSubscriptionException error) {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        callback.onFailure(error);
      }
      terminate();
    }

    @Override
    public void onNetworkError(@NotNull Throwable t) {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        callback.onFailure(new ApolloNetworkException("Subscription failed", t));
      }
      terminate();
    }

    @Override
    public void onCompleted() {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        callback.onCompleted();
      }
      terminate();
    }

    @Override
    public void onTerminated() {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        callback.onTerminated();
      }
      terminate();
    }

    @Override
    public void onConnected() {
      Callback<T> callback = this.originalCallback;
      if (callback != null) {
        callback.onConnected();
      }
    }

    void terminate() {
      RealApolloSubscriptionCall<T> delegate = this.delegate;
      if (delegate != null) {
        delegate.terminate();
      }
    }

    void release() {
      originalCallback = null;
      delegate = null;
    }
  }
}
