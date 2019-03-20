package com.example.caisoft

import android.app.Application
import com.example.caisoft.di.application.ApplicationModule
import com.example.caisoft.di.application.DaggerApplicationComponent

class AppController : Application() {

    val applicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}