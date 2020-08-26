package com.bsavoini.repository

import android.util.Log
import com.bsavoini.network.TMDbApi
import com.bsavoini.repository.converters.toMovieEntity
import com.bsavoini.repository.converters.toTvShowEntity
import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.repository.models.TvShowEntity

class MediaRepositoryImpl(val api: TMDbApi) : MediaRepository {
    override suspend fun getMovies(): List<MovieEntity> {
        Log.d("svn", "getting movies")
        return api.getPopularMovies().moviesResults.map {
            it.toMovieEntity()
        }
    }

    override suspend fun getTvShows(): List<TvShowEntity> {
        Log.d("svn", "getting tvShows")
        return api.getPopularTvShow().tvShowsResults.map {
            it.toTvShowEntity()
        }
    }
}