package com.example.mvvmsampleapp.ui.auth

import android.content.Intent
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmsampleapp.data.network.responses.AuthResponse
import com.example.mvvmsampleapp.data.repositories.UserRepository
import com.example.mvvmsampleapp.util.ApiException
import com.example.mvvmsampleapp.util.Coroutines
import com.example.mvvmsampleapp.util.NoInternetException
import java.io.IOException

class AuthViewModel(
    private val repository: UserRepository
) : ViewModel() {

    companion object {
        private const val LOGIN_ACTION = "login"
        private const val SIGNUP_ACTION = "signup"
    }

    var name: String? = null
    var email: String? = null
    var password: String? = null
    var password2: String? = null
    var authListener: AuthListener? = null
    var authResonse: AuthResponse? = null
    fun getLoggedUser() = repository.getUser()

    fun onLoginButtonClicked(v: View) {
        authListener?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email & password")
            return
        }
        request(LOGIN_ACTION)

    }

    fun onSignUpButtonClicked(v: View) {
        authListener?.onStarted()
        if (name.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty() || password2.isNullOrEmpty()) {
            authListener?.onFailure("Masukan field yang kosong")
            return
        } else if (password.toString() != password2.toString()) {
            authListener?.onFailure("Password tidak match")
            return
        }
        request(SIGNUP_ACTION)
    }

    fun goToSignUp(v: View) {
        Intent(v.context, SignupActivity::class.java).also { intent ->
            v.context.startActivity(intent)
        }
    }

    private fun request(str: String) {
        Coroutines.main {
            try {
                when (str) {
                    LOGIN_ACTION -> {
                        authResonse = repository.userLogin(email!!, password!!)
                    }
                    SIGNUP_ACTION -> {
                        authResonse = repository.userSignUp(name!!, email!!, password!!)
                    }
                }
                authResonse?.user?.let {
                    authListener?.onSuccess(it)
                    repository.saveUser(it)
                    return@main
                }
                authListener?.onFailure(authResonse?.message!!)
            } catch (e: ApiException) {
                authListener?.onFailure(e.message!!)
            } catch (e: NoInternetException) {
                authListener?.onFailure(e.message!!)
            } catch (e: IOException) {
                authListener?.onFailure("Request Time out")

            }
        }
    }


}