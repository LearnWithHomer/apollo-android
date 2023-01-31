package com.homer.apollographql.apollo.compiler.ir

import com.squareup.javapoet.TypeSpec

interface CodeGenerator {
  fun toTypeSpec(context: CodeGenerationContext, abstract: Boolean = false): TypeSpec
}
