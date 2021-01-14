package com.homer.apollographql.apollo

import com.homer.apollographql.apollo.integration.normalizer.GetJsonScalarQuery
import com.homer.apollographql.apollo.Utils.cacheAndAssertCachedResponse
import com.homer.apollographql.apollo.Utils.immediateExecutor
import com.homer.apollographql.apollo.Utils.immediateExecutorService
import com.homer.apollographql.apollo.api.BigDecimal
import com.homer.apollographql.apollo.cache.normalized.lru.EvictionPolicy
import com.homer.apollographql.apollo.cache.normalized.lru.LruNormalizedCacheFactory
import com.google.common.truth.Truth.assertThat
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test

class JsonScalarTest {
    @Test
    @Throws(Exception::class)
    fun jsonScalar() {
        val server = MockWebServer()
        val okHttpClient = OkHttpClient.Builder()
                .dispatcher(Dispatcher(immediateExecutorService()))
                .build()

        val apolloClient = com.homer.apollographql.apollo.ApolloClient.builder()
                .serverUrl(server.url("/"))
                .okHttpClient(okHttpClient)
                .normalizedCache(LruNormalizedCacheFactory(EvictionPolicy.NO_EVICTION),
                    com.homer.apollographql.apollo.IdFieldCacheKeyResolver()
                )
                .dispatcher(immediateExecutor())
                .build()

        cacheAndAssertCachedResponse(
                server,
                "JsonScalar.json",
                apolloClient.query(GetJsonScalarQuery())
        ) { response ->
                assertThat(response.hasErrors()).isFalse()
            val expectedMap  = mapOf(
                    "obj" to mapOf( "key" to "value"),
                    "list" to listOf(BigDecimal(0), BigDecimal(1), BigDecimal(2))
            )
            assertThat(response.data!!.json()).isEqualTo(expectedMap)
            true
        }

        // Trigger a merge
        cacheAndAssertCachedResponse(
                server,
                "JsonScalarModified.json",
                apolloClient.query(GetJsonScalarQuery())
        ) { response ->
                assertThat(response.hasErrors()).isFalse()
            val expectedMap  = mapOf(
                    "obj" to mapOf( "key2" to "value2"),
                    )
            assertThat(response.data!!.json()).isEqualTo(expectedMap)
            true
        }
    }
}