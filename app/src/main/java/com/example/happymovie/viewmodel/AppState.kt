package com.example.happymovie.viewmodel

import com.example.happymovie.model.SearchMovies

sealed class AppState {

    data class Success(val testSearch: SearchMovies) : AppState()
    data class Fail(val error: Throwable) : AppState()
    object Loading : AppState()


}
