package com.bsavoini.repository

interface MediaRepository {

    fun getMovies(): List<String>

    fun getTvShows(): List<String>
}