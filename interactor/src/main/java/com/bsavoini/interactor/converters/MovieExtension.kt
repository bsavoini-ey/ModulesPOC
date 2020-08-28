package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.usecases.domainobjects.MovieDO

fun MovieDO.toMovieModel(isFavorite: Boolean, baseImgUrl: String) =
    MovieModel(
        id = id,
        name = name,
        posterUrl = baseImgUrl + this.posterPath,
        isFavorite = isFavorite
    )
