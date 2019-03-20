package com.example.caisoft.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.caisoft.R
import com.example.caisoft.data.remote.RemoteServiceHelper
import com.example.caisoft.data.repository.RepositoryImpl
import com.example.caisoft.models.LoginInfo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val remoteServiceHelper = RemoteServiceHelper()
        val repository = RepositoryImpl(remoteServiceHelper)
        repository.getToken(LoginInfo("mauricio.m", "123"))
    }
}
