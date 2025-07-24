package com.example.weatherapi

import com.example.weatherapi.api.WeatherApiService
import com.example.weatherapi.ui.theme.WeatherApiTheme
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object apiClient{
    private  const val Base_url = "https://api.weatherapi.com/v1/"
    val api: WeatherApiService by lazy {
        Retrofit.Builder().baseUrl(Base_url).addConverterFactory(GsonConverterFactory.create()).build().create(
            WeatherApiService::class.java
        )
    }

}