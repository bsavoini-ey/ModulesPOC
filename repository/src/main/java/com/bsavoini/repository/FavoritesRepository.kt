package com.bsavoini.repository

interface FavoritesRepository {

    fun addFavorite()

    fun removeFavorite()

    fun getFavorite()

}