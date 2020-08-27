package com.bsavoini.storage.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bsavoini.storage.entities.FavoriteEntity

@Dao
interface FavoritesDao {

    @Query("SELECT * FROM Favorite ORDER BY timestamp DESC")
    fun selectAllBookmarks(): List<FavoriteEntity>

    @Query("SELECT * FROM Favorite where id = :id AND mediaType = :mediaType")
    fun selectBookmark(id: Int, mediaType: String): List<FavoriteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBookmark(favoriteEntity: FavoriteEntity)

    @Query("DELETE FROM Favorite where id = :id AND mediaType = :mediaType")
    fun removeBookmark(id: Int, mediaType: String): Int

}