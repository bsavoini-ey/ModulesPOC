package com.bsavoini.base_features.extensions

import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory


fun ImageView.loadImage(url: String) {

    val factory = DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()

    Log.d("TMDbApi", "img_url: $url")

    Glide.with(this.context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade(factory))
        .into(this)
}