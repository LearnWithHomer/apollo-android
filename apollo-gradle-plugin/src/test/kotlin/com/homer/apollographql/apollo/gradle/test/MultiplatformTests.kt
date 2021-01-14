package com.homer.apollographql.apollo.gradle.test

import com.homer.apollographql.apollo.gradle.util.TestUtils
import org.junit.Test

class MultiplatformTests {
  @Test
  fun `ios framework compiles`() {
    TestUtils.withTestProject("multiplatform") { dir ->
      TestUtils.executeTaskAndAssertSuccess(":linkDebugFrameworkIosArm64", dir)
    }
  }
}