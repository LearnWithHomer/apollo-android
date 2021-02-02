import com.homer.apollographql.apollo.gradle.api.ApolloExtension

buildscript {
  apply(from = "../../../gradle/dependencies.gradle")

  repositories {
    mavenCentral()
    maven {
      url = uri("../../../build/localMaven")
    }
  }
  dependencies {
    classpath(groovy.util.Eval.x(project, "x.dep.apollo.plugin"))
    classpath(groovy.util.Eval.x(project, "x.dep.kotlin.plugin"))
  }
}

apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "com.homer.apollographql.apollo")

repositories {
  mavenCentral()
  maven {
    url = uri("../../../../build/localMaven")
  }
}


