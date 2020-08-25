package com.bsavoini.modulespoc.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.TvShowsInteractor
import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.interactor.model.TvShowModel

class MainViewModel(
    private val moviesInteractor: MoviesInteractor,
    private val tvShowsInteractor: TvShowsInteractor,
    private val favoritesInteractor: FavoritesInteractor
) {

    fun listMovies() {
        val list: List<MovieModel> = moviesInteractor.listMovies()
    }

    fun listTvShows() {
        val list: List<TvShowModel> = tvShowsInteractor.listTvShow()
    }

    fun toggleFavorite(id: Int) {
        favoritesInteractor.toggleFavorite(id)
    }

    fun isFavorite(id: Int) = favoritesInteractor.isFavorite(id)

}