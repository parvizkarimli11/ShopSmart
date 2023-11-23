package com.example.shopsmart.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dovshan.R
import com.example.dovshan.databinding.ActivityMainBinding
import com.farzin.shopsmarttest.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate



    override fun onViewBindingCreated(savedInstanceState: Bundle?) {

        super.onViewBindingCreated(savedInstanceState)

       // setupBottomNav()
    }


   // private fun setupBottomNav()
   // {
         // val navController=findNavController(R.id.container)
      //  binding.bottomNavBar.setupWithNavController(navController)
      //  navController.addOnDestinationChangedListener{ controller, destination,arguments->

       // }
    //}
}
