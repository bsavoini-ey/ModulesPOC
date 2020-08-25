package com.bsavoini.usecases.favorite

import com.bsavoini.repository.FavoritesRepository

class AddFavoriteUseCase(private val repository: FavoritesRepository) {

    fun execute() {
        repository.addFavorite()
    }
}