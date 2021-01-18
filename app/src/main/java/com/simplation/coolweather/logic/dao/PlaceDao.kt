package com.simplation.coolweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.simplation.coolweather.CoolWeatherApplication
import com.simplation.coolweather.logic.model.Place

object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        CoolWeatherApplication.context.getSharedPreferences("cool_weather", Context.MODE_PRIVATE)

}