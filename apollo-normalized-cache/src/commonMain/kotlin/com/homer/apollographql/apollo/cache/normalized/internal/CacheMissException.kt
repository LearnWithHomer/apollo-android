@file:Suppress("MemberVisibilityCanBePrivate")

package com.homer.apollographql.apollo.cache.normalized.internal

import com.homer.apollographql.apollo.cache.normalized.Record

class CacheMissException(
    val record: Record,
    val fieldName: String
) : IllegalStateException() {

  override val message: String
    get() = "Missing value: $fieldName for $record"
}
