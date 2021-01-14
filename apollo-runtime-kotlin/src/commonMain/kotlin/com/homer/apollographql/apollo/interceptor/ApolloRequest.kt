package com.homer.apollographql.apollo.interceptor

import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.ExecutionContext
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.ScalarTypeAdapters
import com.benasher44.uuid.uuid4

@ApolloExperimental
class ApolloRequest<D : Operation.Data>(
    val operation: Operation<D, D, *>,
    val scalarTypeAdapters: ScalarTypeAdapters,
    val executionContext: ExecutionContext
) {
  val requestUuid = uuid4()
}
