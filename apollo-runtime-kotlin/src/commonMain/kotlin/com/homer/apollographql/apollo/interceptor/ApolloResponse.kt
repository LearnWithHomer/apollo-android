package com.homer.apollographql.apollo.interceptor

import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.ExecutionContext
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.Response
import com.benasher44.uuid.Uuid

@ApolloExperimental
class ApolloResponse<D : Operation.Data>(
  val requestUuid: Uuid,
  val response: Response<D>,
  val executionContext: ExecutionContext
)
