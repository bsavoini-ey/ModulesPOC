package com.bsavoini.network.responses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TvShowsResponse(
    @Json(name = "results") val tvShowsResults: List<TvShowResult>
)

@JsonClass(generateAdapter = true)
data class TvShowResult(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "original_name") val originalName: String,
    @Json(name = "poster_path") val posterUrl: String,
    @Json(name = "overview") val overview: String
)