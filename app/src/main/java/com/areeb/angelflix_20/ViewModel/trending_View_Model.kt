package com.areeb.angelflix_20.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.areeb.angelflix_20.Network.Trending_api
import com.areeb.angelflix_20.TrendingModel.Trending_Response
import com.areeb.angelflix_20.TrendingModel.results
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class trending_View_Model :ViewModel(){

    val trending_movies :LiveData<List<results>> = MutableLiveData()
    init {
        viewModelScope.launch {
            trending_movies as MutableLiveData
         trending_movies.value = getTrending_Movies()

        }


    }
    private suspend fun getTrending_Movies(): List<results>? {
        return withContext(Dispatchers.IO){
            Trending_api().getTrending_movies().body()?.results
        }
    }

}