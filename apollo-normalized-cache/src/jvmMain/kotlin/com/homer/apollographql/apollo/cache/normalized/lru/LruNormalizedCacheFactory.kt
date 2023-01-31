package com.homer.apollographql.apollo.cache.normalized.lru

import com.homer.apollographql.apollo.cache.normalized.NormalizedCacheFactory
import com.homer.apollographql.apollo.cache.normalized.RecordFieldJsonAdapter

class LruNormalizedCacheFactory(
    /**
     * [EvictionPolicy] to manage the primary cache.
     */
    private val evictionPolicy: EvictionPolicy
) : NormalizedCacheFactory<LruNormalizedCache>() {

  override fun create(recordFieldAdapter: RecordFieldJsonAdapter): LruNormalizedCache =
      LruNormalizedCache(evictionPolicy)

}
