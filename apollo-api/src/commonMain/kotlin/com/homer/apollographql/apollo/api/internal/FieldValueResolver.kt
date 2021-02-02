package com.homer.apollographql.apollo.api.internal

import com.homer.apollographql.apollo.api.ResponseField

interface FieldValueResolver<R> {
  fun <T> valueFor(recordSet: R, field: ResponseField): T?
}
