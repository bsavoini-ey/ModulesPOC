package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository

class GetTvShowsUseCase(private val repository: MediaRepository) {

    fun execute() {
        repository.getTvShows()
    }

}