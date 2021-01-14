package com.homer.apollographql.apollo

import com.homer.apollographql.apollo.compiler.operationoutput.OperationOutput
import com.homer.apollographql.apollo.integration.httpcache.AllFilmsQuery
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import java.io.File

class OperationOutputTest {
  @Test
  fun operationOutputMatchesTheModels() {
    val operationOutputFile = File("build/generated/operationOutput/apollo/main/httpcache/operationOutput.json")
    val source = OperationOutput(operationOutputFile).values.first { it.name == "AllFilms"}.source
    assertThat(AllFilmsQuery.builder().build().queryDocument()).isEqualTo(source)
  }
}