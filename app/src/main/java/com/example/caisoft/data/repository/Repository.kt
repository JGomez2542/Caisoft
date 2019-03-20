package com.example.caisoft.data.repository

import com.example.caisoft.models.LoginInfo

interface Repository {

    fun getToken(loginInfo: LoginInfo)
}