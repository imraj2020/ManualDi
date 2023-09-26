package com.cse.manualdi.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cse.manualdi.data.model.LoginResponse
import com.cse.manualdi.data.model.RequestLogin
import com.cse.manualdi.repos.UserRepos
import kotlinx.coroutines.launch

class MainViewModel(private val repos: UserRepos):ViewModel() {


    private var _loginResponse = MutableLiveData<LoginResponse>()

    val loginResponse : LiveData<LoginResponse> = _loginResponse



    fun loginUser(requestLogin: RequestLogin){



        viewModelScope.launch {

            val response = repos.loginUser(requestLogin)
            if (response.isSuccessful){
                _loginResponse.postValue(response.body())

            }
            Log.d("TAG", "loginUser: $response ")
        }

    }


}