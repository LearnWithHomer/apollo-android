// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.root_query_fragment;

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
import com.homer.apollographql.apollo.api.internal.Utils;
import com.example.root_query_fragment.fragment.QueryFragment;
import java.io.IOException;
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
  public static final String OPERATION_ID = "aa398544bf26cbb38315b1a35172c30b0e5fa0507770a4d9b5c420ee21a61fbb";

  public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
    "query TestQuery {\n"
        + "  ...QueryFragment\n"
        + "}\n"
        + "fragment QueryFragment on Query {\n"
        + "  __typename\n"
        + "  hero {\n"
        + "    __typename\n"
        + "    name\n"
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
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    private final @NotNull Fragments fragments;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@NotNull Fragments fragments) {
      this.fragments = Utils.checkNotNull(fragments, "fragments == null");
    }

    public @NotNull Fragments fragments() {
      return this.fragments;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          fragments.marshaller().marshal(writer);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "fragments=" + fragments
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
        return this.fragments.equals(that.fragments);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= fragments.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static class Fragments {
      final Optional<QueryFragment> queryFragment;

      private transient volatile String $toString;

      private transient volatile int $hashCode;

      private transient volatile boolean $hashCodeMemoized;

      public Fragments(@Nullable QueryFragment queryFragment) {
        this.queryFragment = Optional.fromNullable(queryFragment);
      }

      public Optional<QueryFragment> queryFragment() {
        return this.queryFragment;
      }

      public ResponseFieldMarshaller marshaller() {
        return new ResponseFieldMarshaller() {
          @Override
          public void marshal(ResponseWriter writer) {
            final QueryFragment $queryFragment = queryFragment.isPresent() ? queryFragment.get() : null;
            if ($queryFragment != null) {
              writer.writeFragment($queryFragment.marshaller());
            }
          }
        };
      }

      @Override
      public String toString() {
        if ($toString == null) {
          $toString = "Fragments{"
            + "queryFragment=" + queryFragment
            + "}";
        }
        return $toString;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (o instanceof Fragments) {
          Fragments that = (Fragments) o;
          return this.queryFragment.equals(that.queryFragment);
        }
        return false;
      }

      @Override
      public int hashCode() {
        if (!$hashCodeMemoized) {
          int h = 1;
          h *= 1000003;
          h ^= queryFragment.hashCode();
          $hashCode = h;
          $hashCodeMemoized = true;
        }
        return $hashCode;
      }

      public static final class Mapper implements ResponseFieldMapper<Fragments> {
        static final ResponseField[] $responseFields = {
          ResponseField.forFragment("__typename", "__typename", Arrays.<ResponseField.Condition>asList(
            ResponseField.Condition.typeCondition(new String[] {"Query"})
          ))
        };

        final QueryFragment.Mapper queryFragmentFieldMapper = new QueryFragment.Mapper();

        @Override
        public @NotNull Fragments map(ResponseReader reader) {
          final QueryFragment queryFragment = reader.readFragment($responseFields[0], new ResponseReader.ObjectReader<QueryFragment>() {
            @Override
            public QueryFragment read(ResponseReader reader) {
              return queryFragmentFieldMapper.map(reader);
            }
          });
          return new Fragments(queryFragment);
        }
      }
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final Fragments.Mapper fragmentsFieldMapper = new Fragments.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final Fragments fragments = fragmentsFieldMapper.map(reader);
        return new Data(fragments);
      }
    }
  }
}
