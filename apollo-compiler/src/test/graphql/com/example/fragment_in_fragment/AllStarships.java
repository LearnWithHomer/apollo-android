// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment;

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
import com.example.fragment_in_fragment.fragment.StarshipFragment;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AllStarships implements Query<AllStarships.Data, Optional<AllStarships.Data>, Operation.Variables> {
  public static final String OPERATION_ID = "1296a4041eb330b2810e426f9347f76c6df3a969ab7f7e56f250bf9c6a07982e";

  public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
    "query AllStarships {\n"
        + "  allStarships(first: 7) {\n"
        + "    __typename\n"
        + "    edges {\n"
        + "      __typename\n"
        + "      node {\n"
        + "        __typename\n"
        + "        ...starshipFragment\n"
        + "      }\n"
        + "    }\n"
        + "  }\n"
        + "}\n"
        + "fragment starshipFragment on Starship {\n"
        + "  __typename\n"
        + "  id\n"
        + "  name\n"
        + "  pilotConnection {\n"
        + "    __typename\n"
        + "    edges {\n"
        + "      __typename\n"
        + "      node {\n"
        + "        __typename\n"
        + "        ...pilotFragment\n"
        + "      }\n"
        + "    }\n"
        + "  }\n"
        + "}\n"
        + "fragment pilotFragment on Person {\n"
        + "  __typename\n"
        + "  name\n"
        + "  homeworld {\n"
        + "    __typename\n"
        + "    ...planetFragment\n"
        + "  }\n"
        + "}\n"
        + "fragment planetFragment on Planet {\n"
        + "  __typename\n"
        + "  name\n"
        + "}"
  );

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "AllStarships";
    }
  };

  private final Operation.Variables variables;

  public AllStarships() {
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
  public Optional<AllStarships.Data> wrapData(AllStarships.Data data) {
    return Optional.fromNullable(data);
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<AllStarships.Data> responseFieldMapper() {
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
  public Response<Optional<AllStarships.Data>> parse(@NotNull final BufferedSource source,
      @NotNull final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters);
  }

  @Override
  @NotNull
  public Response<Optional<AllStarships.Data>> parse(@NotNull final ByteString byteString,
      @NotNull final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
    return parse(new Buffer().write(byteString), scalarTypeAdapters);
  }

  @Override
  @NotNull
  public Response<Optional<AllStarships.Data>> parse(@NotNull final BufferedSource source) throws
      IOException {
    return parse(source, ScalarTypeAdapters.DEFAULT);
  }

  @Override
  @NotNull
  public Response<Optional<AllStarships.Data>> parse(@NotNull final ByteString byteString) throws
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

    public AllStarships build() {
      return new AllStarships();
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("allStarships", "allStarships", new UnmodifiableMapBuilder<String, Object>(1)
      .put("first", 7)
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final Optional<AllStarships1> allStarships;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable AllStarships1 allStarships) {
      this.allStarships = Optional.fromNullable(allStarships);
    }

    public Optional<AllStarships1> allStarships() {
      return this.allStarships;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], allStarships.isPresent() ? allStarships.get().marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "allStarships=" + allStarships
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
        return this.allStarships.equals(that.allStarships);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= allStarships.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final AllStarships1.Mapper allStarships1FieldMapper = new AllStarships1.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final AllStarships1 allStarships = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<AllStarships1>() {
          @Override
          public AllStarships1 read(ResponseReader reader) {
            return allStarships1FieldMapper.map(reader);
          }
        });
        return new Data(allStarships);
      }
    }
  }

  /**
   * A connection to a list of items.
   */
  public static class AllStarships1 {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forList("edges", "edges", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final Optional<List<Edge>> edges;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public AllStarships1(@NotNull String __typename, @Nullable List<Edge> edges) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.edges = Optional.fromNullable(edges);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * A list of edges.
     */
    public Optional<List<Edge>> edges() {
      return this.edges;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeList($responseFields[1], edges.isPresent() ? edges.get() : null, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((Edge) item).marshaller());
              }
            }
          });
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "AllStarships1{"
          + "__typename=" + __typename + ", "
          + "edges=" + edges
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AllStarships1) {
        AllStarships1 that = (AllStarships1) o;
        return this.__typename.equals(that.__typename)
         && this.edges.equals(that.edges);
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
        h ^= edges.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<AllStarships1> {
      final Edge.Mapper edgeFieldMapper = new Edge.Mapper();

      @Override
      public AllStarships1 map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final List<Edge> edges = reader.readList($responseFields[1], new ResponseReader.ListReader<Edge>() {
          @Override
          public Edge read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<Edge>() {
              @Override
              public Edge read(ResponseReader reader) {
                return edgeFieldMapper.map(reader);
              }
            });
          }
        });
        return new AllStarships1(__typename, edges);
      }
    }
  }

  /**
   * An edge in a connection.
   */
  public static class Edge {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forObject("node", "node", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final Optional<Node> node;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Edge(@NotNull String __typename, @Nullable Node node) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.node = Optional.fromNullable(node);
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * The item at the end of the edge
     */
    public Optional<Node> node() {
      return this.node;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeObject($responseFields[1], node.isPresent() ? node.get().marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Edge{"
          + "__typename=" + __typename + ", "
          + "node=" + node
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Edge) {
        Edge that = (Edge) o;
        return this.__typename.equals(that.__typename)
         && this.node.equals(that.node);
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
        h ^= node.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Edge> {
      final Node.Mapper nodeFieldMapper = new Node.Mapper();

      @Override
      public Edge map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final Node node = reader.readObject($responseFields[1], new ResponseReader.ObjectReader<Node>() {
          @Override
          public Node read(ResponseReader reader) {
            return nodeFieldMapper.map(reader);
          }
        });
        return new Edge(__typename, node);
      }
    }
  }

  /**
   * A single transport craft that has hyperdrive capability.
   */
  public static class Node {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    private final @NotNull Fragments fragments;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Node(@NotNull String __typename, @NotNull Fragments fragments) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.fragments = Utils.checkNotNull(fragments, "fragments == null");
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public @NotNull Fragments fragments() {
      return this.fragments;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          fragments.marshaller().marshal(writer);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Node{"
          + "__typename=" + __typename + ", "
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
      if (o instanceof Node) {
        Node that = (Node) o;
        return this.__typename.equals(that.__typename)
         && this.fragments.equals(that.fragments);
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
        h ^= fragments.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static class Fragments {
      final @NotNull StarshipFragment starshipFragment;

      private transient volatile String $toString;

      private transient volatile int $hashCode;

      private transient volatile boolean $hashCodeMemoized;

      public Fragments(@NotNull StarshipFragment starshipFragment) {
        this.starshipFragment = Utils.checkNotNull(starshipFragment, "starshipFragment == null");
      }

      public @NotNull StarshipFragment starshipFragment() {
        return this.starshipFragment;
      }

      public ResponseFieldMarshaller marshaller() {
        return new ResponseFieldMarshaller() {
          @Override
          public void marshal(ResponseWriter writer) {
            writer.writeFragment(starshipFragment.marshaller());
          }
        };
      }

      @Override
      public String toString() {
        if ($toString == null) {
          $toString = "Fragments{"
            + "starshipFragment=" + starshipFragment
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
          return this.starshipFragment.equals(that.starshipFragment);
        }
        return false;
      }

      @Override
      public int hashCode() {
        if (!$hashCodeMemoized) {
          int h = 1;
          h *= 1000003;
          h ^= starshipFragment.hashCode();
          $hashCode = h;
          $hashCodeMemoized = true;
        }
        return $hashCode;
      }

      public static final class Mapper implements ResponseFieldMapper<Fragments> {
        static final ResponseField[] $responseFields = {
          ResponseField.forFragment("__typename", "__typename", Collections.<ResponseField.Condition>emptyList())
        };

        final StarshipFragment.Mapper starshipFragmentFieldMapper = new StarshipFragment.Mapper();

        @Override
        public @NotNull Fragments map(ResponseReader reader) {
          final StarshipFragment starshipFragment = reader.readFragment($responseFields[0], new ResponseReader.ObjectReader<StarshipFragment>() {
            @Override
            public StarshipFragment read(ResponseReader reader) {
              return starshipFragmentFieldMapper.map(reader);
            }
          });
          return new Fragments(starshipFragment);
        }
      }
    }

    public static final class Mapper implements ResponseFieldMapper<Node> {
      final Fragments.Mapper fragmentsFieldMapper = new Fragments.Mapper();

      @Override
      public Node map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final Fragments fragments = fragmentsFieldMapper.map(reader);
        return new Node(__typename, fragments);
      }
    }
  }
}
