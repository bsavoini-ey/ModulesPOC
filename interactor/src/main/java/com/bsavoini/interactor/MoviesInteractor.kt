package com.bsavoini.interactor

import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.usecases.MovieDO
import com.bsavoini.usecases.media.GetMoviesUseCase

class MoviesInteractor(private val moviesUseCase: GetMoviesUseCase) {

    fun listMovies(): List<MovieModel> =
        moviesUseCase.execute(Unit).map {
            it.toMovieModel()
        }

    private fun MovieDO.toMovieModel() =
        MovieModel(id, name)

}