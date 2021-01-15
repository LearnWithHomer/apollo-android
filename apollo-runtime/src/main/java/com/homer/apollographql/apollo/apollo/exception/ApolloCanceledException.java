package com.homer.apollographql.apollo.apollo.exception;

public final class ApolloCanceledException extends ApolloException {

  public ApolloCanceledException() {
    super("Call is cancelled");
  }

  public ApolloCanceledException(String message, Throwable cause) {
    super(message, cause);
  }
}
