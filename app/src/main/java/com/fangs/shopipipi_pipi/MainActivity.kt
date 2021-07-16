package com.fangs.shopipipi_pipi

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navBottom = findViewById<BottomNavigationView>(R.id.nav_bottom_bar)

        navBottom.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_item_food ->{
                    navBottom.setBackgroundResource(R.color.gray)
                    true
                }
                R.id.nav_item_beverage ->{
                    navBottom.setBackgroundResource(R.color.red)
                    true
                }
                R.id.nav_item_desert ->{
                    navBottom.setBackgroundResource(R.color.yellow)
                    true
                }

                else -> false
            }


        }

    }
}