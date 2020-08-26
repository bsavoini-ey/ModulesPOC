package com.bsavoini.network

import com.bsavoini.network.responses.MoviesResponse
import com.bsavoini.network.responses.TvShowsResponse
import retrofit2.http.GET

interface TMDbApi {
    @GET("movie/popular?adult=false")
    suspend fun getPopularMovies(): MoviesResponse

    @GET("tv/popular?adult=false")
    suspend fun getPopularTvShow(): TvShowsResponse
}