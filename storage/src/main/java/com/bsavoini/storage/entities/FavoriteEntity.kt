package com.bsavoini.storage.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Favorite")
data class FavoriteEntity(
    @PrimaryKey val id: Int,
    val mediaType: MediaType,
    val timestamp: Long
)

enum class MediaType{
    MOVIE , TV_SHOW
}