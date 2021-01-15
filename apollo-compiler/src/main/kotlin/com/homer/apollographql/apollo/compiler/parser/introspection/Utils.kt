package com.homer.apollographql.apollo.compiler.parser.introspection

import com.homer.apollographql.apollo.compiler.parser.error.ParseException
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.Kind.LIST
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.Kind.NON_NULL
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.Type
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.Type.Interface
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.Type.Union
import com.homer.apollographql.apollo.compiler.parser.introspection.IntrospectionSchema.TypeRef

internal fun Type.possibleTypes(schema: IntrospectionSchema): Set<String> {
  return when (this) {
    is Union -> (possibleTypes ?: emptyList()).flatMap { typeRef ->
      val typeName = typeRef.rawType.name!!
      val schemaType = schema[typeName] ?: throw ParseException(
          message = "Unknown possible type `$typeName` for UNION `$name`"
      )
      schemaType.possibleTypes(schema)
    }.toSet()

    is Interface -> (possibleTypes ?: emptyList()).flatMap { typeRef ->
      val typeName = typeRef.rawType.name!!
      val schemaType = schema[typeName] ?: throw ParseException(
          message = "Unknown possible type `$typeName` for INTERFACE `$name`"
      )
      schemaType.possibleTypes(schema)
    }.toSet()

    else -> setOf(name)
  }
}

internal fun Type.isAssignableFrom(other: Type, schema: IntrospectionSchema): Boolean {
  return TypeRef(kind = kind, name = name)
      .isAssignableFrom(
          other = TypeRef(kind = other.kind, name = other.name),
          schema = schema
      )
}

internal fun TypeRef.asGraphQLType(): String {
  return when (kind) {
    NON_NULL -> "${ofType!!.asGraphQLType()}!"
    LIST -> "[${ofType!!.asGraphQLType()}]"
    else -> name!!
  }
}

internal fun TypeRef.isAssignableFrom(other: TypeRef, schema: IntrospectionSchema): Boolean {
  return when (kind) {
    NON_NULL -> {
      other.kind == NON_NULL && ofType!!.isAssignableFrom(other = other.ofType!!, schema = schema)
    }

    LIST -> {
      if (other.kind == NON_NULL) {
        isAssignableFrom(other = other.ofType!!, schema = schema)
      } else {
        other.kind == LIST && ofType!!.isAssignableFrom(other = other.ofType!!, schema = schema)
      }
    }

    else -> {
      if (other.kind == NON_NULL) {
        isAssignableFrom(other = other.ofType!!, schema = schema)
      } else {
        val possibleTypes = schema.resolveType(this).possibleTypes(schema)
        val otherPossibleTypes = schema.resolveType(other).possibleTypes(schema)
        possibleTypes.intersect(otherPossibleTypes).isNotEmpty()
      }
    }
  }
}

internal fun IntrospectionSchema.resolveType(graphqlType: String): TypeRef = when {
  graphqlType.startsWith("[") && graphqlType.endsWith("]") -> TypeRef(
      kind = LIST,
      ofType = resolveType(graphqlType.removeSurrounding(prefix = "[", suffix = "]"))
  )

  graphqlType.endsWith("!") -> TypeRef(
      kind = NON_NULL,
      ofType = resolveType(graphqlType.removeSuffix("!"))
  )

  else -> this[graphqlType]?.let {
    TypeRef(
        kind = it.kind,
        name = it.name
    )
  }
} ?: throw ParseException("Unknown type `$graphqlType`")

internal fun IntrospectionSchema.resolveType(typeRef: TypeRef): Type {
  return this[typeRef.name] ?: throw ParseException("Unknown type `${typeRef.name}`")
}

internal fun IntrospectionSchema.rootTypeForOperationType(operationType: String): String? {
  return when (operationType) {
    "query" -> queryType
    "mutation" -> mutationType
    "subscription" -> subscriptionType
    else -> null
  }
}
