import com.homer.apollographql.apollo.gradle.api.ApolloExtension

apply(plugin = "com.homer.apollographql.apollo")
apply(plugin = "org.jetbrains.kotlin.jvm")

dependencies {
  add("implementation", groovy.util.Eval.x(project, "x.dep.kotlin.coroutines"))

  add("implementation", "com.homer.apollographql.apollo:apollo-runtime")
  add("implementation", "com.homer.apollographql.apollo:apollo-rx2-support")
  add("implementation", "com.homer.apollographql.apollo:apollo-rx3-support")
  add("implementation", "com.homer.apollographql.apollo:apollo-coroutines-support")
  add("implementation", "com.homer.apollographql.apollo:apollo-http-cache")
  add("implementation", "com.homer.apollographql.apollo:apollo-normalized-cache-sqlite")
  add("implementation", "com.homer.apollographql.apollo:apollo-compiler")

  add("testImplementation", kotlin("test-junit"))
  add("testImplementation", groovy.util.Eval.x(project, "x.dep.junit"))
  add("testImplementation", groovy.util.Eval.x(project, "x.dep.truth"))
  add("testImplementation", groovy.util.Eval.x(project, "x.dep.okHttp.mockWebServer"))
  add("testImplementation", groovy.util.Eval.x(project, "x.dep.mockito"))
  add("testImplementation", groovy.util.Eval.x(project, "x.dep.moshi.moshi"))
}

configure<ApolloExtension> {
  customTypeMapping.set(mapOf(
      "Date" to "java.util.Date",
      "Upload" to "com.homer.apollographql.apollo.api.FileUpload"
  ))
  generateOperationOutput.set(true)
  service("httpcache") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/httpcache")
    rootPackageName.set("com.homer.apollographql.apollo.integration.httpcache")
  }
  service("interceptor") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/interceptor")
    rootPackageName.set("com.homer.apollographql.apollo.integration.interceptor")
  }
  service("normalizer") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/normalizer")
    rootPackageName.set("com.homer.apollographql.apollo.integration.normalizer")
  }
  service("upload") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/upload")
    rootPackageName.set("com.homer.apollographql.apollo.integration.upload")
  }
  service("subscription") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/subscription")
    rootPackageName.set("com.homer.apollographql.apollo.integration.subscription")
  }
  service("performance") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/performance")
    rootPackageName.set("com.homer.apollographql.apollo.integration.performance")
  }
  service("directives") {
    sourceFolder.set("com/homer.apollographql/apollo/integration/directives")
    rootPackageName.set("com.homer.apollographql.apollo.integration.directives")
    generateKotlinModels.set(true)
  }
  service("sealedclasses") {
    sealedClassesForEnumsMatching.set(listOf(".*"))
    generateKotlinModels.set(true)
    sourceFolder.set("com/homer.apollographql/apollo/integration/sealedclasses")
    rootPackageName.set("com.homer.apollographql.apollo.integration.sealedclasses")
  }
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
  kotlinOptions {
    freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.RequiresOptIn"
  }
}

tasks.withType(Test::class.java) {
  if (System.getProperty("runPerformanceTests") == null) {
    // Exclude performance test from CI as they take some time and their results wouldn't have a lot of meaning since the instances
    // where tests run can change without warning.
    exclude("**/performance/**")
  } else {
    // Enable some GC monitoring tools
    jvmArgs = listOf("-verbose:gc", "-Xloggc:gc.log", "-XX:+PrintGC", "-XX:+PrintGCDetails", "-XX:+PrintGCTimeStamps")
  }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_1_8.toString()
  }
}