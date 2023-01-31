package com.homer.apollographql.apollo.cache.normalized.internal

import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.ResponseField

interface CacheKeyBuilder {
  fun build(field: ResponseField, variables: Operation.Variables): String
}
