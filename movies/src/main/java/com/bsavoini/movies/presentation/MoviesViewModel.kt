package com.bsavoini.movies.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.model.MovieModel

class MoviesViewModel(
    private val moviesInteractor: MoviesInteractor
) : BaseViewModel() {
    private val _movies = MutableLiveData<List<MovieModel>>()
    val movies: LiveData<List<MovieModel>>
        get() = _movies

    fun listMovies() {
        launchBackgroundJob(
            { moviesInteractor.listMovies() },
            { _movies.value = it })
    }

    fun toggleFavorite(id: Int) {
        launchBackgroundJob(
            { moviesInteractor.toggleFavorite(id) },
            {}
        )
    }
}