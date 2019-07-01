package com.example.mvvmsampleapp.util

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

fun Context.toast(msg : String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}

fun ProgressBar.show(){
    visibility = View.VISIBLE
}

fun ProgressBar.hide(){
    visibility = View.GONE
}

fun View.snckbar(msg : String){
    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setAction("Ok  "){
            snackbar.dismiss()
        }.show()
    }
}

fun Context.alert(msg : String){
    val builder = AlertDialog.Builder(this)
    builder.setTitle("Internet Connection")
    builder.setMessage(msg)

    builder.setPositiveButton(android.R.string.yes){ dialog, which ->
        dialog.dismiss()
    }
    builder.show()

}