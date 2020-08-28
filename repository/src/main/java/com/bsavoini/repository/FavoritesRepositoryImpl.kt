package com.bsavoini.repository

import com.bsavoini.repository.converters.toRepositoryFavoriteEntity
import com.bsavoini.repository.converters.toStorageFavoriteEntity
import com.bsavoini.repository.models.FavoriteEntity
import com.bsavoini.repository.models.MediaType
import com.bsavoini.storage.daos.FavoritesDao
import java.util.*

class FavoritesRepositoryImpl(private val favoritesDao: FavoritesDao) : FavoritesRepository {

    override fun addFavorite(favoriteEntity: FavoriteEntity) {
        favoritesDao.insertFavorite(favoriteEntity.toStorageFavoriteEntity(getTimestamp()))
    }

    override fun removeFavorite(favoriteEntity: FavoriteEntity) {
        favoritesDao.removeFavorite(favoriteEntity.id, favoriteEntity.mediaType.name)
    }

    override fun isFavorite(id: Int, mediaType: MediaType): Boolean =
        favoritesDao.getFavorite(id, mediaType.name).isNotEmpty()


    override fun listFavorites(): List<FavoriteEntity> =
        favoritesDao.selectAllFavorites().map {
            it.toRepositoryFavoriteEntity()
        }

    private fun getTimestamp() = Date().time
}