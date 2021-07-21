package com.fangs.shopipipi_pipi.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.fangs.shopipipi_pipi.R
import com.google.android.material.snackbar.Snackbar

open class BaseActivity : AppCompatActivity() {


    fun showErrorSnackBar(message : String , hasError : Boolean){

        val snackBar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
        val snackBarView = snackBar.view


        if(hasError){
            snackBarView.setBackgroundColor(ContextCompat.getColor(this@BaseActivity, R.color.snackBarError))
        } else{
            snackBarView.setBackgroundColor(ContextCompat.getColor(this@BaseActivity, R.color.snackBarSuccess))
        }

        snackBar.show()
    }

}