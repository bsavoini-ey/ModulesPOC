package com.bsavoini.repository

import android.util.Log
import com.bsavoini.repository.models.FavoriteEntity
import com.bsavoini.repository.models.MediaTypeEntity
import com.bsavoini.storage.daos.FavoritesDao

class FavoritesRepositoryImpl(val favoritesDao: FavoritesDao) : FavoritesRepository {
    override fun addFavorite(favoriteEntity: FavoriteEntity): Boolean {
        return false
    }

    override fun removeFavorite(favoriteEntity: FavoriteEntity): Boolean {
        Log.d("svn", "removing favorite")
        return false
    }

    override fun isFavorite(id: Int, mediaType: MediaTypeEntity): Boolean {
        Log.d("svn", "is favorite")
        return false
    }

    override fun listFavorites(): List<FavoriteEntity> {
        Log.d("svn", "list favorites")
        return listOf()
    }
}