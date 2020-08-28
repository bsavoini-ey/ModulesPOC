package com.bsavoini.repository

import com.bsavoini.repository.models.FavoriteEntity
import com.bsavoini.repository.models.MediaType

interface FavoritesRepository {

    fun addFavorite(favoriteEntity: FavoriteEntity)

    fun removeFavorite(favoriteEntity: FavoriteEntity)

    fun isFavorite(id: Int, mediaType: MediaType): Boolean

    fun listFavorites(): List<FavoriteEntity>

}