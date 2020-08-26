package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.repository.models.MovieEntity
import com.bsavoini.usecases.BaseUseCase
import com.bsavoini.usecases.domainobjects.MovieDO

class GetMoviesUseCase(private val repository: MediaRepository) :
    BaseUseCase<List<MovieDO>, Unit>() {

    override fun getResult(params: Unit): List<MovieDO> =
        repository.getMovies().map {
            it.toMovieDO()
        }


    private fun MovieEntity.toMovieDO() =
        MovieDO(this.id, this.name)
}