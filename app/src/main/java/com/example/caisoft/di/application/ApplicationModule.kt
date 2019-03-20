package com.example.caisoft.di.application

import android.content.Context
import android.content.SharedPreferences
import com.example.caisoft.common.MAIN_PREFS
import com.example.caisoft.data.remote.RemoteServiceHelper
import com.example.caisoft.data.repository.Repository
import com.example.caisoft.data.repository.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @ApplicationScope
    fun providesSharedPrefs(): SharedPreferences = context.getSharedPreferences(MAIN_PREFS, Context.MODE_PRIVATE)

    @Provides
    @ApplicationScope
    fun providesRepository(remoteServiceHelper: RemoteServiceHelper, sharedPreferences: SharedPreferences): Repository = RepositoryImpl(remoteServiceHelper, sharedPreferences)

}