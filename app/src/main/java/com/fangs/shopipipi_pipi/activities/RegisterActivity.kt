package com.fangs.shopipipi_pipi.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import com.fangs.shopipipi_pipi.R

class RegisterActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //login
        val tvLogin = findViewById<TextView>(R.id.tv_login)
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
}