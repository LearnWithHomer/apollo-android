package com.homer.apollographql.apollo.internal.batch

/**
 * Factory interface to create [BatchHttpCallImpl] instances
 */
interface BatchHttpCallFactory {
  fun createBatchHttpCall(batch: List<QueryToBatch>): BatchHttpCall
}
