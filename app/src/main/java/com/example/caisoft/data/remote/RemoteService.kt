package com.example.caisoft.data.remote

import com.example.caisoft.models.LoginInfo
import com.example.caisoft.models.Token
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.POST

interface RemoteService {

    @POST("/login")
    fun getToken(@Body loginInfo: LoginInfo): Single<Token>
}