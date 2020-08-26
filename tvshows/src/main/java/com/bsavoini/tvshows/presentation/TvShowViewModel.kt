package com.bsavoini.tvshows.presentation

import com.bsavoini.interactor.FavoriteTvShowsInteractor
import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.TvShowsInteractor
import com.bsavoini.interactor.model.TvShowModel

class TvShowViewModel(
    private val tvShowsInteractor: TvShowsInteractor,
    private val favoriteTvShowsInteractor: FavoriteTvShowsInteractor
) {

    fun listTvShows() {
        val list: List<TvShowModel> = tvShowsInteractor.listTvShow()
    }

    fun toggleFavorite(id: Int) {
        favoriteTvShowsInteractor.toggleFavorite(id)
    }

}