package com.example.mvvmsampleapp.util

import java.io.IOException

class ApiException(messge : String) : IOException(messge)

class NoInternetException(message : String) : IOException(message)

