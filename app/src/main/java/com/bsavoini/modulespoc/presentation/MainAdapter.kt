package com.bsavoini.modulespoc.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.modulespoc.R
import kotlinx.android.synthetic.main.item_favorite.view.*

class MainAdapter(private val list: List<FavoriteModel>) :
    RecyclerView.Adapter<FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        return FavoriteViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_movies, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}

class FavoriteViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(favorite: FavoriteModel): Unit = with(view) {
        txt_name.text = favorite.name
    }
}

