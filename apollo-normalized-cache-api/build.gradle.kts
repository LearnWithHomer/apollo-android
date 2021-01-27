plugins {
  `java-library`
  kotlin("multiplatform")
}

kotlin {
  jvm()
  
  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":apollo-api"))
        implementation(groovy.util.Eval.x(project, "x.dep.okio"))
        api(groovy.util.Eval.x(project, "x.dep.uuid"))
      }
    }

    val jvmMain by getting {
      dependsOn(commonMain)
      dependencies {
      }
    }
  }
}

metalava {
  hiddenPackages += setOf("com.homer.apollographql.apollo.cache.normalized.internal")
}

tasks.withType<Javadoc> {
  options.encoding = "UTF-8"
}

