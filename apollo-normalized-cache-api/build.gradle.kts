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

    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }

    val jvmTest by getting {
      dependsOn(jvmMain)
      dependencies {
        implementation(kotlin("test-junit"))
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

