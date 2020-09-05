package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.interactor.model.MediaType
import com.bsavoini.usecases.domainobjects.FavoriteDO
import com.bsavoini.usecases.domainobjects.MediaTypeDO

fun FavoriteDO.toFavoriteModel(name: String, posterPath: String, baseImgUrl: String) =
    FavoriteModel(
        id = this.id,
        name = name,
        posterUrl = baseImgUrl + posterPath,
        mediaType = MediaType.valueOf(this.mediaType.name)
    )

fun FavoriteModel.toFavoriteDO() =
    FavoriteDO(
        id = this.id,
        mediaType = MediaTypeDO.valueOf(this.mediaType.name)
    )