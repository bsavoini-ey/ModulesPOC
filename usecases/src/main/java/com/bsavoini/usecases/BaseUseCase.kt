package com.bsavoini.usecases

abstract class BaseUseCase<out ResultType, in Params> where ResultType : Any? {

    protected abstract suspend fun getResult(params: Params): ResultType

    suspend fun execute(params: Params): ResultType =
        kotlin.runCatching {
            getResult(params)
        }.getOrThrow()
}