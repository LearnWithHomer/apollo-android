package com.homer.apollographql.apollo

import com.homer.apollographql.apollo.Utils.mockResponse
import com.homer.apollographql.apollo.api.cache.http.HttpCachePolicy
import com.homer.apollographql.apollo.cache.http.ApolloHttpCache
import com.homer.apollographql.apollo.cache.http.DiskLruHttpCacheStore
import com.homer.apollographql.apollo.coroutines.await
import com.homer.apollographql.apollo.integration.httpcache.AllPlanetsQuery
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test
import java.io.File

class HttpCacheTestKotlin {
  private val response408 = MockResponse().setResponseCode(408).setBody("error")
  private val response200 = mockResponse("HttpCacheTestAllPlanets.json")

  @Test
  fun test408() {
    val cacheDir = File("build/integrationTestCache")
    cacheDir.deleteRecursively()
    val mockServer = MockWebServer()

    val apolloClient = ApolloClient
      .builder()
      .serverUrl(mockServer.url("/"))
      .httpCache(
        ApolloHttpCache(
          DiskLruHttpCacheStore(
            cacheDir,
            Long.MAX_VALUE
          )
        )
      )
      .defaultHttpCachePolicy(HttpCachePolicy.NETWORK_FIRST)
      .useHttpGetMethodForQueries(true)
      .useHttpGetMethodForPersistedQueries(true)
      .enableAutoPersistedQueries(true)
      .defaultHttpCachePolicy(HttpCachePolicy.NETWORK_FIRST)
      .build()

    runBlocking {
      mockServer.enqueue(response200)
      apolloClient.query(AllPlanetsQuery()).await()
      mockServer.enqueue(response408)
      mockServer.enqueue(response408)
      apolloClient.query(AllPlanetsQuery()).await()
    }
  }
}