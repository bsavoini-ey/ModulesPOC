package com.bsavoini.network

import com.bsavoini.network.responses.MovieResult
import com.bsavoini.network.responses.MoviesResponse
import com.bsavoini.network.responses.TvShowResult
import com.bsavoini.network.responses.TvShowsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TMDbApi {
    @GET("movie/popular?adult=false")
    suspend fun getPopularMovies(): MoviesResponse

    @GET("movie/{movie_id}")
    suspend fun getMovie(@Path("movie_id") movieId: Int): MovieResult

    @GET("tv/popular?adult=false")
    suspend fun getPopularTvShow(): TvShowsResponse

    @GET("tv/{tv_id}")
    suspend fun getTvShow(@Path("tv_id") tvShowId: Int): TvShowResult
}