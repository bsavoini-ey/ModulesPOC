package com.bsavoini.storage.entities

import androidx.room.TypeConverter

class MediaTypeConverter {
    @TypeConverter
    fun fromString(value: String): MediaType {
        return MediaType.valueOf(value)
    }

    @TypeConverter
    fun mediaTypeToString(mediaType: MediaType): String {
        return mediaType.toString()
    }
}