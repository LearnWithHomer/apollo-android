@file:Suppress("NOTHING_TO_INLINE")
@file:JvmName("KotlinExtensions")

package com.homer.apollographql.apollo.rx2

import com.homer.apollographql.apollo.ApolloCall
import com.homer.apollographql.apollo.ApolloClient
import com.homer.apollographql.apollo.ApolloMutationCall
import com.homer.apollographql.apollo.ApolloPrefetch
import com.homer.apollographql.apollo.ApolloQueryCall
import com.homer.apollographql.apollo.ApolloQueryWatcher
import com.homer.apollographql.apollo.ApolloSubscriptionCall
import com.homer.apollographql.apollo.api.Mutation
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.Query
import com.homer.apollographql.apollo.api.Response
import com.homer.apollographql.apollo.api.Subscription
import com.homer.apollographql.apollo.cache.normalized.ApolloStoreOperation
import io.reactivex.BackpressureStrategy
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.annotations.CheckReturnValue

@JvmSynthetic
@CheckReturnValue
inline fun com.homer.apollographql.apollo.ApolloPrefetch.rx(): Completable =
    com.homer.apollographql.apollo.rx2.Rx2Apollo.from(this)

@JvmSynthetic
@CheckReturnValue
inline fun <T> ApolloStoreOperation<T>.rx(): Single<T> =
    Rx2Apollo.from(this)

@JvmSynthetic
@CheckReturnValue
inline fun <T> com.homer.apollographql.apollo.ApolloQueryWatcher<T>.rx(): Observable<Response<T>> =
    com.homer.apollographql.apollo.rx2.Rx2Apollo.from(this)

@JvmSynthetic
@CheckReturnValue
inline fun <T> com.homer.apollographql.apollo.ApolloCall<T>.rx(): Observable<Response<T>> =
    com.homer.apollographql.apollo.rx2.Rx2Apollo.from(this)

@JvmSynthetic
@CheckReturnValue
inline fun <T> com.homer.apollographql.apollo.ApolloSubscriptionCall<T>.rx(
    backpressureStrategy: BackpressureStrategy = BackpressureStrategy.LATEST
): Flowable<Response<T>> = com.homer.apollographql.apollo.rx2.Rx2Apollo.from(this, backpressureStrategy)

/**
 * Creates a new [ApolloQueryCall] call and then converts it to an [Observable].
 *
 * The number of emissions this Observable will have is based on the
 * [com.homer.apollographql.apollo.fetcher.ResponseFetcher] used with the call.
 */
@JvmSynthetic
@CheckReturnValue
inline fun <D : Operation.Data, T, V : Operation.Variables> com.homer.apollographql.apollo.ApolloClient.rxQuery(
    query: Query<D, T, V>,
    configure: com.homer.apollographql.apollo.ApolloQueryCall<T>.() -> com.homer.apollographql.apollo.ApolloQueryCall<T> = { this }
): Observable<Response<T>> = query(query).configure().rx()

/**
 * Creates a new [ApolloMutationCall] call and then converts it to a [Single].
 */
@JvmSynthetic
@CheckReturnValue
inline fun <D : Operation.Data, T, V : Operation.Variables> com.homer.apollographql.apollo.ApolloClient.rxMutate(
    mutation: Mutation<D, T, V>,
    configure: com.homer.apollographql.apollo.ApolloMutationCall<T>.() -> com.homer.apollographql.apollo.ApolloMutationCall<T> = { this }
): Single<Response<T>> = mutate(mutation).configure().rx().singleOrError()

/**
 * Creates a new [ApolloMutationCall] call and then converts it to a [Single].
 *
 * Provided optimistic updates will be stored in [com.homer.apollographql.apollo.cache.normalized.ApolloStore]
 * immediately before mutation execution. Any [ApolloQueryWatcher] dependent on the changed cache records will
 * be re-fetched.
 */
@JvmSynthetic
@CheckReturnValue
inline fun <D : Operation.Data, T, V : Operation.Variables> com.homer.apollographql.apollo.ApolloClient.rxMutate(
    mutation: Mutation<D, T, V>,
    withOptimisticUpdates: D,
    configure: com.homer.apollographql.apollo.ApolloMutationCall<T>.() -> com.homer.apollographql.apollo.ApolloMutationCall<T> = { this }
): Single<Response<T>> = mutate(mutation, withOptimisticUpdates).configure().rx().singleOrError()

/**
 * Creates the [ApolloPrefetch] by wrapping the operation object inside and then converts it to a [Completable].
 */
@JvmSynthetic
@CheckReturnValue
inline fun <D : Operation.Data, T, V : Operation.Variables> com.homer.apollographql.apollo.ApolloClient.rxPrefetch(
    operation: Operation<D, T, V>
): Completable = prefetch(operation).rx()

/**
 * Creates a new [ApolloSubscriptionCall] call and then converts it to a [Flowable].
 *
 * Back-pressure strategy can be provided via [backpressureStrategy] parameter. The default value is [BackpressureStrategy.LATEST]
 */
@JvmSynthetic
@CheckReturnValue
inline fun <D : Operation.Data, T, V : Operation.Variables> com.homer.apollographql.apollo.ApolloClient.rxSubscribe(
    subscription: Subscription<D, T, V>,
    backpressureStrategy: BackpressureStrategy = BackpressureStrategy.LATEST
): Flowable<Response<T>> = subscribe(subscription).rx(backpressureStrategy)
