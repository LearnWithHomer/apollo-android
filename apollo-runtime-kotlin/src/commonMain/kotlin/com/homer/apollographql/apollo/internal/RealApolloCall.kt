package com.homer.apollographql.apollo.internal

import com.homer.apollographql.apollo.ApolloMutationCall
import com.homer.apollographql.apollo.ApolloQueryCall
import com.homer.apollographql.apollo.ApolloSubscriptionCall
import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.ExecutionContext
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.Response
import com.homer.apollographql.apollo.api.ScalarTypeAdapters
import com.homer.apollographql.apollo.interceptor.ApolloRequest
import com.homer.apollographql.apollo.interceptor.ApolloRequestInterceptor
import com.homer.apollographql.apollo.interceptor.RealInterceptorChain
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow

@ApolloExperimental
@ExperimentalCoroutinesApi
class RealApolloCall<D : Operation.Data> constructor(
    private val operation: Operation<D, D, *>,
    private val scalarTypeAdapters: ScalarTypeAdapters,
    private val interceptors: List<ApolloRequestInterceptor>,
    private val executionContext: ExecutionContext
) : ApolloQueryCall<D>, ApolloMutationCall<D>, ApolloSubscriptionCall<D> {

  @ApolloExperimental
  override fun execute(executionContext: ExecutionContext): Flow<Response<D>> {
    val request = ApolloRequest(
        operation = operation,
        scalarTypeAdapters = scalarTypeAdapters,
        executionContext = this.executionContext + executionContext
    )
    return flow {
      emit(RealInterceptorChain(interceptors))
    }.flatMapLatest { interceptorChain ->
      interceptorChain.proceed(request)
    }.map { apolloResponse ->
      apolloResponse.response
    }
  }
}
