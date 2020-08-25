package com.bsavoini.repository

interface MediaRepository {

    fun getMovies(): List<MovieEntity>

    fun getTvShows(): List<TvShowEntity>
}