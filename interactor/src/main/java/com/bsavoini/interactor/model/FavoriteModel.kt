package com.bsavoini.interactor.model

data class FavoriteModel(val id: Int, val mediaType: MediaType)

enum class MediaType{
    MOVIE , TV_SHOW
}