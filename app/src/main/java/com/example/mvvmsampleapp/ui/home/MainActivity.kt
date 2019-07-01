package com.example.mvvmsampleapp.ui.home

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsampleapp.R
import com.example.mvvmsampleapp.data.db.AppDatabase
import com.example.mvvmsampleapp.data.network.MyApi
import com.example.mvvmsampleapp.data.network.NetworkConnectionInterceptor
import com.example.mvvmsampleapp.data.repositories.UserRepository
import com.example.mvvmsampleapp.ui.auth.AuthViewModel
import com.example.mvvmsampleapp.ui.auth.AuthViewModelFactory
import com.example.mvvmsampleapp.util.toast
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("Registered")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val networkConnectionInterceptor = NetworkConnectionInterceptor(this)
        val api = MyApi(networkConnectionInterceptor)
        val db = AppDatabase(this)
        val repository = UserRepository(api, db)
        val factory = AuthViewModelFactory(repository)
        val viewModel = ViewModelProviders.of(this, factory).get(AuthViewModel::class.java)
        viewModel.getLoggedUser().observe(this, Observer {user ->
            user?.let {
                toast(user.name.toString())
                textView?.text = user.name.toString()
            }
        })
    }
}
