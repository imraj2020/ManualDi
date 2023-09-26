package com.mehedi.manualdiu.data


import com.cse.manualdi.data.model.RequestLogin
import com.cse.manualdi.network.LoginService
import retrofit2.Retrofit

class RemoteSource(private val service: LoginService) {


  suspend fun loginUser(requestLogin: RequestLogin) = service.loginUser(requestLogin)


}