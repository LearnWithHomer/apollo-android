// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_for_non_optional_field;

import com.homer.apollographql.apollo.api.Operation;
import com.homer.apollographql.apollo.api.OperationName;
import com.homer.apollographql.apollo.api.Query;
import com.homer.apollographql.apollo.api.Response;
import com.homer.apollographql.apollo.api.ResponseField;
import com.homer.apollographql.apollo.api.ScalarTypeAdapters;
import com.homer.apollographql.apollo.api.internal.OperationRequestBodyComposer;
import com.homer.apollographql.apollo.api.internal.Optional;
import com.homer.apollographql.apollo.api.internal.QueryDocumentMinifier;
import com.homer.apollographql.apollo.api.internal.ResponseFieldMapper;
import com.homer.apollographql.apollo.api.internal.ResponseFieldMarshaller;
import com.homer.apollographql.apollo.api.internal.ResponseReader;
import com.homer.apollographql.apollo.api.internal.ResponseWriter;
import com.homer.apollographql.apollo.api.internal.SimpleOperationResponseParser;
import com.homer.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.homer.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.Collections;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TestQuery implements Query<TestQuery.Data, Optional<TestQuery.Data>, Operation.Variables> {
  public static final String OPERATION_ID = "e33ec8a463abf6b32191d1f07aa6c7e4d038a493cace83a45a64632eb65b1ced";

  public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
    "query TestQuery {\n"
        + "  nonOptionalHero(episode: EMPIRE) {\n"
        + "    __typename\n"
        + "    name\n"
        + "    ... on Human {\n"
        + "      height\n"
        + "    }\n"
        + "  }\n"
        + "}"
  );

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "TestQuery";
    }
  };

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String operationId() {
    return OPERATION_ID;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Optional<TestQuery.Data> wrapData(TestQuery.Data data) {
    return Optional.fromNullable(data);
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<TestQuery.Data> responseFieldMapper() {
    return new Data.Mapper();
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public OperationName name() {
    return OPERATION_NAME;
  }

  @Override
  @NotNull
  public Response<Optional<TestQuery.Data>> parse(@NotNull final BufferedSource source,
      @NotNull final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters);
  }

  @Override
  @NotNull
  public Response<Optional<TestQuery.Data>> parse(@NotNull final ByteString byteString,
      @NotNull final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
    return parse(new Buffer().write(byteString), scalarTypeAdapters);
  }

  @Override
  @NotNull
  public Response<Optional<TestQuery.Data>> parse(@NotNull final BufferedSource source) throws
      IOException {
    return parse(source, ScalarTypeAdapters.DEFAULT);
  }

  @Override
  @NotNull
  public Response<Optional<TestQuery.Data>> parse(@NotNull final ByteString byteString) throws
      IOException {
    return parse(byteString, ScalarTypeAdapters.DEFAULT);
  }

  @Override
  @NotNull
  public ByteString composeRequestBody(@NotNull final ScalarTypeAdapters scalarTypeAdapters) {
    return OperationRequestBodyComposer.compose(this, false, true, scalarTypeAdapters);
  }

  @NotNull
  @Override
  public ByteString composeRequestBody() {
    return OperationRequestBodyComposer.compose(this, false, true, ScalarTypeAdapters.DEFAULT);
  }

  @Override
  @NotNull
  public ByteString composeRequestBody(final boolean autoPersistQueries,
      final boolean withQueryDocument, @NotNull final ScalarTypeAdapters scalarTypeAdapters) {
    return OperationRequestBodyComposer.compose(this, autoPersistQueries, withQueryDocument, scalarTypeAdapters);
  }

  public static final class Builder {
    Builder() {
    }

    public TestQuery build() {
      return new TestQuery();
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("nonOptionalHero", "nonOptionalHero", new UnmodifiableMapBuilder<String, Object>(1)
      .put("episode", "EMPIRE")
      .build(), false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull NonOptionalHero nonOptionalHero;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@NotNull NonOptionalHero nonOptionalHero) {
      this.nonOptionalHero = Utils.checkNotNull(nonOptionalHero, "nonOptionalHero == null");
    }

    public @NotNull NonOptionalHero nonOptionalHero() {
      return this.nonOptionalHero;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], nonOptionalHero.marshaller());
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "nonOptionalHero=" + nonOptionalHero
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return this.nonOptionalHero.equals(that.nonOptionalHero);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= nonOptionalHero.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final NonOptionalHero.Mapper nonOptionalHeroFieldMapper = new NonOptionalHero.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final NonOptionalHero nonOptionalHero = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<NonOptionalHero>() {
          @Override
          public NonOptionalHero read(ResponseReader reader) {
            return nonOptionalHeroFieldMapper.map(reader);
          }
        });
        return new Data(nonOptionalHero);
      }
    }
  }

  /**
   * A character from the Star Wars universe
   */
  public interface NonOptionalHero {
    @NotNull String __typename();

    /**
     * The name of the character
     */
    @NotNull String name();

    ResponseFieldMarshaller marshaller();

    default <T> T visit(Visitor<T> visitor) {
      if (this instanceof AsHuman) {
        return visitor.visit((AsHuman) this);
      } else if (this instanceof AsCharacter) {
        return visitor.visit((AsCharacter) this);
      }
      return visitor.visitDefault(this);
    }

    final class Mapper implements ResponseFieldMapper<NonOptionalHero> {
      static final ResponseField[] $responseFields = {
        ResponseField.forFragment("__typename", "__typename", Arrays.<ResponseField.Condition>asList(
          ResponseField.Condition.typeCondition(new String[] {"Human"})
        ))
      };

      final AsHuman.Mapper asHumanFieldMapper = new AsHuman.Mapper();

      final AsCharacter.Mapper asCharacterFieldMapper = new AsCharacter.Mapper();

      @Override
      public NonOptionalHero map(ResponseReader reader) {
        final AsHuman asHuman = reader.readFragment($responseFields[0], new ResponseReader.ObjectReader<AsHuman>() {
          @Override
          public AsHuman read(ResponseReader reader) {
            return asHumanFieldMapper.map(reader);
          }
        });
        if (asHuman != null) {
          return asHuman;
        }
        return asCharacterFieldMapper.map(reader);
      }
    }

    interface Visitor<T> {
      T visitDefault(@NotNull NonOptionalHero nonOptionalHero);

      T visit(@NotNull AsHuman asHuman);

      T visit(@NotNull AsCharacter asCharacter);
    }
  }

  /**
   * A humanoid creature from the Star Wars universe
   */
  public static class AsHuman implements NonOptionalHero {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("name", "name", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forDouble("height", "height", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull String name;

    final Optional<Double> height;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public AsHuman(@NotNull String __typename, @NotNull String name, @Nullable Double height) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.name = Utils.checkNotNull(name, "name == null");
      this.height = Optional.fromNullable(height);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * What this human calls themselves
     */
    public @NotNull String name() {
      return this.name;
    }

    /**
     * Height in the preferred unit, default is meters
     */
    public Optional<Double> height() {
      return this.height;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], name);
          writer.writeDouble($responseFields[2], height.isPresent() ? height.get() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "AsHuman{"
          + "__typename=" + __typename + ", "
          + "name=" + name + ", "
          + "height=" + height
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AsHuman) {
        AsHuman that = (AsHuman) o;
        return this.__typename.equals(that.__typename)
         && this.name.equals(that.name)
         && this.height.equals(that.height);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        h *= 1000003;
        h ^= height.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<AsHuman> {
      @Override
      public AsHuman map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String name = reader.readString($responseFields[1]);
        final Double height = reader.readDouble($responseFields[2]);
        return new AsHuman(__typename, name, height);
      }
    }
  }

  /**
   * A character from the Star Wars universe
   */
  public static class AsCharacter implements NonOptionalHero {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("name", "name", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull String name;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public AsCharacter(@NotNull String __typename, @NotNull String name) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.name = Utils.checkNotNull(name, "name == null");
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * The name of the character
     */
    public @NotNull String name() {
      return this.name;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], name);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "AsCharacter{"
          + "__typename=" + __typename + ", "
          + "name=" + name
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AsCharacter) {
        AsCharacter that = (AsCharacter) o;
        return this.__typename.equals(that.__typename)
         && this.name.equals(that.name);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= name.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<AsCharacter> {
      @Override
      public AsCharacter map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String name = reader.readString($responseFields[1]);
        return new AsCharacter(__typename, name);
      }
    }
  }
}
