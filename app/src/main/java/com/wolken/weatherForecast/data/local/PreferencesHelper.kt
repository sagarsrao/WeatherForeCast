package com.wolken.weatherForecast.data.local

import android.content.Context
import android.content.SharedPreferences
import com.wolken.weatherForecast.injection.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PreferencesHelper @Inject
constructor(@ApplicationContext context: Context) {

    private val preferences: SharedPreferences

    init {
        preferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun clear() {
        preferences.edit().clear().apply()
    }

    companion object {

        val PREF_FILE_NAME = "mvpstarter_pref_file"
    }

}