package com.bsavoini.repository

import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.repository.models.TvShowEntity

interface MediaRepository {

    fun getMovies(): List<MovieEntity>

    fun getTvShows(): List<TvShowEntity>
}