package com.bsavoini.tvshows.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bsavoini.base_features.extensions.loadImage
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.tvshows.R
import kotlinx.android.synthetic.main.item_tv_show.view.*

class TvShowsAdapter(private val list: List<TvShowModel>) :
    RecyclerView.Adapter<TvShowsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        return TvShowsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_tv_show, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}

class TvShowsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(tvShow: TvShowModel): Unit = with(view) {
        txt_name.text = tvShow.name
        img_poster.loadImage(tvShow.posterUrl)
    }
}

