package com.homer.apollographql.apollo.compiler

import com.homer.apollographql.apollo.api.internal.InputFieldWriter
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.BOOLEAN
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.CUSTOM
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.DOUBLE
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.ENUM
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.INT
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.LIST
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.LONG
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.OBJECT
import com.homer.apollographql.apollo.compiler.InputFieldSpec.Type.STRING
import com.homer.apollographql.apollo.compiler.NullableValueType.INPUT_TYPE
import com.homer.apollographql.apollo.compiler.ir.CodeGenerationContext
import com.squareup.javapoet.*
import java.io.IOException
import java.util.*
import javax.lang.model.element.Modifier

class InputFieldSpec(
    val type: Type,
    val name: String,
    val graphQLType: String,
    val javaType: TypeName,
    val context: CodeGenerationContext
) {
  private val normalizedName = name.decapitalize().escapeJavaReservedWord()

  fun writeValueCode(writerParam: CodeBlock, marshaller: CodeBlock): CodeBlock {
    return when (type) {
      STRING,
      INT,
      LONG,
      DOUBLE,
      BOOLEAN -> writeScalarCode(writerParam)
      ENUM -> writeEnumCode(writerParam)
      CUSTOM -> writeCustomCode(writerParam)
      OBJECT -> writeObjectCode(writerParam, marshaller)
      LIST -> writeList(writerParam, marshaller)
    }.let {
      if (javaType.isOptional()) {
        CodeBlock.builder()
            .beginControlFlow("if (\$L.defined)", normalizedName)
            .add(it)
            .endControlFlow()
            .build()
      } else {
        it
      }
    }
  }

  private fun writeScalarCode(writerParam: CodeBlock): CodeBlock {
    val valueCode = javaType.unwrapOptionalValue(varName = normalizedName, checkIfPresent = false)
    return CodeBlock.of("\$L.\$L(\$S, \$L);\n", writerParam, WRITE_METHODS[type], name, valueCode)
  }

  private fun writeEnumCode(writerParam: CodeBlock): CodeBlock {
    val valueCode = javaType.unwrapOptionalValue(normalizedName) {
      CodeBlock.of("\$L.rawValue()", it)
    }
    return CodeBlock.of("\$L.\$L(\$S, \$L);\n", writerParam, WRITE_METHODS[type], name, valueCode)
  }

  private fun writeCustomCode(writerParam: CodeBlock): CodeBlock {
    val customScalarEnum = CustomEnumTypeSpecBuilder.className(context)
    val customScalarEnumConst = normalizeGraphQlType(graphQLType).toUpperCase(Locale.ENGLISH)
    val valueCode = javaType.unwrapOptionalValue(normalizedName)
    return CodeBlock.of("\$L.\$L(\$S, \$L.\$L, \$L);\n", writerParam, WRITE_METHODS[type],
        name, customScalarEnum, customScalarEnumConst, valueCode)
  }

  private fun writeObjectCode(writerParam: CodeBlock, marshaller: CodeBlock): CodeBlock {
    val valueCode = javaType.unwrapOptionalValue(normalizedName) {
      CodeBlock.of("\$L.\$L", it, marshaller)
    }
    return CodeBlock.of("\$L.\$L(\$S, \$L);\n", writerParam, WRITE_METHODS[type], name, valueCode)
  }

  private fun writeList(writerParam: CodeBlock, marshaller: CodeBlock): CodeBlock {
    val unwrappedListValue = javaType.unwrapOptionalValue(normalizedName, false)
    val listParamType = with(javaType.unwrapOptionalType(true)) { if (isList()) listParamType() else this }
    val listWriterCode = javaType.unwrapOptionalValue(normalizedName) {
      CodeBlock.of("\$L", listWriter(listParamType, unwrappedListValue, "\$item", marshaller))
    }
    return CodeBlock.of("\$L.\$L(\$S, \$L);\n", writerParam, WRITE_METHODS[LIST], name, listWriterCode)
  }

  private fun listWriter(itemType: TypeName, listParam: CodeBlock, itemParam: String, marshaller: CodeBlock): TypeSpec {
    val writeStatement = CodeBlock.builder()
        .beginControlFlow("for (final \$T \$L : \$L)", itemType, itemParam, listParam)
        .add(writeListItemStatement(itemType, itemParam, marshaller))
        .endControlFlow()
        .build()
    return TypeSpec.anonymousClassBuilder("")
        .addSuperinterface(InputFieldWriter.ListWriter::class.java)
        .addMethod(MethodSpec.methodBuilder("write")
            .addModifiers(Modifier.PUBLIC)
            .addAnnotation(Override::class.java)
            .addException(IOException::class.java)
            .addParameter(LIST_ITEM_WRITER_PARAM)
            .addCode(writeStatement)
            .build()
        )
        .build()
  }

  private fun writeListItemStatement(itemType: TypeName, itemParam: String, marshaller: CodeBlock): CodeBlock {
    fun writeList(): CodeBlock {
      val nestedListItemParamType = with(itemType.unwrapOptionalType(true)) { if (isList()) listParamType() else this }
      val nestedListWriter = listWriter(nestedListItemParamType, CodeBlock.of("\$L", itemParam), "\$$itemParam",
          marshaller)
      return CodeBlock.of("\$L.\$L(\$L != null ? \$L : null);\n", LIST_ITEM_WRITER_PARAM.name, WRITE_METHODS[LIST],
          itemParam, nestedListWriter)
    }

    fun writeCustom(): CodeBlock {
      val customScalarEnum = CustomEnumTypeSpecBuilder.className(context)
      val customScalarEnumConst = normalizeGraphQlType(graphQLType, true).toUpperCase(Locale.ENGLISH)
      return CodeBlock.of("\$L.writeCustom(\$T.\$L, \$L);\n", LIST_ITEM_WRITER_PARAM.name, customScalarEnum,
          customScalarEnumConst, itemParam)
    }

    fun writeScalar(): CodeBlock {
      val writeMethod = SCALAR_LIST_ITEM_WRITE_METHODS[itemType] ?: "writeString"
      return if (itemType.isEnum(context)) {
        CodeBlock.of(
            "\$L.\$L(\$L != null ? \$L.rawValue() : null);\n",
            LIST_ITEM_WRITER_PARAM.name, writeMethod, itemParam, itemParam
        )
      } else {
        CodeBlock.of("\$L.\$L(\$L);\n", LIST_ITEM_WRITER_PARAM.name, writeMethod, itemParam)
      }
    }

    fun writeObject(): CodeBlock {
      return CodeBlock.of(
          "\$L.writeObject(\$L != null ? \$L.\$L : null);\n",
          LIST_ITEM_WRITER_PARAM.name, itemParam, itemParam, marshaller
      )
    }

    return when {
      itemType.isList() -> writeList()
      graphQLType.isCustomScalarType(context) -> return writeCustom()
      itemType.isScalar(context) -> return writeScalar()
      else -> return writeObject()
    }
  }

  companion object {
    private val WRITE_METHODS = mapOf(
        STRING to "writeString",
        INT to "writeInt",
        LONG to "writeLong",
        DOUBLE to "writeDouble",
        BOOLEAN to "writeBoolean",
        ENUM to "writeString",
        CUSTOM to "writeCustom",
        OBJECT to "writeObject",
        LIST to "writeList"
    )
    private val SCALAR_LIST_ITEM_WRITE_METHODS = mapOf(
        ClassNames.STRING to "writeString",
        TypeName.INT to "writeInt",
        TypeName.INT.box() to "writeInt",
        TypeName.LONG to "writeLong",
        TypeName.LONG.box() to "writeLong",
        TypeName.DOUBLE to "writeDouble",
        TypeName.DOUBLE.box() to "writeDouble",
        TypeName.BOOLEAN to "writeBoolean",
        TypeName.BOOLEAN.box() to "writeBoolean"
    )
    private val LIST_ITEM_WRITER_PARAM =
        ParameterSpec.builder(InputFieldWriter.ListItemWriter::class.java, "listItemWriter").build()

    fun build(name: String, graphQLType: String, context: CodeGenerationContext,
        nullableValueType: NullableValueType = INPUT_TYPE
    ): InputFieldSpec {
      val javaType = JavaTypeResolver(context = context, packageName = "")
          .resolve(typeName = graphQLType, nullableValueType = nullableValueType)
      val normalizedJavaType = javaType.unwrapOptionalType(true)
      val type = when {
        normalizedJavaType.isList() -> LIST
        graphQLType.isCustomScalarType(context) -> CUSTOM
        normalizedJavaType.isScalar(context) -> {
          when (normalizedJavaType) {
            TypeName.INT, TypeName.INT.box() -> INT
            TypeName.LONG, TypeName.LONG.box() -> LONG
            TypeName.DOUBLE, TypeName.DOUBLE.box() -> DOUBLE
            TypeName.BOOLEAN, TypeName.BOOLEAN.box() -> BOOLEAN
            else -> if (normalizedJavaType.isEnum(context)) ENUM else STRING
          }
        }
        else -> OBJECT
      }
      return InputFieldSpec(
          type = type,
          name = name,
          graphQLType = graphQLType,
          javaType = javaType,
          context = context
      )
    }
  }

  enum class Type {
    STRING,
    INT,
    LONG,
    DOUBLE,
    BOOLEAN,
    ENUM,
    OBJECT,
    LIST,
    CUSTOM,
  }
}
