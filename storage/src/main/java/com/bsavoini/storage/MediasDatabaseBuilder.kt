package com.bsavoini.storage

import android.content.Context
import androidx.room.Room

class MediasDatabaseBuilder(private val context: Context) {
    fun build(): MediasDatabase = Room.databaseBuilder(
        context, MediasDatabase::class.java, "medias-database"
    ).build()
}