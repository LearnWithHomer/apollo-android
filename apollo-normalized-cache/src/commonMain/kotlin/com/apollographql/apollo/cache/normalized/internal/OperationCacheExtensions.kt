package com.apollographql.apollo.cache.normalized.internal

import com.apollographql.apollo.api.CustomScalarAdapters
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.MapResponseParser
import com.apollographql.apollo.api.internal.MapResponseReader
import com.apollographql.apollo.api.internal.StreamResponseReader
import com.apollographql.apollo.cache.normalized.Record
import com.apollographql.apollo.api.internal.response.RealResponseWriter
import com.apollographql.apollo.cache.CacheHeaders
import com.apollographql.apollo.cache.normalized.CacheKey
import com.apollographql.apollo.cache.normalized.CacheKeyResolver

fun <D : Operation.Data> Operation<D>.normalize(
    data: D,
    customScalarAdapters: CustomScalarAdapters,
    normalizer: ResponseNormalizer<Map<String, Any>?>
): Set<Record> {
  val writer = RealResponseWriter(variables(), customScalarAdapters)
  adapter().toResponse(writer, data)
  normalizer.willResolveRootQuery(this)
  writer.resolveFields(normalizer)
  return normalizer.records().toSet()
}

fun <D : Operation.Data> Operation<D>.readDataFromCache(
    customScalarAdapters: CustomScalarAdapters,
    readableStore: ReadableStore,
    cacheKeyResolver: CacheKeyResolver,
    cacheHeaders: CacheHeaders,
): D? {
  return try {
    val cacheKeyBuilder = RealCacheKeyBuilder()
    val rootRecord = readableStore.read(CacheKeyResolver.rootKeyForOperation(this).key, cacheHeaders) ?: return null
    val fieldValueResolver = CacheValueResolver(
        readableStore,
        variables(),
        cacheKeyResolver,
        cacheHeaders,
        cacheKeyBuilder)

    val reader = MapResponseReader(
        root = rootRecord,
        variable = variables(),
        valueResolver = fieldValueResolver,
        customScalarAdapters = customScalarAdapters,
    )

    adapter().fromResponse(reader)
  } catch (e: Exception) {
    e.printStackTrace()
    null
  }
}

fun <D : Operation.Data> Operation<D>.streamDataFromCache(
    customScalarAdapters: CustomScalarAdapters,
    readableStore: ReadableStore,
    cacheKeyResolver: CacheKeyResolver,
    cacheHeaders: CacheHeaders,
): D? {
  return try {
    val cacheKeyBuilder = RealCacheKeyBuilder()
    val jsonReader = CacheJsonReader(
        rootKey = CacheKeyResolver.rootKeyForOperation(this).key,
        readableCache = readableStore,
        cacheHeaders = cacheHeaders,
    )
    val reader = StreamResponseReader(
        jsonReader = jsonReader,
        variables = variables(),
        customScalarAdapters = customScalarAdapters,
    ) { field ->
      var cacheKey = CacheKey.NO_KEY
      if (field.type == ResponseField.Type.OBJECT) {
        // this could be a CacheReference,
        cacheKey = cacheKeyResolver.fromFieldArguments(field, variables())
      }
      if (cacheKey != CacheKey.NO_KEY) {
        cacheKey.key
      } else {
        cacheKeyBuilder.build(field, variables())
      }
    }

    jsonReader.beginObject()
    adapter().fromResponse(reader)
  } catch (e: Exception) {
    e.printStackTrace()
    null
  }
}
fun Set<Record>?.dependentKeys(): Set<String> {
  return this?.flatMap {
    it.keys() + it.key
  }?.toSet() ?: emptySet()
}
