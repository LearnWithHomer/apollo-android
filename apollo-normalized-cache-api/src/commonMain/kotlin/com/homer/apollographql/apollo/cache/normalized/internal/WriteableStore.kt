package com.homer.apollographql.apollo.cache.normalized.internal

import com.homer.apollographql.apollo.cache.CacheHeaders
import com.homer.apollographql.apollo.cache.normalized.Record

interface WriteableStore : ReadableStore {
  
  fun merge(recordCollection: Collection<Record>, cacheHeaders: CacheHeaders): Set<String>
  fun merge(record: Record, cacheHeaders: CacheHeaders): Set<String>
}
