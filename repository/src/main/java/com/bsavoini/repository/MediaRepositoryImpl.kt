package com.bsavoini.repository

import android.util.Log

class MediaRepositoryImpl : MediaRepository {
    override fun getMovies(): List<String> {
        Log.d("svn", "getting movies")
        return listOf()
    }

    override fun getTvShows(): List<String> {
        Log.d("svn", "getting tvShows")
        return listOf()
    }
}