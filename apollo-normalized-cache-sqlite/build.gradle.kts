plugins {
  id("com.android.library")
  kotlin("multiplatform")
  id("com.squareup.sqldelight")
}

sqldelight {
  database("ApolloDatabase") {
    packageName = "com.homer.apollographql.apollo.cache.normalized.sql"
    schemaOutputDirectory = file("src/main/sqldelight/schemas")
  }
}

kotlin {
   android {
    publishAllLibraryVariants()
  }
  jvm()

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
        implementation(groovy.util.Eval.x(project, "x.dep.sqldelight.jvm"))
      }
    }

    val androidMain by getting {
      dependsOn(commonMain)
      dependencies {
        api(groovy.util.Eval.x(project, "x.dep.androidx.sqlite"))
        implementation(groovy.util.Eval.x(project, "x.dep.sqldelight.android"))
        implementation(groovy.util.Eval.x(project, "x.dep.androidx.sqliteFramework"))
      }
    }
  }
}

android {
  compileSdkVersion(groovy.util.Eval.x(project, "x.androidConfig.compileSdkVersion").toString().toInt())

  lintOptions {
    textReport = true
    textOutput("stdout")
    ignore("InvalidPackage")
  }

  defaultConfig {
    minSdkVersion(groovy.util.Eval.x(project, "x.androidConfig.minSdkVersion").toString())
    targetSdkVersion(groovy.util.Eval.x(project, "x.androidConfig.targetSdkVersion").toString())
  }
}


tasks.withType<Javadoc> {
  options.encoding = "UTF-8"
}

