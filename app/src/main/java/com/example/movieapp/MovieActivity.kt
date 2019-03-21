package com.example.movieapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MovieActivity: AppCompatActivity(), MovieContract.View{

    private lateinit var mPresenter: MovieContract.Presenter<MovieContract.View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val call = RetrofitInitializer().service().getMovies("8540f684438581281cf0e13472d312ec")
        call.enqueue()



}