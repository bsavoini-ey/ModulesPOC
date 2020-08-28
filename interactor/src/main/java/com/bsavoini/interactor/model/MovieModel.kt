package com.bsavoini.interactor.model

data class MovieModel(
    val id: Int,
    val name: String,
    val posterUrl: String,
    val isFavorite: Boolean
)