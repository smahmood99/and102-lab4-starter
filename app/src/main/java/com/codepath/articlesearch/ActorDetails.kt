package com.codepath.articlesearch

import androidx.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable

class KnownFor (
    @SerialName("original_title")
    val title: String? = null,
    @SerialName("overview")
    val overview: String? = null,
    @SerialName("backdrop_path")
    val urlPoster: String?
) : java.io.Serializable