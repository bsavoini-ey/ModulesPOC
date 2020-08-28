package com.bsavoini.usecases.converter

import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.usecases.domainobjects.MovieDO

fun MovieEntity.toMovieDO() = MovieDO(
    id = this.id,
    name = this.name,
    posterUrl = this.posterUrl
)