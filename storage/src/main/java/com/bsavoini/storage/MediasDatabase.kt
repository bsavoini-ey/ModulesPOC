package com.bsavoini.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bsavoini.storage.daos.FavoritesDao
import com.bsavoini.storage.entities.FavoriteEntity
import com.bsavoini.storage.entities.MediaTypeConverter

@Database(entities = [FavoriteEntity::class], version = 1)
@TypeConverters(MediaTypeConverter::class)
abstract class MediasDatabase : RoomDatabase() {
    abstract fun favoritesDao(): FavoritesDao
}