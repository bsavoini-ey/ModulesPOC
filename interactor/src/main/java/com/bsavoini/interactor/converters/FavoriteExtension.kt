package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.interactor.model.MediaType
import com.bsavoini.usecases.domainobjects.FavoriteDO

fun FavoriteDO.toFavoriteModel(name: String, posterPath: String, baseImgUrl: String) =
    FavoriteModel(
        id = this.id,
        name = name,
        posterUrl = baseImgUrl + posterPath,
        mediaType = MediaType.valueOf(this.mediaType.name)
    )