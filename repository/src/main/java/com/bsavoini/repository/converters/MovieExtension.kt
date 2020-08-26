package com.bsavoini.repository.converters

import com.bsavoini.network.responses.MovieResult
import com.bsavoini.repository.models.MovieEntity

fun MovieResult.toMovieEntity() = MovieEntity(
    id = this.id,
    name = this.title
)