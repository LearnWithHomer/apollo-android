package com.homer.apollographql.apollo

import com.homer.apollographql.apollo.Utils.immediateExecutor
import com.homer.apollographql.apollo.Utils.immediateExecutorService
import com.homer.apollographql.apollo.Utils.readFileToString
import com.homer.apollographql.apollo.api.Input.Companion.fromNullable
import com.homer.apollographql.apollo.api.Response
import com.homer.apollographql.apollo.cache.http.ApolloHttpCache
import com.homer.apollographql.apollo.cache.http.DiskLruHttpCacheStore
import com.homer.apollographql.apollo.exception.ApolloCanceledException
import com.homer.apollographql.apollo.exception.ApolloException
import com.homer.apollographql.apollo.integration.normalizer.EpisodeHeroNameQuery
import com.homer.apollographql.apollo.integration.normalizer.type.Episode
import com.google.common.truth.Truth
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import kotlin.test.fail

class ApolloCancelCallTest {
  private lateinit var apolloClient: com.homer.apollographql.apollo.ApolloClient
  private lateinit var cacheStore: com.homer.apollographql.apollo.MockHttpCacheStore

  @get:Rule
  val server = MockWebServer()

  @Before
  fun setup() {
    cacheStore = com.homer.apollographql.apollo.MockHttpCacheStore()
    cacheStore.delegate =
      com.homer.apollographql.apollo.cache.http.DiskLruHttpCacheStore(
          com.homer.apollographql.apollo.InMemoryFileSystem(), File("/cache/"),
          Int.MAX_VALUE.toLong()
      )

    val okHttpClient = OkHttpClient.Builder()
        .dispatcher(Dispatcher(immediateExecutorService()))
        .build()
    apolloClient = com.homer.apollographql.apollo.ApolloClient.builder()
        .serverUrl(server.url("/"))
        .okHttpClient(okHttpClient)
        .httpCache(
            com.homer.apollographql.apollo.cache.http.ApolloHttpCache(
                cacheStore, null
            )
        )
        .build()
  }

  class TestableCallback<T> : com.homer.apollographql.apollo.ApolloCall.Callback<T>() {
    val lock = Object()
    var completed = false
    val responses = mutableListOf<Response<T>>()
    val errors = mutableListOf<ApolloException>()

    override fun onResponse(response: Response<T>) {
      synchronized(lock) {
        responses.add(response)
      }
    }

    override fun onFailure(e: ApolloException) {
      synchronized(lock) {
        errors.add(e)

        // Runtime doesn't send the COMPLETED status event
        completed = true
        lock.notifyAll()
      }
    }

    override fun onStatusEvent(event: com.homer.apollographql.apollo.ApolloCall.StatusEvent) {
      super.onStatusEvent(event)
      if (event == com.homer.apollographql.apollo.ApolloCall.StatusEvent.COMPLETED) {
        synchronized(lock) {
          completed = true
          lock.notifyAll()
        }
      }
    }

    fun waitForCompletion(timeoutDuration: Long, unit: TimeUnit) {
      val start = System.currentTimeMillis()
      while (true) {
        val timeoutMillis = TimeUnit.MILLISECONDS.convert(timeoutDuration, unit) - (System.currentTimeMillis() - start)
        if (timeoutMillis < 0) {
          throw TimeoutException("Timeout reached")
        }
        if (completed) {
          break
        }
        synchronized(lock) {
          try {
            lock.wait(timeoutMillis)
          } catch (e: InterruptedException) {

          }
        }
      }
    }
  }

  class TestablePrefetchCallback : com.homer.apollographql.apollo.ApolloPrefetch.Callback() {
    val lock = Object()
    var completed = false
    val errors = mutableListOf<ApolloException>()


    override fun onFailure(e: ApolloException) {
      synchronized(lock) {
        errors.add(e)

        // Runtime doesn't send the COMPLETED status event
        completed = true
        lock.notifyAll()
      }
    }

    override fun onSuccess() {
      synchronized(lock) {
        completed = true
        lock.notifyAll()
      }
    }

    fun waitForCompletion(timeoutDuration: Long, unit: TimeUnit) {
      val start = System.currentTimeMillis()
      while (true) {
        val timeoutMillis = TimeUnit.MILLISECONDS.convert(timeoutDuration, unit) - (System.currentTimeMillis() - start)
        if (timeoutMillis < 0) {
          throw TimeoutException("Timeout reached")
        }
        if (completed) {
          break
        }
        synchronized(lock) {
          try {
            lock.wait(timeoutMillis)
          } catch (e: InterruptedException) {

          }
        }
      }
    }
  }

  @Test
  @Throws(Exception::class)
  fun cancelCallBeforeEnqueueCanceledException() {
    server.enqueue(mockResponse("EpisodeHeroNameResponse.json"))
    val call: com.homer.apollographql.apollo.ApolloCall<EpisodeHeroNameQuery.Data> = apolloClient.query(EpisodeHeroNameQuery(fromNullable(Episode.EMPIRE)))

    val callback = TestableCallback<EpisodeHeroNameQuery.Data>()

    call.cancel()
    call.enqueue(callback)

    callback.waitForCompletion(1, TimeUnit.SECONDS)
    Truth.assertThat(callback.responses.size).isEqualTo(0)
    Truth.assertThat(callback.errors.size).isEqualTo(1)
    Truth.assertThat(callback.errors[0]).isInstanceOf(
        com.homer.apollographql.apollo.exception.ApolloCanceledException::class.java)
  }

  @Test
  @Throws(Exception::class)
  fun cancelCallAfterEnqueueNoCallback() {
    val okHttpClient = OkHttpClient.Builder()
        .dispatcher(Dispatcher(immediateExecutorService()))
        .build()
    apolloClient = com.homer.apollographql.apollo.ApolloClient.builder()
        .serverUrl(server.url("/"))
        .okHttpClient(okHttpClient)
        .httpCache(
            com.homer.apollographql.apollo.cache.http.ApolloHttpCache(
                cacheStore, null
            )
        )
        .build()
    server.enqueue(mockResponse("EpisodeHeroNameResponse.json").setHeadersDelay(500, TimeUnit.MILLISECONDS))
    val call: com.homer.apollographql.apollo.ApolloCall<EpisodeHeroNameQuery.Data> = apolloClient.query(EpisodeHeroNameQuery(fromNullable(Episode.EMPIRE)))

    val callback = TestableCallback<EpisodeHeroNameQuery.Data>()

    call.enqueue(callback)
    call.cancel()

    try {
      callback.waitForCompletion(1, TimeUnit.SECONDS)
      fail("TimeoutException expected")
    } catch (e: TimeoutException) {

    }
    Truth.assertThat(callback.responses.size).isEqualTo(0)
    Truth.assertThat(callback.errors.size).isEqualTo(0)
  }

  @Test
  @Throws(Exception::class)
  fun cancelPrefetchBeforeEnqueueCanceledException() {
    server.enqueue(mockResponse("EpisodeHeroNameResponse.json"))
    val call = apolloClient.prefetch(EpisodeHeroNameQuery(fromNullable(Episode.EMPIRE)))

    val callback = TestablePrefetchCallback()

    call.cancel()
    call.enqueue(callback)

    callback.waitForCompletion(1, TimeUnit.SECONDS)
    Truth.assertThat(callback.errors.size).isEqualTo(1)
    Truth.assertThat(callback.errors[0]).isInstanceOf(
        com.homer.apollographql.apollo.exception.ApolloCanceledException::class.java)
  }

  @Test
  @Throws(Exception::class)
  fun cancelPrefetchAfterEnqueueNoCallback() {
    server.enqueue(mockResponse("EpisodeHeroNameResponse.json").setHeadersDelay(500, TimeUnit.MILLISECONDS))
    val call = apolloClient.prefetch(EpisodeHeroNameQuery(fromNullable(Episode.EMPIRE)))

    val callback = TestablePrefetchCallback()

    call.enqueue(callback)
    call.cancel()

    try {
      callback.waitForCompletion(1, TimeUnit.SECONDS)
      fail("TimeoutException expected")
    } catch (e: TimeoutException) {

    }
    Truth.assertThat(callback.errors.size).isEqualTo(0)
  }

  @Throws(IOException::class)
  private fun mockResponse(fileName: String): MockResponse {
    return MockResponse().setChunkedBody(readFileToString(javaClass, "/$fileName"), 32)
  }
}