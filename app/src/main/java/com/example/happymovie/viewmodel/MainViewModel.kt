package com.example.happymovie.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.happymovie.model.Repository
import com.example.happymovie.model.RepositoryImpl

class MainViewModel  (

    private val liveDataToObserve : MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl())
    : ViewModel()
{

    fun getLiveData() = liveDataToObserve

    fun getMoviesFromLocalSource() = getDataFromLocalSource()

    fun getMoviesFromRemoteSource() = getDataFromLocalSource()


    private fun getDataFromLocalSource() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(2000)
            liveDataToObserve.postValue(AppState.Success(repositoryImpl.getMoviesFromServer()))
        }.start()
    }
}