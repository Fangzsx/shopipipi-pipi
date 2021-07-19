package com.fangs.shopipipi_pipi.activities

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.fangs.shopipipi_pipi.R
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

//        //status bar
//        val window = window
//
//        // clear FLAG_TRANSLUCENT_STATUS flag:
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//
//        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


        navBottom.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_item_food ->{
                    Toast.makeText(this, "food clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_item_beverage ->{
                    Toast.makeText(this, "beverage clicked", Toast.LENGTH_SHORT).show()

                    true
                }
                R.id.nav_item_dessert ->{
                    Toast.makeText(this, "desert clicked", Toast.LENGTH_SHORT).show()

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


            popUp.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.item_about_me -> {

                        val dialog = Dialog(this, R.style.Theme_MyProfile)
                        dialog.setContentView(R.layout.dialog_about_me)

                        val returnButton = dialog.findViewById<Button>(R.id.btn_about_me_return)
                        returnButton.setOnClickListener {
                            dialog.dismiss()
                        }
                        dialog.show()

                        return@setOnMenuItemClickListener true
                    }
                    else -> return@setOnMenuItemClickListener false
                }
            }
            popUp.show()
        }




    }

}