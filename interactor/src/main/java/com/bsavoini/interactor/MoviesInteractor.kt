package com.bsavoini.interactor

import android.util.Log
import com.bsavoini.usecases.media.GetMoviesUseCase

class MoviesInteractor(private val moviesUseCase: GetMoviesUseCase) {

    fun oi(){
        Log.d("svn", "mah oe!")
    }
    suspend fun listMovies() =
        moviesUseCase.execute(Unit)

}