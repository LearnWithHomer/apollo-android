// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment_with_nested_fragments.fragment

import com.homer.apollographql.apollo.api.GraphqlFragment
import com.homer.apollographql.apollo.api.ResponseField
import com.homer.apollographql.apollo.api.internal.ResponseFieldMapper
import com.homer.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.homer.apollographql.apollo.api.internal.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class DroidFragment(
  val __typename: String = "Droid",
  /**
   * What others call this droid
   */
  val name: String,
  /**
   * This droid's primary function
   */
  val primaryFunction: String?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
    writer.writeString(RESPONSE_FIELDS[0], this@DroidFragment.__typename)
    writer.writeString(RESPONSE_FIELDS[1], this@DroidFragment.name)
    writer.writeString(RESPONSE_FIELDS[2], this@DroidFragment.primaryFunction)
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forString("primaryFunction", "primaryFunction", null, true, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment droidFragment on Droid {
        |  __typename
        |  name
        |  primaryFunction
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): DroidFragment = reader.run {
      val __typename = readString(RESPONSE_FIELDS[0])!!
      val name = readString(RESPONSE_FIELDS[1])!!
      val primaryFunction = readString(RESPONSE_FIELDS[2])
      DroidFragment(
        __typename = __typename,
        name = name,
        primaryFunction = primaryFunction
      )
    }

    @Suppress("FunctionName")
    fun Mapper(): ResponseFieldMapper<DroidFragment> = ResponseFieldMapper { invoke(it) }
  }
}
