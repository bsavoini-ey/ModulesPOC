package com.bsavoini.usecases.domainobjects

data class FavoriteDO(val id: Int, val mediaType: MediaTypeDO)

enum class MediaTypeDO {
    MOVIE, TV_SHOW
}
