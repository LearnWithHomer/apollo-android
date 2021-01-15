package com.homer.apollographql.apollo.apollo.exception;

public final class ApolloNetworkException extends ApolloException {
  public ApolloNetworkException(String message) {
    super(message);
  }

  public ApolloNetworkException(String message, Throwable cause) {
    super(message, cause);
  }
}
