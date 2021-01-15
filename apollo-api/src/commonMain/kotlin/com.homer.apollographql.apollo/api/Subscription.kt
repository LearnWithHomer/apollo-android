package com.homer.apollographql.apollo.api

import com.homer.apollographql.apollo.api.Operation.Data
import com.homer.apollographql.apollo.api.Operation.Variables

/**
 * Represents a GraphQL subscription.
 */
interface Subscription<D : Data, T, V : Variables> : Operation<D, T, V>
