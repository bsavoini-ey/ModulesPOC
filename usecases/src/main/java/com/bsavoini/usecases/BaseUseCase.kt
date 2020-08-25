package com.bsavoini.usecases

abstract class BaseUseCase<out ResultType, in Params> where ResultType : Any? {

    protected abstract  fun getResult(params: Params): ResultType

     fun execute(params: Params): ResultType =
        kotlin.runCatching {
            getResult(params)
        }.getOrThrow()
}