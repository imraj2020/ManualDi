package com.cse.manualdi.network

import com.cse.manualdi.data.model.LoginResponse
import com.cse.manualdi.data.model.RequestLogin
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {


    @POST("auth/login")
    suspend fun loginUser(@Body request: RequestLogin): Response<LoginResponse>

}
