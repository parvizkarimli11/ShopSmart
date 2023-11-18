package com.example.shopsmart.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import com.example.dovshan.databinding.ActivityMainBinding
import com.farzin.shopsmarttest.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate


    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)
    }
}
