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
        api(groovy.util.Eval.x(project, "x.dep.okio"))
        api(groovy.util.Eval.x(project, "x.dep.uuid"))
        api(groovy.util.Eval.x(project, "x.dep.kotlin.coroutines"))
      }
    }

    val jvmMain by getting {
      dependsOn(commonMain)
      dependencies {
        api(groovy.util.Eval.x(project, "x.dep.okHttp.okHttp4"))
      }
    }
  }
}
