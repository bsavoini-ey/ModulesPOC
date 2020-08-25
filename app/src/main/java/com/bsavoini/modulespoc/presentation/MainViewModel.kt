package com.bsavoini.modulespoc.presentation

import com.bsavoini.interactor.FavoritesInteractor
import com.bsavoini.interactor.MoviesInteractor
import com.bsavoini.interactor.TvShowsInteractor

class MainViewModel(
    val moviesInteractor: MoviesInteractor,
    val tvShowsInteractor: TvShowsInteractor,
    val favoritesInteractor: FavoritesInteractor
) {

    fun oi(){
        moviesInteractor.oi()
    }

}