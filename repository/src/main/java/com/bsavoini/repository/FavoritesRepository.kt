package com.bsavoini.repository

interface FavoritesRepository {

    fun addFavorite(id: Int): Boolean

    fun removeFavorite(id: Int): Boolean

    fun getFavorite(id: Int): Boolean

}