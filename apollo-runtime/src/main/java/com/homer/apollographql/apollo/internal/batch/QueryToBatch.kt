package com.homer.apollographql.apollo.internal.batch

import com.homer.apollographql.apollo.interceptor.ApolloInterceptor

/**
 * Wrapper class holding a InterceptorRequest and its corresponding Callback
 */
data class QueryToBatch(
    val request: ApolloInterceptor.InterceptorRequest,
    val callback: ApolloInterceptor.CallBack
)