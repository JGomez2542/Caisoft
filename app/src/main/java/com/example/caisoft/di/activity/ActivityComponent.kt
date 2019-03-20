package com.example.caisoft.di.activity

import com.example.caisoft.ui.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)


}