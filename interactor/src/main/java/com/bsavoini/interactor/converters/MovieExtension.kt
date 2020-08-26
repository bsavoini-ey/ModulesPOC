package com.bsavoini.interactor.converters

import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.usecases.domainobjects.MovieDO

fun MovieDO.toMovieModel() =
    MovieModel(id, name)
