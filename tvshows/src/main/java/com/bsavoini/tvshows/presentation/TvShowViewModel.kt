package com.bsavoini.tvshows.presentation

import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.TvShowsInteractor
import com.bsavoini.interactor.model.TvShowModel

class TvShowViewModel(
    private val tvShowsInteractor: TvShowsInteractor
) : BaseViewModel() {

    fun listTvShows() {
        launchBackgroundJob({
            val list: List<TvShowModel> = tvShowsInteractor.listTvShow()
        })
    }

    fun toggleFavorite(id: Int) {
        launchBackgroundJob({
            tvShowsInteractor.toggleFavorite(id)
        })
    }
}