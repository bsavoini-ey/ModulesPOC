package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.usecases.domainobjects.TvShowDO

fun TvShowDO.toTvShowModel(isFavorite: Boolean) =
    TvShowModel(
        id = id,
        name = name,
        isFavorite = isFavorite
    )