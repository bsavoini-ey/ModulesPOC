package com.bsavoini.network.responses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoviesResponse(
    @Json(name = "results") val moviesResults: List<MovieResult>
)

@JsonClass(generateAdapter = true)
data class MovieResult(
    @Json(name = "id") val id: Int,
    @Json(name = "title") val title: String,
    @Json(name = "original_title") val originalTitle: String,
    @Json(name = "backdrop_path") val backdropPath: String?,
    @Json(name = "poster_path") val posterPath: String?,
    @Json(name = "overview") val overview: String
)