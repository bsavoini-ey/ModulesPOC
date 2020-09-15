package com.angelicao.favorite.di

import com.bsavoini.movies.di.moviesKoinApplication
import org.koin.core.Koin
import org.koin.core.KoinComponent

interface MoviesKoinComponent : KoinComponent {
    override fun getKoin(): Koin = moviesKoinApplication.koin
}