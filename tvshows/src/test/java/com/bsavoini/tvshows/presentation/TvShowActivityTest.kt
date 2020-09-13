package com.bsavoini.tvshows.presentation

import com.bsavoini.base_features.getTvShowsActivityName
import org.junit.Assert.*
import org.junit.Test

class TvShowActivityTest {

    @Test
    fun `GIVEN tvShow route THEN it should be equal TvShowActivity path`() {
        val tvShowRoute = getTvShowsActivityName()
        val tvShowActivityPath = TvShowActivity::class.java.canonicalName
        assertEquals(tvShowRoute, tvShowActivityPath)
    }

}