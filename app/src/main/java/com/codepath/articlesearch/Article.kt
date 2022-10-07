package com.codepath.articlesearch

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable

data class SearchTrendingActorsResults(
    @SerialName("results")
    val results: List<TrendingActors>?
)

@Keep
@Serializable

data class TrendingActors(
    @SerialName("name")
    val name: String?,
    @SerialName("profile_path")
    val profilePicURL: String?,
    @SerialName("known_for")
    val knownFor: List<KnownFor>?,
)

    : java.io.Serializable {
    val movieImageUrl = "https://image.tmdb.org/t/p/w500/${knownFor?.firstOrNull { it.urlPoster != null }?.urlPoster ?: ""}"
    val actorImageUrl = "https://image.tmdb.org/t/p/w500/$profilePicURL"
}
