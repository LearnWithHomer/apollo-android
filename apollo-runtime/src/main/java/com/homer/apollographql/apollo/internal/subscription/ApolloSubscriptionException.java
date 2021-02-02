package com.homer.apollographql.apollo.internal.subscription;

import com.homer.apollographql.apollo.exception.ApolloException;

@SuppressWarnings("WeakerAccess")
public class ApolloSubscriptionException extends ApolloException {

  public ApolloSubscriptionException(String message) {
    super(message);
  }

  public ApolloSubscriptionException(String message, Throwable cause) {
    super(message, cause);
  }
}
