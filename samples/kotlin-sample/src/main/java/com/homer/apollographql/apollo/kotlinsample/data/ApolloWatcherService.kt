package com.homer.apollographql.apollo.kotlinsample.data

import android.util.Log
import com.homer.apollographql.apollo.ApolloCall
import com.homer.apollographql.apollo.ApolloClient
import com.homer.apollographql.apollo.api.Operation
import com.homer.apollographql.apollo.api.Response
import com.homer.apollographql.apollo.exception.ApolloException
import com.homer.apollographql.apollo.fetcher.ApolloResponseFetchers
import com.homer.apollographql.apollo.kotlinsample.GithubRepositoriesQuery
import com.homer.apollographql.apollo.kotlinsample.GithubRepositoryCommitsQuery
import com.homer.apollographql.apollo.kotlinsample.GithubRepositoryDetailQuery
import com.homer.apollographql.apollo.kotlinsample.type.OrderDirection
import com.homer.apollographql.apollo.kotlinsample.type.PullRequestState
import com.homer.apollographql.apollo.kotlinsample.type.RepositoryOrderField

/**
 * An implementation of a [GitHubDataSource] that shows how to fetch data using callbacks.
 */
class ApolloWatcherService(apolloClient: ApolloClient) : GitHubDataSource(apolloClient) {
  override fun fetchRepositories() {
    val repositoriesQuery = GithubRepositoriesQuery(
        repositoriesCount = 50,
        orderBy = RepositoryOrderField.UPDATED_AT,
        orderDirection = OrderDirection.DESC
    )

    val callback = createCallback<GithubRepositoriesQuery.Data> {
      repositoriesSubject.onNext(mapRepositoriesResponseToRepositories(it))
    }

    apolloClient
        .query(repositoriesQuery)
        .responseFetcher(ApolloResponseFetchers.CACHE_AND_NETWORK)
        .watcher()
        .enqueueAndWatch(callback)
  }

  override fun fetchRepositoryDetail(repositoryName: String) {
    val repositoryDetailQuery = GithubRepositoryDetailQuery(
        name = repositoryName,
        pullRequestStates = listOf(PullRequestState.OPEN)
    )

    val callback = createCallback<GithubRepositoryDetailQuery.Data> {
      repositoryDetailSubject.onNext(it)
    }

    apolloClient
        .query(repositoryDetailQuery)
        .responseFetcher(ApolloResponseFetchers.CACHE_AND_NETWORK)
        .watcher()
        .enqueueAndWatch(callback)
  }

  override fun fetchCommits(repositoryName: String) {
    val commitsQuery = GithubRepositoryCommitsQuery(
        name = repositoryName
    )

    val callback = createCallback<GithubRepositoryCommitsQuery.Data> { response ->
      val headCommit = response.data?.viewer?.repository?.ref?.target?.asCommit
      val commits = headCommit?.history?.edges?.filterNotNull().orEmpty()
      commitsSubject.onNext(commits)
    }

    apolloClient
        .query(commitsQuery)
        .responseFetcher(ApolloResponseFetchers.CACHE_AND_NETWORK)
        .watcher()
        .enqueueAndWatch(callback)
  }

  private fun <T : Operation.Data> createCallback(onResponse: (response: Response<T>) -> Unit) =
      object : ApolloCall.Callback<T>() {
        override fun onResponse(response: Response<T>) = onResponse(response)

        override fun onFailure(e: ApolloException) {
          exceptionSubject.onNext(e)
        }

        override fun onStatusEvent(event: ApolloCall.StatusEvent) {
          Log.d("ApolloWatcherService", "Apollo Status Event: $event")
        }
      }

  override fun cancelFetching() {
    //TODO: Determine how to cancel this when there's callbacks
  }
}
