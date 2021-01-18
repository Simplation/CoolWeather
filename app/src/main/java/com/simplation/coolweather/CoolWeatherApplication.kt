package com.simplation.coolweather

import android.app.Application
import android.content.Context

/**
 * @作者: Simplation
 * @日期: 2021-01-15 10:48
 * @描述:
 * @更新:
 */
class CoolWeatherApplication : Application() {

    companion object {
        // 申请到的值
        const val TOKEN = "X3eP0r9RPsFG1oAp"

        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
    }
}