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

        tvLogin.setOnClickListener {
            Intent(this, LoginActivity::class.java).also{
                startActivity(it)
            }

        }
        setActionBar()

        //registration
        btn_register.setOnClickListener {
         validateCredentials()
        }
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
            TextUtils.isEmpty(et_fullname.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Name cannot be empty!", true)
                false
            }
            TextUtils.isEmpty(et_email.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Email cannot be empty!", true)
                false
            }
            TextUtils.isEmpty(et_contact_number.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Contact number cannot be empty!", true)
                false
            }
            TextUtils.isEmpty(et_address.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Address cannot be empty!", true)
                false
            }
            TextUtils.isEmpty(et_password.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Password cannot be empty!", true)
                false
            }
            TextUtils.isEmpty(et_confirm_password.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar("Confirm cannot be empty!", true)
                false
            }
            !cb_terms_and_services.isChecked -> {
                showErrorSnackBar("You must agree with the Terms and Services", true)
                false
            }
            else -> {
                showErrorSnackBar("Registration Successful", false)
                true
            }


        }
    }
}