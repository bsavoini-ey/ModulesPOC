package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.interactor.model.MediaType
import com.bsavoini.usecases.domainobjects.FavoriteDO

fun FavoriteDO.toFavoriteModel(name: String, posterUrl: String) = FavoriteModel(
    id = this.id,
    name = name,
    posterUrl = posterUrl,
    mediaType = MediaType.valueOf(this.mediaType.name)
)