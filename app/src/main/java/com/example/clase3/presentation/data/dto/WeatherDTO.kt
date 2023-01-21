//package com.example.locationweather.presentation.data.dto
package com.example.clase3.presentation.data.dto

import com.example.clase3.presentation.data.dto.Coord

data class WeatherDTO(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)