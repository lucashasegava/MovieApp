package com.example.movieapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("homepage")
    @Expose
    private val homepage: String? = null,
    @SerializedName("id")
    @Expose
    private val id: Int? = null,
    @SerializedName("imdb_id")
    @Expose
    private val imdbId: String? = null,
    @SerializedName("original_language")
    @Expose
    private val originalLanguage: String? = null,
    @SerializedName("original_title")
    @Expose
    private val originalTitle: String? = null,
    @SerializedName("overview")
    @Expose
    private val overview: String? = null,
    @SerializedName("popularity")
    @Expose
    private val popularity: Double? = null,
    @SerializedName("poster_path")
    @Expose
    private val posterPath: String? = null)