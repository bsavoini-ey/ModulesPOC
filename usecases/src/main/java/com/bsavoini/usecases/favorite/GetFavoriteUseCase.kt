package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository

class GetFavoriteUseCase(private val repository: FavoritesRepository) {

    fun execute() {
        repository.getFavorite()
    }

}