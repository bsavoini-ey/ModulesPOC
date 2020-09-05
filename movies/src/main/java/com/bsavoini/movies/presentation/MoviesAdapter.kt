package com.bsavoini.movies.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bsavoini.base_features.extensions.loadImage
import com.bsavoini.interactor.model.MovieModel
import com.bsavoini.movies.R
import kotlinx.android.synthetic.main.item_movies.view.*

class MoviesAdapter(
    private val list: List<MovieModel>,
    private val onClickFavorite: (Int) -> Unit
) :
    RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_movies, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(list[position]) { id ->
            onClickFavorite(id)
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = list.size
}

class MoviesViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(movie: MovieModel, onClickFavorite: (Int) -> Unit): Unit = with(view) {
        txt_name.text = movie.name
        img_poster.loadImage(movie.posterUrl)
        img_fav.isSelected = movie.isFavorite

        this.setOnClickListener {
            movie.isFavorite = movie.isFavorite.not()
            onClickFavorite(movie.id)
        }
    }
}