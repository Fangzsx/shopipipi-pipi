package com.fangs.shopipipi_pipi.activities

import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.fangs.shopipipi_pipi.R
import com.google.android.material.snackbar.Snackbar

open class BaseActivity : AppCompatActivity() {

    //base class for using function for different activities



    //show error message
    fun showErrorSnackBar(message : String , hasError : Boolean){

        val snackBar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
        val snackBarView = snackBar.view
        //set margin for snack bar

        val params = snackBarView.layoutParams as ViewGroup.MarginLayoutParams
        params.setMargins(0,0,0,0)
        snackBarView.layoutParams = params


        if(hasError){
            snackBarView.setBackgroundColor(ContextCompat.getColor(this@BaseActivity, R.color.snackBarError))
        } else{
            snackBarView.setBackgroundColor(ContextCompat.getColor(this@BaseActivity, R.color.snackBarSuccess))
        }

        snackBar.show()
    }

}