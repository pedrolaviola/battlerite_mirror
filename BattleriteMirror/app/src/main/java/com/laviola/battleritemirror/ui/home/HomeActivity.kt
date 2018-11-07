package com.laviola.battleritemirror.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.laviola.battleritemirror.R
import kotlinx.android.synthetic.main.home_activity.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        setSupportActionBar(toolbar)
        val host = supportFragmentManager.findFragmentById(R.id.myFragment) as NavHostFragment
        val navController = host.navController
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.myFragment).navigateUp()
    }

}
