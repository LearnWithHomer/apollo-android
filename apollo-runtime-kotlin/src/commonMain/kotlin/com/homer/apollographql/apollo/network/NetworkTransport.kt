package com.homer.apollographql.apollo.network

import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.ExecutionContext
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.interceptor.ApolloRequest
import com.homer.apollographql.apollo.interceptor.ApolloResponse
import kotlinx.coroutines.flow.Flow

@ApolloExperimental
interface NetworkTransport {

  fun <D : Operation.Data> execute(request: ApolloRequest<D>, executionContext: ExecutionContext): Flow<ApolloResponse<D>>
}
