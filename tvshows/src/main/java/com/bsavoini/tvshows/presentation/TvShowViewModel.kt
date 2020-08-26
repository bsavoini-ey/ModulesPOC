package com.bsavoini.tvshows.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.TvShowsInteractor
import com.bsavoini.interactor.model.TvShowModel

class TvShowViewModel(
    private val tvShowsInteractor: TvShowsInteractor,
    private val favoritesInteractor: FavoritesInteractor
) {

    fun listTvShows() {
        val list: List<TvShowModel> = tvShowsInteractor.listTvShow()
    }

    fun toggleFavorite(id: Int) {
        favoritesInteractor.toggleFavorite(id)
    }

    fun isFavorite(id: Int) = favoritesInteractor.isFavorite(id)
}