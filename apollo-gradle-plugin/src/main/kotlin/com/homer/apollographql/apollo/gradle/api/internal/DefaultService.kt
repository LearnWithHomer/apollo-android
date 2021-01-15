package com.homer.apollographql.apollo.gradle.api.internal

import com.homer.apollographql.apollo.gradle.api.api.CompilerParams
import com.homer.apollographql.apollo.gradle.api.api.Introspection
import com.homer.apollographql.apollo.gradle.api.api.Service
import org.gradle.api.Action
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

open class DefaultService @Inject constructor(val objects: ObjectFactory, val name: String)
  : CompilerParams by objects.newInstance(DefaultCompilerParams::class.java), Service {

  override val schemaPath = objects.property(String::class.java)

  override val sourceFolder = objects.property(String::class.java)

  override val exclude = objects.listProperty(String::class.java)

  var introspection: DefaultIntrospection? = null

  override fun introspection(configure: Action<in Introspection>) {
    val introspection = objects.newInstance(DefaultIntrospection::class.java, objects)

    if (this.introspection != null) {
      throw IllegalArgumentException("there must be only one introspection block")
    }

    configure.execute(introspection)

    if (!introspection.endpointUrl.isPresent) {
      throw IllegalArgumentException("introspection must have a url")
    }

    this.introspection = introspection
  }
}
