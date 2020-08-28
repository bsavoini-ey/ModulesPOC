package com.bsavoini.repository.models

data class FavoriteEntity(val id: Int, val mediaType: MediaType)

enum class MediaType {
    MOVIE, TV_SHOW
}

