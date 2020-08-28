package com.bsavoini.tvshows.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.TvShowsInteractor
import com.bsavoini.interactor.model.TvShowModel

class TvShowViewModel(
    private val tvShowsInteractor: TvShowsInteractor
) : BaseViewModel() {
    private val _tvShows = MutableLiveData<List<TvShowModel>>()
    val tvShows: LiveData<List<TvShowModel>>
        get() = _tvShows

    fun listTvShows() {
        launchBackgroundJob(
            { tvShowsInteractor.listTvShow() },
            { _tvShows.value = it })
    }

    fun toggleFavorite(id: Int) {
        launchBackgroundJob(
            { tvShowsInteractor.toggleFavorite(id) },
            {}
        )
    }
}