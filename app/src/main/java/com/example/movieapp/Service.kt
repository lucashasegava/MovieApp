package com.example.movieapp

import retrofit2.Call
import retrofit2.http.GET
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import retrofit2.http.Query


interface Service {
    @GET()
    fun getHomepage(@Query("api_key")apiKey: String): Call<Movies>
}