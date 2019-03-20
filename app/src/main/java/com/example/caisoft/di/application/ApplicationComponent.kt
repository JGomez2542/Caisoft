package com.example.caisoft.di.application

import com.example.caisoft.data.remote.RemoteServiceHelper
import com.example.caisoft.di.activity.ActivityComponent
import com.example.caisoft.di.activity.ActivityModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

    fun getRemoteServiceHelper(): RemoteServiceHelper
}