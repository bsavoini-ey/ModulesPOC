package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.usecases.BaseUseCase

class GetMoviesUseCase(private val repository: MediaRepository) :
    BaseUseCase<List<String>, Unit>() {

    override suspend fun getResult(params: Unit): List<String> =
        repository.getMovies()

}