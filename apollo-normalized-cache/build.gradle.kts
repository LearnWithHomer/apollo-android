plugins {
  `java-library`
  kotlin("multiplatform")
}

kotlin {
  jvm {
    withJava()
  }

  sourceSets {
    val commonMain by getting {
      dependencies {
        api(project(":apollo-api"))
        api(project(":apollo-normalized-cache-api"))
      }
    }

    val jvmMain by getting {
      dependsOn(commonMain)
      dependencies {
        implementation(groovy.util.Eval.x(project, "x.dep.cache"))
      }
    }

    val jvmTest by getting {
      dependsOn(jvmMain)
      dependencies {
        implementation(groovy.util.Eval.x(project, "x.dep.junit"))
        implementation(groovy.util.Eval.x(project, "x.dep.truth"))
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

