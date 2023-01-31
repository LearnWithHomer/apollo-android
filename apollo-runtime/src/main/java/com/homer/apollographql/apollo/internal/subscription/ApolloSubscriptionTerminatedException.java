package com.homer.apollographql.apollo.internal.subscription;

import com.homer.apollographql.apollo.exception.ApolloException;

public class ApolloSubscriptionTerminatedException extends ApolloException {

  public ApolloSubscriptionTerminatedException(String message) {
    super(message);
  }

  public ApolloSubscriptionTerminatedException(String message, Throwable cause) {
    super(message, cause);
  }
}
