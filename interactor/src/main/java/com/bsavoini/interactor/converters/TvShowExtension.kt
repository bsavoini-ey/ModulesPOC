package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.domainobjects.TvShowDO

fun TvShowDO.toTvShowModel(isFavorite: Boolean, baseImgUrl: String) =
    TvShowModel(
        id = id,
        name = name,
        posterUrl = baseImgUrl + this.posterPath,
        isFavorite = isFavorite
    )