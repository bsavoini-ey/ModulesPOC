package com.bsavoini.movies.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bsavoini.interactor.FavoriteMoviesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MoviesViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val favoritesMoviesInteractor: FavoriteMoviesInteractor
) : ViewModel() {
    fun listMovies() {
        launchBackgroundJob(
            {
                val list: List<MovieModel> = moviesInteractor.listMovies()
                Log.d("svn", "list: $list")
            }
        )
    }

    fun toggleFavorite(id: Int) {
        launchBackgroundJob({
            favoritesMoviesInteractor.toggleFavorite(id)
        })
    }

    protected fun <T> launchBackgroundJob(
        backgroundJob: suspend () -> T,
        onSuccess: (T) -> Unit = {},
        onError: (Throwable) -> Unit = {}
    ): Job = viewModelScope.launch {
        lunchBackgroundJobWithDispatching(
            job = { backgroundJob() },
            onSuccess = { result -> onSuccess(result) },
            onError = { error -> onError(error) }
        )
    }

    private suspend fun <T> lunchBackgroundJobWithDispatching(
        job: suspend () -> T,
        onSuccess: suspend (T) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        withContext(Dispatchers.IO) {
            runCatching { job.invoke() }
        }
            .onSuccess { onSuccess(it) }
            .onFailure { onError(it) }
    }
}