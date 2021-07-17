package com.fangs.shopipipi_pipi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navBottom = findViewById<BottomNavigationView>(R.id.nav_bottom_bar)
        val topToolbar = findViewById<LinearLayout>(R.id.ll_top_toolbar)
        val ivMenuTopBar = findViewById<ImageView>(R.id.iv_top_bar_menu)

        //drawer
        val menuDrawer = findViewById<DrawerLayout>(R.id.dl_menu_drawer)
        //navigation view
        val menuNavigationView = findViewById<NavigationView>(R.id.nv_top_bar_nav)
        menuNavigationView.itemIconTintList = null


        //open drawer on menu image clock
        ivMenuTopBar.setOnClickListener {
        menuDrawer.openDrawer(GravityCompat.START)
        }

        //status bar
        val window = window

        // clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


        navBottom.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_item_food ->{
                    navBottom.setBackgroundResource(R.color.gray)
                    topToolbar.setBackgroundResource(R.color.gray)
                    window.statusBarColor = ContextCompat.getColor(this,R.color.gray);

                    true
                }
                R.id.nav_item_beverage ->{
                    navBottom.setBackgroundResource(R.color.red)
                    topToolbar.setBackgroundResource(R.color.red)
                    window.statusBarColor = ContextCompat.getColor(this,R.color.red);
                    true
                }
                R.id.nav_item_desert ->{
                    navBottom.setBackgroundResource(R.color.yellow)
                    topToolbar.setBackgroundResource(R.color.yellow)
                    window.statusBarColor = ContextCompat.getColor(this,R.color.yellow);
                    true
                }

                else -> false
            }


        }

        val ivTopBulletMenu = findViewById<ImageView>(R.id.iv_top_bar_more_vertical)
        ivTopBulletMenu.setOnClickListener {
            val popUp = PopupMenu(this, topToolbar)
            popUp.gravity = Gravity.RIGHT
            popUp.menuInflater.inflate(R.menu.menu_top_bullet, popUp.menu)
            popUp.show()
        }




    }

}