package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var movieImageView: ImageView
    private lateinit var nameTextView: TextView
    private lateinit var titleTextView: TextView
    private lateinit var synopsisTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        movieImageView = findViewById(R.id.movieImage)
        nameTextView = findViewById(R.id.actorName)
        titleTextView = findViewById(R.id.movieTitle)
        synopsisTextView = findViewById(R.id.movieSynopsis)

        // TODO: Get the extra from the Intent
        val trendingActors = intent.getSerializableExtra(TRENDING_ACTORS_EXTRA) as TrendingActors

        // TODO: Set the title, byline, and abstract information from the article
        nameTextView.text = trendingActors.name
        titleTextView.text = "Stars in " + trendingActors.knownFor?.firstOrNull { it.title != null }?.title
        synopsisTextView.text = "Overview of movie:\n" + trendingActors.knownFor?.firstOrNull { it.overview != null }?.overview

        // TODO: Load the media image
        Glide.with(this)
            .load(trendingActors.movieImageUrl) // Fix
            .into(movieImageView)
    }
}