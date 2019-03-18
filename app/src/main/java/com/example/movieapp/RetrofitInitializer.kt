package com.example.movieapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer{

        private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/movie/popular?")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun service(): Service{
        return retrofit.create(Service::class.java)
    }

}