package com.fangs.shopipipi_pipi.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.text.method.TransformationMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.fangs.shopipipi_pipi.R

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //set image for password icon && show password accordingly
        val ivPassword = findViewById<ImageView>(R.id.iv_password)
        val etPassword = findViewById<EditText>(R.id.et_password)


        ivPassword.setOnClickListener {
            if(etPassword.tag == "PASSWORD_SHOW"){
                ivPassword.setImageResource(R.drawable.show_password)
                etPassword.transformationMethod = PasswordTransformationMethod.getInstance()
                //change tag
                etPassword.tag = "PASSWORD_HIDE"
            }else{
                ivPassword.setImageResource(R.drawable.hide_password)
                etPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()
                etPassword.tag = "PASSWORD_SHOW"
            }
        }




        //hide status bar
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}