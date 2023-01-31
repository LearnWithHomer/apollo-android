package com.homer.apollographql.apollo.internal.fetcher;

import com.homer.apollographql.apollo.api.internal.ApolloLogger;
import com.homer.apollographql.apollo.fetcher.ResponseFetcher;
import com.homer.apollographql.apollo.interceptor.ApolloInterceptor;
import com.homer.apollographql.apollo.interceptor.ApolloInterceptorChain;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executor;

/**
 * Signals the apollo client to <b>only</b> fetch the GraphQL data from the network. If network request fails, an
 * exception is thrown.
 */
public final class NetworkOnlyFetcher implements ResponseFetcher {

  @Override public ApolloInterceptor provideInterceptor(ApolloLogger apolloLogger) {
    return new NetworkOnlyInterceptor();
  }

  private static final class NetworkOnlyInterceptor implements ApolloInterceptor {
    @Override
    public void interceptAsync(@NotNull InterceptorRequest request, @NotNull ApolloInterceptorChain chain,
        @NotNull Executor dispatcher, @NotNull CallBack callBack) {
      InterceptorRequest networkRequest = request.toBuilder().fetchFromCache(false).build();
      chain.proceedAsync(networkRequest, dispatcher, callBack);
    }

    @Override public void dispose() {
    }
  }
}
