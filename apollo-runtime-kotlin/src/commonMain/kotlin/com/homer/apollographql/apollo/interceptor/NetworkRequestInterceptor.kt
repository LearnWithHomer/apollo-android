package com.homer.apollographql.apollo.interceptor

import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.Mutation
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.Query
import com.homer.apollographql.apollo.api.Subscription
import com.homer.apollographql.apollo.network.NetworkTransport
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

@ApolloExperimental
@ExperimentalCoroutinesApi
class NetworkRequestInterceptor(
    private val networkTransport: NetworkTransport,
    private val subscriptionNetworkTransport: NetworkTransport
) : ApolloRequestInterceptor {

  override fun <D : Operation.Data> intercept(request: ApolloRequest<D>, chain: ApolloInterceptorChain): Flow<ApolloResponse<D>> {
    return when (request.operation) {
      is Query -> networkTransport.execute(request = request, executionContext = request.executionContext)
      is Mutation -> networkTransport.execute(request = request, executionContext = request.executionContext)
      is Subscription -> subscriptionNetworkTransport.execute(request = request, executionContext = request.executionContext)
      else -> emptyFlow() // should never happen
    }
  }
}
