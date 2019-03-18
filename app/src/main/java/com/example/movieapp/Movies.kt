package com.example.movieapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("homepage")

    private val homepage: String? = null,
    @SerializedName("id")

    private val id: Int? = null,
    @SerializedName("imdb_id")

    private val imdbId: String? = null,
    @SerializedName("original_language")

    private val originalLanguage: String? = null,
    @SerializedName("original_title")

    private val originalTitle: String? = null,
    @SerializedName("overview")

    private val overview: String? = null,
    @SerializedName("popularity")

    private val popularity: Double? = null,
    @SerializedName("poster_path")

    private val posterPath: String? = null,
    @SerializedName("page")

    private val page: Int? = null,
    @SerializedName("total_results")

    private val totalResults: Int? = null,
    @SerializedName("total_pages")

    private val totalPages: Int? = null,
    @SerializedName("results")

    private val results: List<Result>? = null
)