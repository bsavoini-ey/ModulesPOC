package com.bsavoini.modulespoc.presentation

import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.FavoritesInteractor

class MainViewModel(private val favoritesInteractor: FavoritesInteractor) : BaseViewModel() {

    fun listFavorites() {
        launchBackgroundJob(
            { favoritesInteractor.listFavorites() }
        )
    }
}