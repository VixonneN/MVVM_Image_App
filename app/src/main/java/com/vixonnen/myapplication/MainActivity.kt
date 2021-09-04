package com.vixonnen.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vixonnen.myapplication.databinding.ActivityMainBinding
import com.vixonnen.myapplication.utils.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    private var binding: ActivityMainBinding? = null
    val mBinding get() = binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        APP_ACTIVITY = this
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

    }
}