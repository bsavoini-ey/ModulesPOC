package com.bsavoini.repository.converters

import com.bsavoini.network.responses.TvShowResult
import com.bsavoini.repository.models.TvShowEntity

fun TvShowResult.toTvShowEntity() = TvShowEntity(
    id = this.id,
    name = this.name
)