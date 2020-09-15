package com.bsavoini.modulespoc.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bsavoini.base_features.extensions.loadImage
import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.modulespoc.R

class MainAdapter(
    private val list: MutableList<FavoriteModel>,
    private val onClickFavorite: (FavoriteModel) -> Unit
) :
    RecyclerView.Adapter<FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        return FavoriteViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_favorite, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(list[position]) { favorite ->
            onClickFavorite(favorite)
            list.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, list.size)
        }
    }

    override fun getItemCount(): Int = list.size
}

class FavoriteViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(favorite: FavoriteModel, onClickFavorite: (FavoriteModel) -> Unit): Unit = with(view) {
        findViewById<TextView>(R.id.txt_name).text = favorite.name
        findViewById<ImageView>(R.id.img_poster).loadImage(favorite.posterUrl)
        findViewById<ImageView>(R.id.img_fav).isSelected = true

        this.setOnClickListener {
            onClickFavorite(favorite)
        }
    }
}

