package com.cse.manualdi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.cse.manualdi.Di.ObjContainer
import com.cse.manualdi.MyApp
import com.cse.manualdi.R
import com.cse.manualdi.data.model.RequestLogin
import com.cse.manualdi.repos.UserRepos

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var container: ObjContainer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        container = MyApp().container

        viewModel = MainViewModelFactory(container.userRepos).create()


        viewModel.loginResponse.observe(this){
            if(it.accessToken!=null){
                Log.d("TAG", "Data:$it ")
            }
        }

        findViewById<Button>(R.id.loginBtn).setOnClickListener {

            val loginRequest = RequestLogin("john@mail.com", "changeme")

            viewModel.loginUser(loginRequest)


        }

        }




    }

    interface Factory<T> {
        fun create(): T
    }

    class MainViewModelFactory(private val repos: UserRepos) : Factory<MainViewModel> {
        override fun create(): MainViewModel {
            return MainViewModel(repos)

        }
}