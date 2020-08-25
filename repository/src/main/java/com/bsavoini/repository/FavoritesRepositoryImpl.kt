package com.bsavoini.repository

import android.util.Log

class FavoritesRepositoryImpl : FavoritesRepository {
    override fun addFavorite(id: Int): Boolean {
        Log.d("svn", "adding favorite")
        return false
    }

    override fun removeFavorite(id: Int): Boolean {
        Log.d("svn", "removing favorite")
        return false
    }

    override fun getFavorite(id: Int): Boolean {
        Log.d("svn", "getting favorite")
        return false
    }
}