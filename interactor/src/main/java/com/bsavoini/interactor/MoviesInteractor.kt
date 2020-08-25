package com.bsavoini.interactor

import com.bsavoini.usecases.media.GetMoviesUseCase

class MoviesInteractor(private val moviesUseCase: GetMoviesUseCase) {

    suspend fun listMovies() =
        moviesUseCase.execute(Unit)

}