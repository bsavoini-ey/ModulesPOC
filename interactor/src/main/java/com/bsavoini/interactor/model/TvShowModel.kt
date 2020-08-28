package com.bsavoini.interactor.model

data class TvShowModel(
    val id: Int,
    val name: String,
    val posterUrl: String,
    val isFavorite: Boolean
)