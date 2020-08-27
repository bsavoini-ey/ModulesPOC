package com.bsavoini.storage.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bsavoini.storage.entities.FavoriteEntity

@Dao
interface FavoritesDao {

    @Query("SELECT * FROM Favorite ORDER BY timestamp DESC")
    fun selectAllFavorites(): List<FavoriteEntity>

    @Query("SELECT * FROM Favorite where id = :id AND mediaType = :mediaType")
    fun getFavorite(id: Int, mediaType: String): List<FavoriteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavorite(favoriteEntity: FavoriteEntity)

    @Query("DELETE FROM Favorite where id = :id AND mediaType = :mediaType")
    fun removeFavorite(id: Int, mediaType: String): Int

}