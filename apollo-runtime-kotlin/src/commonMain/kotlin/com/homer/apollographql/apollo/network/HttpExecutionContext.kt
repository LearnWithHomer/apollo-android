package com.homer.apollographql.apollo.network

import com.homer.apollographql.apollo.api.ApolloExperimental
import com.homer.apollographql.apollo.api.ExecutionContext

@ApolloExperimental
sealed class HttpExecutionContext {

  data class Request(val headers: Map<String, String>) : ExecutionContext.Element {
    override val key: ExecutionContext.Key<*> = Key

    companion object Key : ExecutionContext.Key<Request>
  }

  data class Response(
      val statusCode: Int,
      val headers: Map<String, String>
  ) : ExecutionContext.Element {
    override val key: ExecutionContext.Key<*> = Key

    companion object Key : ExecutionContext.Key<Response>
  }
}
