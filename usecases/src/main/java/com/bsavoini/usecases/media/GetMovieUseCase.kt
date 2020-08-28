package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.converter.toMovieDO
import com.bsavoini.usecases.domainobjects.MovieDO

class GetMovieUseCase(private val repository: MediaRepository) :
    BaseUseCase<MovieDO, Int>() {

    override suspend fun getResult(id: Int): MovieDO =
        repository.getMovie(id).toMovieDO()
}