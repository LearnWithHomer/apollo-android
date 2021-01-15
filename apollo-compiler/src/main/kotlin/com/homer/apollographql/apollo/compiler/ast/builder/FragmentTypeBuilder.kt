package com.homer.apollographql.apollo.compiler.ast.builder

import com.homer.apollographql.apollo.compiler.ast.FieldType
import com.homer.apollographql.apollo.compiler.ast.FragmentType
import com.homer.apollographql.apollo.compiler.ast.ObjectType
import com.homer.apollographql.apollo.compiler.ast.ObjectType.Field
import com.homer.apollographql.apollo.compiler.ast.ObjectType.Field.Condition.Directive
import com.homer.apollographql.apollo.compiler.ast.ObjectType.Field.Condition.Type
import com.homer.apollographql.apollo.compiler.ast.ObjectType.Kind.Object
import com.homer.apollographql.apollo.compiler.ast.TypeRef
import com.homer.apollographql.apollo.compiler.escapeKotlinReservedWord
import com.homer.apollographql.apollo.compiler.ir.Condition.Kind.BOOLEAN
import com.homer.apollographql.apollo.compiler.ir.Fragment
import com.homer.apollographql.apollo.compiler.ir.FragmentRef

internal fun Fragment.ast(context: Context): FragmentType {
  val typeRef = context.registerObjectType(
      name = fragmentName.capitalize().escapeKotlinReservedWord(),
      schemaTypeName = typeCondition,
      description = description,
      fragmentRefs = fragmentRefs,
      inlineFragments = emptyList(),
      fields = fields,
      singularize = false,
      kind = ObjectType.Kind.Fragment(
          definition = source,
          possibleTypes = possibleTypes
      )
  )
  val inlineFragmentFields = if (inlineFragments.isNotEmpty()) {
    val inlineFragmentSuper = context.registerInlineFragmentSuper(
        type = fragmentName,
        schemaType = typeCondition
    )
    inlineFragments.map {
      it.inlineFragmentField(
          context = context,
          fragmentSuper = inlineFragmentSuper
      )
    }
  } else emptyList()
  val nestedObjects = context.minus(typeRef)
  return context[typeRef]!!.run {
    FragmentType(
        packageName = packageName,
        objectType = copy(
            fields = fields + inlineFragmentFields,
            nestedObjects = nestedObjects
        )
    )
  }
}

internal fun Map<FragmentRef, Fragment>.astFragmentsObjectFieldType(
    parentFieldSchemaTypeName: String
): Pair<ObjectType.Field?, ObjectType?> {
  if (isEmpty()) {
    return null to null
  }
  val type = ObjectType(
      name = "Fragments",
      schemaTypeName = "",
      description = "",
      fields = map { (fragmentRef, fragment) ->
        val isOptional = fragmentRef.conditions.isNotEmpty() || fragment.typeCondition != parentFieldSchemaTypeName
        val possibleTypes = fragment.takeIf { fragment.typeCondition != parentFieldSchemaTypeName }?.possibleTypes ?: emptyList()
        Field(
            name = fragment.fragmentName.decapitalize().escapeKotlinReservedWord(),
            responseName = "__typename",
            schemaName = "__typename",
            type = FieldType.Fragment(
                TypeRef(
                name = fragment.fragmentName.capitalize(),
                packageName = fragment.packageName
            )
            ),
            description = "",
            isOptional = isOptional,
            deprecationReason = null,
            arguments = emptyMap(),
            conditions = fragmentRef.conditions
                .filter { condition -> condition.kind == BOOLEAN.rawValue }
                .map { condition ->
                  Directive(
                      variableName = condition.variableName,
                      inverted = condition.inverted
                  )
                }.let { conditions ->
                  if (possibleTypes.isNotEmpty()) {
                    conditions + Type(possibleTypes)
                  } else {
                    conditions
                  }
                }
        )
      },
      fragmentsType = null,
      kind = Object
  )
  val field = ObjectType.Field(
      name = type.name.decapitalize().escapeKotlinReservedWord(),
      responseName = "__typename",
      schemaName = "__typename",
      type = FieldType.Fragments(
          name = type.name,
          fields = type.fields.map { field ->
            FieldType.Fragments.Field(
                name = field.name,
                type = (field.type as FieldType.Fragment).typeRef,
                isOptional = field.isOptional
            )
          }
      ),
      description = "",
      isOptional = false,
      deprecationReason = null,
      arguments = emptyMap(),
      conditions = emptyList()
  )
  return field to type
}
