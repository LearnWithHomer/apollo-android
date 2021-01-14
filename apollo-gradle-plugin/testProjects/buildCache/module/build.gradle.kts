plugins {
  kotlin("jvm")
  id("com.homer.apollographql.apollo")
}

apollo {
  generateKotlinModels.set(true)
}
