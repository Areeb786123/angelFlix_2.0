package com.areeb.angelflix_20.Network

import com.areeb.angelflix_20.TrendingModel.Trending_Response
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Trending_api {
    @GET("3/trending/all/day?api_key=19e9185cec4a98676856644d3e66cc2c")
    suspend fun getTrending_movies():Response<Trending_Response>

    companion object{
        operator  fun invoke():Trending_api{
            return  Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl( "https://api.themoviedb.org")
                .build()
                .create(Trending_api::class.java)
        }
    }

}