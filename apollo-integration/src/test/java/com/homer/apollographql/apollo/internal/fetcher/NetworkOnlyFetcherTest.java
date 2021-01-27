package com.homer.apollographql.apollo.internal.fetcher;

import com.homer.apollographql.apollo.exception.ApolloException;
import com.homer.apollographql.apollo.integration.normalizer.EpisodeHeroNameQuery;
import com.homer.apollographql.apollo.integration.normalizer.type.Episode;

import com.homer.apollographql.apollo.fetcher.ApolloResponseFetchers;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import okhttp3.mockwebserver.MockResponse;

import static com.homer.apollographql.apollo.fetcher.ApolloResponseFetchers.NETWORK_ONLY;
import static com.google.common.truth.Truth.assertThat;
import static java.net.HttpURLConnection.HTTP_INTERNAL_ERROR;

public class NetworkOnlyFetcherTest extends BaseFetcherTest {
  @Test public void enqueue() throws IOException, ApolloException, TimeoutException, InterruptedException {
    EpisodeHeroNameQuery query = EpisodeHeroNameQuery.builder().episode(Episode.EMPIRE).build();
    TrackingCallback trackingCallback;

    // Has error when cache empty, and network error
    server.enqueue(new MockResponse().setResponseCode(HTTP_INTERNAL_ERROR).setBody("Server Error"));
    trackingCallback = new TrackingCallback();
    apolloClient.query(query).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).enqueue(trackingCallback);
    assertThat(trackingCallback.exceptions.size()).isEqualTo(1);

    // Goes to network when empty
    server.enqueue(mockResponse("HeroNameResponse.json"));
    trackingCallback = new TrackingCallback();
    apolloClient.query(query).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).enqueue(trackingCallback);
    assertThat(trackingCallback.exceptions).isEmpty();
    assertThat(trackingCallback.responseList.size()).isEqualTo(1);
    assertThat(trackingCallback.responseList.get(0).fromCache()).isFalse();
    assertThat(trackingCallback.responseList.get(0).data().hero().name()).isEqualTo("R2-D2");

    // Goes to network after cache populated
    server.enqueue(mockResponse("HeroNameResponse.json"));
    trackingCallback = new TrackingCallback();
    apolloClient.query(query).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).enqueue(trackingCallback);
    assertThat(trackingCallback.exceptions).isEmpty();
    assertThat(trackingCallback.responseList.size()).isEqualTo(1);
    assertThat(trackingCallback.responseList.get(0).fromCache()).isFalse();
    assertThat(trackingCallback.responseList.get(0).data().hero().name()).isEqualTo("R2-D2");

    // Has error when cache empty, and network error
    server.enqueue(new MockResponse().setResponseCode(HTTP_INTERNAL_ERROR).setBody("Server Error"));
    trackingCallback = new TrackingCallback();
    apolloClient.query(query).responseFetcher(ApolloResponseFetchers.NETWORK_ONLY).enqueue(trackingCallback);
    assertThat(trackingCallback.exceptions.size()).isEqualTo(1);
  }
}