package com.bsavoini.repository

import com.bsavoini.repository.models.FavoriteEntity
import com.bsavoini.repository.models.MediaTypeEntity

interface FavoritesRepository {

    fun addFavorite(favoriteEntity: FavoriteEntity): Boolean

    fun removeFavorite(favoriteEntity: FavoriteEntity): Boolean

    fun isFavorite(id: Int, mediaType: MediaTypeEntity): Boolean

    fun listFavorites(): List<FavoriteEntity>

}