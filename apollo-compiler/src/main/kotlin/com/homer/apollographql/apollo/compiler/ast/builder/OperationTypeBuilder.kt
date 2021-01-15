package com.homer.apollographql.apollo.compiler.ast.builder

import com.homer.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.homer.apollographql.apollo.compiler.ast.InputType
import com.homer.apollographql.apollo.compiler.ast.InputType.Field
import com.homer.apollographql.apollo.compiler.ast.ObjectType
import com.homer.apollographql.apollo.compiler.ast.OperationType
import com.homer.apollographql.apollo.compiler.escapeKotlinReservedWord
import com.homer.apollographql.apollo.compiler.ir.Operation
import com.homer.apollographql.apollo.compiler.operationoutput.OperationOutput
import com.homer.apollographql.apollo.compiler.operationoutput.findOperationId

internal fun Operation.ast(
    operationClassName: String,
    context: Context,
    operationOutput: OperationOutput
): OperationType {
  val dataTypeRef = context.registerObjectType(
      name = "Data",
      schemaTypeName = "",
      description = "Data from the response after executing this GraphQL operation",
      fragmentRefs = fragments,
      inlineFragments = emptyList(),
      fields = fields,
      singularize = false,
      kind = ObjectType.Kind.Object
  )
  val operationType = when {
    isQuery() -> OperationType.Type.QUERY
    isMutation() -> OperationType.Type.MUTATION
    isSubscription() -> OperationType.Type.SUBSCRIPTION
    else -> throw IllegalArgumentException("Unsupported GraphQL operation type: $operationType")
  }

  val operationId = operationOutput.findOperationId(operationName, packageName)

  return OperationType(
      name = operationClassName,
      packageName = packageName,
      type = operationType,
      operationName = operationName,
      description = description,
      operationId = operationId,
      queryDocument = sourceWithFragments,
      variables = InputType(
          name = "Variables",
          description = "",
          fields = variables.map { variable ->
            Field(
                name = variable.name.decapitalize().escapeKotlinReservedWord(),
                schemaName = variable.name,
                type = resolveFieldType(
                    graphQLType = variable.type,
                    enums = context.enums,
                    customTypeMap = context.customTypeMap,
                    typesPackageName = context.typesPackageName
                ),
                isOptional = variable.optional(),
                defaultValue = null,
                description = ""
            )
          }
      ),
      data = dataTypeRef,
      nestedObjects = context,
      filePath = filePath
  )
}
