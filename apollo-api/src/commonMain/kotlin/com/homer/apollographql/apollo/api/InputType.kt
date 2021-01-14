package com.homer.apollographql.apollo.api

import com.homer.apollographql.apollo.api.internal.InputFieldMarshaller

interface InputType {

  fun marshaller(): InputFieldMarshaller
}
