package com.fangs.shopipipi_pipi

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navBottom = findViewById<BottomNavigationView>(R.id.nav_bottom_bar)
        val topToolbar = findViewById<LinearLayout>(R.id.ll_top_toolbar)
        val ivMenuTopBar = findViewById<ImageView>(R.id.iv_top_bar_menu)

        //drawer
        val menuDrawer = findViewById<DrawerLayout>(R.id.dl_menu_drawer)


        //open drawer on menu image clock
        ivMenuTopBar.setOnClickListener {

        menuDrawer.openDrawer(GravityCompat.START)

        }


        navBottom.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_item_food ->{
                    navBottom.setBackgroundResource(R.color.gray)
                    topToolbar.setBackgroundResource(R.color.gray)
                    true
                }
                R.id.nav_item_beverage ->{
                    navBottom.setBackgroundResource(R.color.red)
                    topToolbar.setBackgroundResource(R.color.red)
                    true
                }
                R.id.nav_item_desert ->{
                    navBottom.setBackgroundResource(R.color.yellow)
                    topToolbar.setBackgroundResource(R.color.yellow)
                    true
                }

                else -> false
            }


        }

    }

}