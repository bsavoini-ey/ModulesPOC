package com.bsavoini.repository

import android.util.Log

class MediaRepositoryImpl : MediaRepository {
    override fun getMovies(): List<MovieEntity> {
        Log.d("svn", "getting movies")
        return listOf()
    }

    override fun getTvShows(): List<TvShowEntity> {
        Log.d("svn", "getting tvShows")
        return listOf()
    }
}