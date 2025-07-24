package com.example.weatherapi.api

import androidx.compose.ui.input.key.Key
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("current.json")
    suspend fun getWeather(
        @Query("Key") apiKey: String,
        @Query("q") location: String = "Mumbai"
    ): WeatherResponse
}