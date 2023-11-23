package com.example.shopsmart.ui.home

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dovshan.databinding.FragmetHomeBinding
import com.example.shopsmart.component.adapters.ProductAdapter
import com.example.shopsmart.util.Mock.getMockProducts
import com.farzin.shopsmarttest.base.BaseFragment


class HomeFragment: BaseFragment<FragmetHomeBinding>(FragmetHomeBinding::inflate) {

    lateinit var productAdapter:ProductAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

    }

     private fun initView()
     {
         productAdapter= ProductAdapter()
         binding.recyclerViewProducts.layoutManager=GridLayoutManager(requireContext(),2)

         val list=getMockProducts()

         binding.recyclerViewProducts.adapter=productAdapter
         productAdapter.setData(list)

     }
}