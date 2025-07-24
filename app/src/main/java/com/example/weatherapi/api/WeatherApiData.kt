package com.example.weatherapi.api



data  class Location(
    val name: String,
    val region: String,
    val country: String
)
data class CurrentWeather(
    val temperatureInCelecis: String,
    val humidity: String
)

data class WeatherResponse(
    val location: Location,
    val current: CurrentWeather
)