package com.homer.apollographql.apollo.apollo.internal.field;

import com.homer.apollographql.apollo.api.ResponseField;
import com.homer.apollographql.apollo.api.internal.FieldValueResolver;

import java.util.Map;

public final class MapFieldValueResolver implements FieldValueResolver<Map<String, Object>> {

  @SuppressWarnings({"unchecked", "TypeParameterUnusedInFormals"})
  @Override public <T> T valueFor(Map<String, Object> map, ResponseField field) {
    return (T) map.get(field.getResponseName());
  }
}
