package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository

class GetMoviesUseCase(private val repository: MediaRepository) {

    fun execute() {
        repository.getMovies()
    }

}