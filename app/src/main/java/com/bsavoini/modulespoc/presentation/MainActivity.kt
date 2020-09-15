package com.bsavoini.modulespoc.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import com.bsavoini.base_features.BaseViewModelActivity
import com.bsavoini.base_features.getMoviesActivityName
import com.bsavoini.base_features.getTvShowsActivityName
import com.bsavoini.interactor.model.FavoriteModel
import com.bsavoini.modulespoc.R
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseViewModelActivity() {
    private val viewModel: MainViewModel by viewModel()
    private lateinit var manager: SplitInstallManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = SplitInstallManagerFactory.create(this)
        title = getString(R.string.main_title)
        initViewModelObservers()
        addClickListeners()
    }

    override fun onResume() {
        manager.registerListener(listener)
        super.onResume()
        viewModel.listFavorites()
    }

    override fun onPause() {
        manager.unregisterListener(listener)
        super.onPause()
    }

    private fun initViewModelObservers() {
        viewModel.favorites.invokeOnChanged {
            list_favorites.adapter = MainAdapter(it.toMutableList(), ::onClickFavorite)
        }
    }

    private fun addClickListeners() {
        btn_tv_shows.setOnClickListener {
            openTvShows()
        }

        btn_movies.setOnClickListener {
            openMovies()
        }
    }

    private fun openTvShows() {
        startActivity(Intent().setClassName(this, getTvShowsActivityName()))
    }

    private fun openMovies() {
        val moviesModuleName = getString(R.string.module_movies)
        if (manager.installedModules.contains(moviesModuleName)) {
            onSuccessfulLoad()
        } else {
            // Create request to install a feature module by name.
            val request = SplitInstallRequest.newBuilder()
                .addModule(moviesModuleName)
                .build()
            manager.startInstall(request)
        }
    }

    private fun onClickFavorite(favorite: FavoriteModel) {
        viewModel.unfavorite(favorite)
    }

    private val listener = SplitInstallStateUpdatedListener { state ->
        when (state.status()) {
            //  In order to see this, the application has to be uploaded to the Play Store.
            SplitInstallSessionStatus.DOWNLOADING -> displayLoading()
            SplitInstallSessionStatus.INSTALLED -> onSuccessfulLoad()
            SplitInstallSessionStatus.INSTALLING -> displayLoading()
            SplitInstallSessionStatus.FAILED -> displayError()
            else -> displayError()
        }
    }

    private fun onSuccessfulLoad() {
        startActivity(Intent().setClassName(this, getMoviesActivityName()))
    }

    fun displayLoading() {
        Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show()
    }

    fun displayError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
    }
}