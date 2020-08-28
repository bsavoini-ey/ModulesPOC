package com.bsavoini.repository

import com.bsavoini.network.TMDbApi
import com.bsavoini.repository.converters.toMovieEntity
import com.bsavoini.repository.converters.toTvShowEntity
import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.repository.models.TvShowEntity

class MediaRepositoryImpl(private val api: TMDbApi) :
    MediaRepository {

    override suspend fun getMovies(): List<MovieEntity> =
        api.getPopularMovies().moviesResults.map {
            it.toMovieEntity()
        }

    override suspend fun getMovie(id: Int): MovieEntity =
        api.getMovie(id).toMovieEntity()

    override suspend fun getTvShows(): List<TvShowEntity> =
        api.getPopularTvShow().tvShowsResults.map {
            it.toTvShowEntity()
        }

    override suspend fun getTvShow(id: Int): TvShowEntity =
        api.getTvShow(id).toTvShowEntity()
}