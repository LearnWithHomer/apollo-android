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
        api(groovy.util.Eval.x(project, "x.dep.okio"))
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
  hiddenPackages += setOf("com.homer.apollographql.apollo.api.internal")
}

tasks.withType<Checkstyle> {
  exclude("**/BufferedSourceJsonReader.java")
  exclude("**/JsonScope.java")
  exclude("**/JsonUtf8Writer.java")
}

tasks.named("javadoc").configure {
  /**
   * Somehow Javadoc fails when I removed the `@JvmSynthetic` annotation from `InputFieldWriter.ListItemWriter.writeList`
   * It fails with `javadoc: error - String index out of range: -1`
   * Javadoc from JDK 13 works fine
   * I'm not sure how to fix it so this ignores the error. The uploaded javadoc.jar will be truncated and only contain the
   * classes that have been written successfully before Javadoc fails.
   */
  (this as Javadoc).isFailOnError = false
}
