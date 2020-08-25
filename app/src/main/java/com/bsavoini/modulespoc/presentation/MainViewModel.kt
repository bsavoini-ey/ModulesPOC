package com.bsavoini.modulespoc.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.TvShowsInteractor

class MainViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val tvShowsInteractor: TvShowsInteractor,
    private val favoritesInteractor: FavoritesInteractor
) {

    fun listMovies() {
        moviesInteractor.listMovies()
    }

    fun listTvShows() {
        tvShowsInteractor.listTvShow()
    }

    fun toggleFavorite(id: Int) {
        favoritesInteractor.toggleFavorite(id)
    }

    fun isFavorite(id: Int) = favoritesInteractor.isFavorite(id)


}