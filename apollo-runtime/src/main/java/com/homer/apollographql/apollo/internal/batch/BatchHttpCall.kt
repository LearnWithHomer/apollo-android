package com.homer.apollographql.apollo.internal.batch

/**
 * Interface to implement a single HTTP call capable of sending multiple queries at once
 */
interface BatchHttpCall {
  fun execute()
}