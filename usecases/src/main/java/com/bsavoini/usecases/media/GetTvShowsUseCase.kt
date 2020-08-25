package com.bsavoini.usecases.media

import com.bsavoini.repository.MediaRepository
import com.bsavoini.usecases.BaseUseCase

class GetTvShowsUseCase(private val repository: MediaRepository) :
    BaseUseCase<List<String>, Unit>() {

    override  fun getResult(params: Unit): List<String> =
        repository.getTvShows()

}