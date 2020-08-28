package com.bsavoini.base_features.extensions

import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory

private const val baseUrl = "https://image.tmdb.org/t/p/"

fun ImageView.loadImage(path: String) {
    val url = baseUrl + "w185" + path

    val factory = DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()

    Log.d("TMDbApi", "img_url: $url")

    Glide.with(this.context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade(factory))
        .into(this)
}