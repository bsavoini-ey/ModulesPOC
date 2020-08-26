package com.bsavoini.base_features

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class BaseViewModel : ViewModel() {
    protected fun <T> launchBackgroundJob(
        backgroundJob: suspend () -> T,
        onSuccess: (T) -> Unit = {},
        onError: (Throwable) -> Unit = {}
    ): Job = viewModelScope.launch {
        lunchBackgroundJobWithDispatching(
            job = { backgroundJob() },
            onSuccess = { result -> onSuccess(result) },
            onError = { error -> onError(error) }
        )
    }

    private suspend fun <T> lunchBackgroundJobWithDispatching(
        job: suspend () -> T,
        onSuccess: suspend (T) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        withContext(Dispatchers.IO) {
            runCatching { job.invoke() }
        }
            .onSuccess { onSuccess(it) }
            .onFailure { onError(it) }
    }

}