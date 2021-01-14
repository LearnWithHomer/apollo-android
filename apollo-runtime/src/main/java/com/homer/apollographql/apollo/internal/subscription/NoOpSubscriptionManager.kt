package com.homer.apollographql.apollo.internal.subscription

import com.homer.apollographql.apollo.api.Subscription
import com.homer.apollographql.apollo.subscription.OnSubscriptionManagerStateChangeListener
import com.homer.apollographql.apollo.subscription.SubscriptionManagerState

class NoOpSubscriptionManager : com.homer.apollographql.apollo.internal.subscription.SubscriptionManager {
  val errorMessage = "No `SubscriptionTransport.Factory` found, please add one to your `ApolloClient` with `ApolloClient.Builder.subscriptionTransportFactory`"

  override fun <T> subscribe(subscription: Subscription<*, T, *>, callback: com.homer.apollographql.apollo.internal.subscription.SubscriptionManager.Callback<T>) {
    throw IllegalStateException(errorMessage)
  }

  override fun unsubscribe(subscription: Subscription<*, *, *>) {
    throw IllegalStateException(errorMessage)
  }

  override fun start() {
    throw IllegalStateException(errorMessage)
  }

  override fun stop() {
    throw IllegalStateException(errorMessage)
  }

  override fun reconnect() {
  }

  override fun getState(): com.homer.apollographql.apollo.subscription.SubscriptionManagerState {
    return com.homer.apollographql.apollo.subscription.SubscriptionManagerState.DISCONNECTED
  }

  override fun addOnStateChangeListener(onStateChangeListener: com.homer.apollographql.apollo.subscription.OnSubscriptionManagerStateChangeListener) {
    throw IllegalStateException(errorMessage)
  }

  override fun removeOnStateChangeListener(onStateChangeListener: com.homer.apollographql.apollo.subscription.OnSubscriptionManagerStateChangeListener) {
    throw IllegalStateException(errorMessage)
  }
}