package com.homer.apollographql.apollo.cache.normalized.internal

import com.homer.apollographql.apollo.cache.CacheHeaders
import com.homer.apollographql.apollo.cache.normalized.Record

interface ReadableStore {
  fun read(key: String, cacheHeaders: CacheHeaders): Record?
  fun read(keys: Collection<String>, cacheHeaders: CacheHeaders): Collection<Record>
}
