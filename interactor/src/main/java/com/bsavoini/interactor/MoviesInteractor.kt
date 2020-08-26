package com.bsavoini.interactor

import com.bsavoini.interactor.converters.toMovieModel
import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.domainobjects.MediaTypeDO
import com.bsavoini.usecases.domainobjects.MovieDO
import com.bsavoini.usecases.favorite.IsFavoriteUseCase
import com.bsavoini.usecases.media.GetMoviesUseCase

class MoviesInteractor(
    private val moviesUseCase: GetMoviesUseCase,
    private val isFavoriteUseCase: IsFavoriteUseCase
) {

    fun listMovies(): List<MovieModel> =
        moviesUseCase.execute(Unit).map {
            it.toMovieModel(isFavorite(it))
        }

    private fun isFavorite(movieDO: MovieDO) =
        isFavoriteUseCase.execute(
            IsFavoriteUseCase.Params(
                id = movieDO.id,
                mediaType = MediaTypeDO.MOVIE
            )
        )
}