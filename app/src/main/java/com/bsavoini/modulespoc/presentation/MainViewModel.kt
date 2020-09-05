package com.bsavoini.modulespoc.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bsavoini.base_features.BaseViewModel
import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.model.FavoriteModel

class MainViewModel(private val favoritesInteractor: FavoritesInteractor) : BaseViewModel() {
    private val _favorites = MutableLiveData<List<FavoriteModel>>()
    val favorites: LiveData<List<FavoriteModel>>
        get() = _favorites

    fun listFavorites() {
        launchBackgroundJob(
            backgroundJob = { favoritesInteractor.getFavorites() },
            onSuccess = { _favorites.value = it }
        )
    }

    fun unfavorite(favorite: FavoriteModel) {
        launchBackgroundJob(
            backgroundJob = { favoritesInteractor.unfavorite(favorite) }
        )
    }
}