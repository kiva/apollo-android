package com.example.hero_details;

import com.apollographql.android.api.graphql.Field;
import com.apollographql.android.api.graphql.Operation;
import com.apollographql.android.api.graphql.Query;
import com.apollographql.android.api.graphql.ResponseFieldMapper;
import com.apollographql.android.api.graphql.ResponseReader;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class TestQuery implements Query<Operation.Variables> {
  public static final String OPERATION_DEFINITION = "query TestQuery {\n"
      + "  hero {\n"
      + "    __typename\n"
      + "    name\n"
      + "    friendsConnection {\n"
      + "      totalCount\n"
      + "      edges {\n"
      + "        node {\n"
      + "          __typename\n"
      + "          name\n"
      + "        }\n"
      + "      }\n"
      + "    }\n"
      + "  }\n"
      + "}";

  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  public static class Data implements Operation.Data {
    public static final Creator CREATOR = new Creator() {
      @Override
      public @Nonnull Data create(@Nullable Hero hero) {
        return new Data(hero);
      }
    };

    public static final Factory FACTORY = new Factory() {
      @Override
      public @Nonnull Creator creator() {
        return CREATOR;
      }

      @Override
      public @Nonnull Hero.Factory heroFactory() {
        return Hero.FACTORY;
      }
    };

    private final @Nullable Hero hero;

    public Data(@Nullable Hero hero) {
      this.hero = hero;
    }

    public @Nullable Hero hero() {
      return this.hero;
    }

    @Override
    public String toString() {
      return "Data{"
        + "hero=" + hero
        + "}";
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return ((this.hero == null) ? (that.hero == null) : this.hero.equals(that.hero));
      }
      return false;
    }

    @Override
    public int hashCode() {
      int h = 1;
      h *= 1000003;
      h ^= (hero == null) ? 0 : hero.hashCode();
      return h;
    }

    public static class Hero {
      public static final Creator CREATOR = new Creator() {
        @Override
        public @Nonnull Hero create(@Nonnull String name,
            @Nonnull FriendsConnection friendsConnection) {
          return new Hero(name, friendsConnection);
        }
      };

      public static final Factory FACTORY = new Factory() {
        @Override
        public @Nonnull Creator creator() {
          return CREATOR;
        }

        @Override
        public @Nonnull FriendsConnection.Factory friendsConnectionFactory() {
          return FriendsConnection.FACTORY;
        }
      };

      private final @Nonnull String name;

      private final @Nonnull FriendsConnection friendsConnection;

      public Hero(@Nonnull String name, @Nonnull FriendsConnection friendsConnection) {
        this.name = name;
        this.friendsConnection = friendsConnection;
      }

      public @Nonnull String name() {
        return this.name;
      }

      public @Nonnull FriendsConnection friendsConnection() {
        return this.friendsConnection;
      }

      @Override
      public String toString() {
        return "Hero{"
          + "name=" + name + ", "
          + "friendsConnection=" + friendsConnection
          + "}";
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (o instanceof Hero) {
          Hero that = (Hero) o;
          return ((this.name == null) ? (that.name == null) : this.name.equals(that.name))
           && ((this.friendsConnection == null) ? (that.friendsConnection == null) : this.friendsConnection.equals(that.friendsConnection));
        }
        return false;
      }

      @Override
      public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= (name == null) ? 0 : name.hashCode();
        h *= 1000003;
        h ^= (friendsConnection == null) ? 0 : friendsConnection.hashCode();
        return h;
      }

      public static class FriendsConnection {
        public static final Creator CREATOR = new Creator() {
          @Override
          public @Nonnull FriendsConnection create(@Nullable Integer totalCount,
              @Nullable List<Edge> edges) {
            return new FriendsConnection(totalCount, edges);
          }
        };

        public static final Factory FACTORY = new Factory() {
          @Override
          public @Nonnull Creator creator() {
            return CREATOR;
          }

          @Override
          public @Nonnull Edge.Factory edgeFactory() {
            return Edge.FACTORY;
          }
        };

        private final @Nullable Integer totalCount;

        private final @Nullable List<Edge> edges;

        public FriendsConnection(@Nullable Integer totalCount, @Nullable List<Edge> edges) {
          this.totalCount = totalCount;
          this.edges = edges;
        }

        public @Nullable Integer totalCount() {
          return this.totalCount;
        }

        public @Nullable List<Edge> edges() {
          return this.edges;
        }

        @Override
        public String toString() {
          return "FriendsConnection{"
            + "totalCount=" + totalCount + ", "
            + "edges=" + edges
            + "}";
        }

        @Override
        public boolean equals(Object o) {
          if (o == this) {
            return true;
          }
          if (o instanceof FriendsConnection) {
            FriendsConnection that = (FriendsConnection) o;
            return ((this.totalCount == null) ? (that.totalCount == null) : this.totalCount.equals(that.totalCount))
             && ((this.edges == null) ? (that.edges == null) : this.edges.equals(that.edges));
          }
          return false;
        }

        @Override
        public int hashCode() {
          int h = 1;
          h *= 1000003;
          h ^= (totalCount == null) ? 0 : totalCount.hashCode();
          h *= 1000003;
          h ^= (edges == null) ? 0 : edges.hashCode();
          return h;
        }

        public static class Edge {
          public static final Creator CREATOR = new Creator() {
            @Override
            public @Nonnull Edge create(@Nullable Node node) {
              return new Edge(node);
            }
          };

          public static final Factory FACTORY = new Factory() {
            @Override
            public @Nonnull Creator creator() {
              return CREATOR;
            }

            @Override
            public @Nonnull Node.Factory nodeFactory() {
              return Node.FACTORY;
            }
          };

          private final @Nullable Node node;

          public Edge(@Nullable Node node) {
            this.node = node;
          }

          public @Nullable Node node() {
            return this.node;
          }

          @Override
          public String toString() {
            return "Edge{"
              + "node=" + node
              + "}";
          }

          @Override
          public boolean equals(Object o) {
            if (o == this) {
              return true;
            }
            if (o instanceof Edge) {
              Edge that = (Edge) o;
              return ((this.node == null) ? (that.node == null) : this.node.equals(that.node));
            }
            return false;
          }

          @Override
          public int hashCode() {
            int h = 1;
            h *= 1000003;
            h ^= (node == null) ? 0 : node.hashCode();
            return h;
          }

          public static class Node {
            public static final Creator CREATOR = new Creator() {
              @Override
              public @Nonnull Node create(@Nonnull String name) {
                return new Node(name);
              }
            };

            public static final Factory FACTORY = new Factory() {
              @Override
              public @Nonnull Creator creator() {
                return CREATOR;
              }
            };

            private final @Nonnull String name;

            public Node(@Nonnull String name) {
              this.name = name;
            }

            public @Nonnull String name() {
              return this.name;
            }

            @Override
            public String toString() {
              return "Node{"
                + "name=" + name
                + "}";
            }

            @Override
            public boolean equals(Object o) {
              if (o == this) {
                return true;
              }
              if (o instanceof Node) {
                Node that = (Node) o;
                return ((this.name == null) ? (that.name == null) : this.name.equals(that.name));
              }
              return false;
            }

            @Override
            public int hashCode() {
              int h = 1;
              h *= 1000003;
              h ^= (name == null) ? 0 : name.hashCode();
              return h;
            }

            public static final class Mapper implements ResponseFieldMapper<Node> {
              final Factory factory;

              final Field[] fields = {
                Field.forString("name", "name", null, false)
              };

              public Mapper(@Nonnull Factory factory) {
                this.factory = factory;
              }

              @Override
              public Node map(ResponseReader reader) throws IOException {
                final __ContentValues contentValues = new __ContentValues();
                reader.read(new ResponseReader.ValueHandler() {
                  @Override
                  public void handle(final int fieldIndex, final Object value) throws IOException {
                    switch (fieldIndex) {
                      case 0: {
                        contentValues.name = (String) value;
                        break;
                      }
                    }
                  }
                }, fields);
                return factory.creator().create(contentValues.name);
              }

              static final class __ContentValues {
                String name;
              }
            }

            public interface Factory {
              @Nonnull Creator creator();
            }

            public interface Creator {
              @Nonnull Node create(@Nonnull String name);
            }
          }

          public static final class Mapper implements ResponseFieldMapper<Edge> {
            final Factory factory;

            final Field[] fields = {
              Field.forObject("node", "node", null, true, new Field.ObjectReader<Node>() {
                @Override public Node read(final ResponseReader reader) throws IOException {
                  return new Node.Mapper(factory.nodeFactory()).map(reader);
                }
              })
            };

            public Mapper(@Nonnull Factory factory) {
              this.factory = factory;
            }

            @Override
            public Edge map(ResponseReader reader) throws IOException {
              final __ContentValues contentValues = new __ContentValues();
              reader.read(new ResponseReader.ValueHandler() {
                @Override
                public void handle(final int fieldIndex, final Object value) throws IOException {
                  switch (fieldIndex) {
                    case 0: {
                      contentValues.node = (Node) value;
                      break;
                    }
                  }
                }
              }, fields);
              return factory.creator().create(contentValues.node);
            }

            static final class __ContentValues {
              Node node;
            }
          }

          public interface Factory {
            @Nonnull Creator creator();

            @Nonnull Node.Factory nodeFactory();
          }

          public interface Creator {
            @Nonnull Edge create(@Nullable Node node);
          }
        }

        public static final class Mapper implements ResponseFieldMapper<FriendsConnection> {
          final Factory factory;

          final Field[] fields = {
            Field.forInt("totalCount", "totalCount", null, true),
            Field.forList("edges", "edges", null, true, new Field.ObjectReader<Edge>() {
              @Override public Edge read(final ResponseReader reader) throws IOException {
                return new Edge.Mapper(factory.edgeFactory()).map(reader);
              }
            })
          };

          public Mapper(@Nonnull Factory factory) {
            this.factory = factory;
          }

          @Override
          public FriendsConnection map(ResponseReader reader) throws IOException {
            final __ContentValues contentValues = new __ContentValues();
            reader.read(new ResponseReader.ValueHandler() {
              @Override
              public void handle(final int fieldIndex, final Object value) throws IOException {
                switch (fieldIndex) {
                  case 0: {
                    contentValues.totalCount = (Integer) value;
                    break;
                  }
                  case 1: {
                    contentValues.edges = (List<Edge>) value;
                    break;
                  }
                }
              }
            }, fields);
            return factory.creator().create(contentValues.totalCount, contentValues.edges);
          }

          static final class __ContentValues {
            Integer totalCount;

            List<Edge> edges;
          }
        }

        public interface Factory {
          @Nonnull Creator creator();

          @Nonnull Edge.Factory edgeFactory();
        }

        public interface Creator {
          @Nonnull FriendsConnection create(@Nullable Integer totalCount,
              @Nullable List<Edge> edges);
        }
      }

      public static final class Mapper implements ResponseFieldMapper<Hero> {
        final Factory factory;

        final Field[] fields = {
          Field.forString("name", "name", null, false),
          Field.forObject("friendsConnection", "friendsConnection", null, false, new Field.ObjectReader<FriendsConnection>() {
            @Override public FriendsConnection read(final ResponseReader reader) throws IOException {
              return new FriendsConnection.Mapper(factory.friendsConnectionFactory()).map(reader);
            }
          })
        };

        public Mapper(@Nonnull Factory factory) {
          this.factory = factory;
        }

        @Override
        public Hero map(ResponseReader reader) throws IOException {
          final __ContentValues contentValues = new __ContentValues();
          reader.read(new ResponseReader.ValueHandler() {
            @Override
            public void handle(final int fieldIndex, final Object value) throws IOException {
              switch (fieldIndex) {
                case 0: {
                  contentValues.name = (String) value;
                  break;
                }
                case 1: {
                  contentValues.friendsConnection = (FriendsConnection) value;
                  break;
                }
              }
            }
          }, fields);
          return factory.creator().create(contentValues.name, contentValues.friendsConnection);
        }

        static final class __ContentValues {
          String name;

          FriendsConnection friendsConnection;
        }
      }

      public interface Factory {
        @Nonnull Creator creator();

        @Nonnull FriendsConnection.Factory friendsConnectionFactory();
      }

      public interface Creator {
        @Nonnull Hero create(@Nonnull String name, @Nonnull FriendsConnection friendsConnection);
      }
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final Factory factory;

      final Field[] fields = {
        Field.forObject("hero", "hero", null, true, new Field.ObjectReader<Hero>() {
          @Override public Hero read(final ResponseReader reader) throws IOException {
            return new Hero.Mapper(factory.heroFactory()).map(reader);
          }
        })
      };

      public Mapper(@Nonnull Factory factory) {
        this.factory = factory;
      }

      @Override
      public Data map(ResponseReader reader) throws IOException {
        final __ContentValues contentValues = new __ContentValues();
        reader.read(new ResponseReader.ValueHandler() {
          @Override
          public void handle(final int fieldIndex, final Object value) throws IOException {
            switch (fieldIndex) {
              case 0: {
                contentValues.hero = (Hero) value;
                break;
              }
            }
          }
        }, fields);
        return factory.creator().create(contentValues.hero);
      }

      static final class __ContentValues {
        Hero hero;
      }
    }

    public interface Factory {
      @Nonnull Creator creator();

      @Nonnull Hero.Factory heroFactory();
    }

    public interface Creator {
      @Nonnull Data create(@Nullable Hero hero);
    }
  }
}