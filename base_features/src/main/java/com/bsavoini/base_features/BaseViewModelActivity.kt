package com.bsavoini.base_features

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

abstract class BaseViewModelActivity : AppCompatActivity() {

    protected fun <T> LiveData<T>.invokeOnChanged(block: (value: T) -> (Unit)) =
        observe(
            this@BaseViewModelActivity,
            Observer { v -> block.invoke(v) }
        )
}