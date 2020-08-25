package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository

class RemoveFavoriteUseCase(private val repository: FavoritesRepository) {

    fun execute() {
        repository.removeFavorite()
    }

}