package com.fangs.shopipipi_pipi.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView
import com.fangs.shopipipi_pipi.R
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //initialize view
        val tvLogin = findViewById<TextView>(R.id.tv_login)
        val etFullName = findViewById<TextInputEditText>(R.id.et_fullname)
        val etEmail = findViewById<TextInputEditText>(R.id.et_email)
        val etContactNumber = findViewById<TextInputEditText>(R.id.et_contact_number)
        val etAddress = findViewById<TextInputEditText>(R.id.et_address)
        val etPassword = findViewById<TextInputEditText>(R.id.et_password)
        val etConfirmPassword = findViewById<TextInputEditText>(R.id.et_confirm_password)

        tvLogin.setOnClickListener {
            Intent(this, LoginActivity::class.java).also{
                startActivity(it)
            }

        }
        setActionBar()
    }

    private fun setActionBar(){

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.tb_top_registration)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back_button)
        }

        toolbar.setNavigationOnClickListener{
            onBackPressed()
        }

    }

    private fun validateCredentials() : Boolean{
        return when{



        }
    }
}