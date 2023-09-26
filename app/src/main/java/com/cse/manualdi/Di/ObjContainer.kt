package com.cse.manualdi.Di

import com.cse.manualdi.data.LocalSource
import com.cse.manualdi.network.LoginService
import com.cse.manualdi.repos.UserRepos
import com.mehedi.manualdiu.data.RemoteSource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ObjContainer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(LoginService::class.java)


    private val remoteSource = RemoteSource(retrofit)
    private val localSource = LocalSource()

    val userRepos = UserRepos(localSource,remoteSource)

}
