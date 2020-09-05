package com.bsavoini.tvshows.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bsavoini.base_features.extensions.loadImage
import com.bsavoini.interactor.model.TvShowModel
import com.bsavoini.tvshows.R

class TvShowsAdapter(
    private val list: List<TvShowModel>,
    private val onClickFavorite: (Int) -> Unit
) :
    RecyclerView.Adapter<TvShowsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        return TvShowsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_favorite, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        holder.bind(list[position]) { id ->
            onClickFavorite(id)
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = list.size
}

class TvShowsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(tvShow: TvShowModel, onClickFavorite: (Int) -> Unit): Unit = with(view) {
        findViewById<TextView>(R.id.txt_name).text = tvShow.name
        findViewById<ImageView>(R.id.img_poster).loadImage(tvShow.posterUrl)
        findViewById<ImageView>(R.id.img_fav).isSelected = tvShow.isFavorite

        this.setOnClickListener {
            tvShow.isFavorite = tvShow.isFavorite.not()
            onClickFavorite(tvShow.id)
        }
    }
}

