package com.laviola.battleritemirror.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laviola.battleritemirror.R
import kotlinx.android.synthetic.main.home_activity.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, HomeFragment.newInstance())
//                    .commitNow()
        }
        setSupportActionBar(toolbar)
    }

}
