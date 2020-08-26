package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.interactor.model.MediaType
import com.bsavoini.usecases.domainobjects.FavoriteDO

fun FavoriteDO.toFavoriteModel() = FavoriteModel(
    id = this.id,
    mediaType = MediaType.valueOf(this.mediaType.name)
)