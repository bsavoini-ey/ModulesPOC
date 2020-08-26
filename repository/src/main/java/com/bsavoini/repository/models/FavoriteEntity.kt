package com.bsavoini.repository.models

data class FavoriteEntity(val id: Int, val mediaType: MediaTypeEntity)

enum class MediaTypeEntity {
    MOVIE, TV_SHOW
}

