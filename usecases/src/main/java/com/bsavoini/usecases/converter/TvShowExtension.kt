package com.bsavoini.usecases.converter

import com.bsavoini.repository.models.TvShowEntity
import com.bsavoini.usecases.domainobjects.TvShowDO

fun TvShowEntity.toTvShowDO() = TvShowDO(
    id = this.id,
    name = this.name
)
