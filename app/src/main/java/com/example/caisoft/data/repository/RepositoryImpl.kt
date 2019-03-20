package com.example.caisoft.data.repository

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.util.Log
import com.example.caisoft.data.remote.RemoteServiceHelper
import com.example.caisoft.models.LoginInfo
import com.example.caisoft.models.Token
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RepositoryImpl(private val remoteServiceHelper: RemoteServiceHelper, private val sharedPrefs: SharedPreferences) : Repository {


    @SuppressLint("CheckResult")
    override fun getToken(loginInfo: LoginInfo) {
        remoteServiceHelper.getToken(loginInfo)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ token: Token? -> Log.d("Repo", token?.token) }) { t: Throwable? -> t?.printStackTrace() }
    }

}