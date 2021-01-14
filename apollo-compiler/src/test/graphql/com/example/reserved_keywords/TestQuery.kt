// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.reserved_keywords

import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.OperationName
import com.homer.apollographql.apollo.api.Query
import com.homer.apollographql.apollo.api.Response
import com.homer.apollographql.apollo.api.ResponseField
import com.homer.apollographql.apollo.api.ScalarTypeAdapters
import com.homer.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.homer.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.homer.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.homer.apollographql.apollo.api.internal.ResponseFieldMapper
import com.homer.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.homer.apollographql.apollo.api.internal.ResponseReader
import com.homer.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.homer.apollographql.apollo.api.internal.Throws
import com.example.reserved_keywords.type.CustomType
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
class TestQuery : Query<TestQuery.Data, TestQuery.Data, Operation.Variables> {
  override fun operationId(): String = OPERATION_ID
  override fun queryDocument(): String = QUERY_DOCUMENT
  override fun wrapData(data: Data?): Data? = data
  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES
  override fun name(): OperationName = OPERATION_NAME
  override fun responseFieldMapper(): ResponseFieldMapper<Data> = ResponseFieldMapper.invoke {
    Data(it)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters): Response<Data>
      = parse(Buffer().write(byteString), scalarTypeAdapters)

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<Data> = parse(source, DEFAULT)

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<Data> = parse(byteString, DEFAULT)

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString =
      OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = scalarTypeAdapters
  )

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  /**
   * A character from the Star Wars universe
   */
  data class Yield_(
    val __typename: String = "Character",
    /**
     * The ID of the character
     */
    val it_: String,
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Yield_.__typename)
      writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, this@Yield_.it_)
      writer.writeString(RESPONSE_FIELDS[2], this@Yield_.name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forCustomType("it", "id", null, false, CustomType.ID, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): Yield_ = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val it_ = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)!!
        val name = readString(RESPONSE_FIELDS[2])!!
        Yield_(
          __typename = __typename,
          it_ = it_,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Yield_> = ResponseFieldMapper { invoke(it) }
    }
  }

  interface ObjectSearchResult {
    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * A character from the Star Wars universe
   */
  data class AsCharacter(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) : ObjectSearchResult {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@AsCharacter.__typename)
      writer.writeString(RESPONSE_FIELDS[1], this@AsCharacter.name)
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forString("name", "name", null, false, null)
          )

      operator fun invoke(reader: ResponseReader): AsCharacter = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val name = readString(RESPONSE_FIELDS[1])!!
        AsCharacter(
          __typename = __typename,
          name = name
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<AsCharacter> = ResponseFieldMapper { invoke(it) }
    }
  }

  data class Object(
    val __typename: String = "SearchResult",
    val asCharacter: AsCharacter?
  ) {
    fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeString(RESPONSE_FIELDS[0], this@Object.__typename)
      writer.writeFragment(this@Object.asCharacter?.marshaller())
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forString("__typename", "__typename", null, false, null),
          ResponseField.forFragment("__typename", "__typename", listOf(
            ResponseField.Condition.typeCondition(arrayOf("Droid", "Human"))
          ))
          )

      operator fun invoke(reader: ResponseReader): Object = reader.run {
        val __typename = readString(RESPONSE_FIELDS[0])!!
        val asCharacter = readFragment<AsCharacter>(RESPONSE_FIELDS[1]) { reader ->
          AsCharacter(reader)
        }
        Object(
          __typename = __typename,
          asCharacter = asCharacter
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Object> = ResponseFieldMapper { invoke(it) }
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val yield_: Yield_?,
    val objects: List<Object?>?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller.invoke { writer ->
      writer.writeObject(RESPONSE_FIELDS[0], this@Data.yield_?.marshaller())
      writer.writeList(RESPONSE_FIELDS[1], this@Data.objects) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeObject(value?.marshaller())}
      }
    }

    fun objectsFilterNotNull(): List<Object>? = objects?.filterNotNull()

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField.forObject("yield", "hero", null, true, null),
          ResponseField.forList("objects", "search", mapOf<String, Any?>(
            "text" to "abc"), true, null)
          )

      operator fun invoke(reader: ResponseReader): Data = reader.run {
        val yield_ = readObject<Yield_>(RESPONSE_FIELDS[0]) { reader ->
          Yield_(reader)
        }
        val objects = readList<Object>(RESPONSE_FIELDS[1]) { reader ->
          reader.readObject<Object> { reader ->
            Object(reader)
          }
        }
        Data(
          yield_ = yield_,
          objects = objects
        )
      }

      @Suppress("FunctionName")
      fun Mapper(): ResponseFieldMapper<Data> = ResponseFieldMapper { invoke(it) }
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "47d23fa9d7e9bf697a19f43297b1c422ae31ce1886f740e3982a5daf9b7e1ebd"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  yield: hero {
          |    __typename
          |    it: id
          |    name
          |  }
          |  objects: search(text: "abc") {
          |    __typename
          |    ... on Character {
          |      name
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String = "TestQuery"
    }
  }
}
