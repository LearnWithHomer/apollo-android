apply(plugin = "kotlin")
apply(plugin = "com.homer.apollographql.apollo")

configure<com.homer.apollographql.apollo.gradle.api.ApolloExtension> {
    generateKotlinModels.set(true)
}

dependencies {
    add("implementation","com.homer.apollographql.apollo:apollo-runtime:1.4.5")
}