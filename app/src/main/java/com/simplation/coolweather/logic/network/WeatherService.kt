package com.simplation.coolweather.logic.network

import com.simplation.coolweather.CoolWeatherApplication
import com.simplation.coolweather.logic.model.DailyResponse
import com.simplation.coolweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @作者: Simplation
 * @日期: 2021-01-15 11:19
 * @描述: API 相关
 * @更新:
 */
interface WeatherService {

    @GET("v2.5/${CoolWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${CoolWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}