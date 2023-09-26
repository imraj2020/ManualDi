package com.cse.manualdi.repos

import com.cse.manualdi.data.LocalSource
import com.cse.manualdi.data.model.RequestLogin
import com.mehedi.manualdiu.data.RemoteSource

class UserRepos (

    private val localSource: LocalSource,
    private val remoteSource: RemoteSource
)

{
 suspend fun loginUser(requestLogin: RequestLogin) = remoteSource.loginUser(requestLogin)
}


