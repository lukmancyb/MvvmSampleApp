package com.example.mvvmsampleapp.data.network

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import com.example.mvvmsampleapp.util.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor(context: Context) : Interceptor {

    private val applicationContext = context.applicationContext
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable())
            throw NoInternetException("Make sure you have an active internet data connsection")
        return chain.proceed(chain.request())
    }

    @SuppressLint("MissingPermission")
    private fun isInternetAvailable() : Boolean{
        val connectionManager =
            applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        connectionManager.activeNetworkInfo.also {
            return it != null && it.isConnected
        }
    }
}