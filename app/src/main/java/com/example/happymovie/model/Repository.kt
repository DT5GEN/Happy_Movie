package com.example.happymovie.model

interface Repository {

    fun getMoviesFromServer(): SearchMovies
    fun getMoviesFromLocalStorage(): SearchMovies

}