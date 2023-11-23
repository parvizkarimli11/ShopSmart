package com.example.shopsmart.component.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dovshan.databinding.ItemProductViewBinding
import com.example.shopsmart.component.view_holders.ProductViewHolder
import com.example.shopsmart.model.local.ProductModel
import com.farzin.shopsmarttest.base.BaseRecyclerAdapter

class ProductAdapter:BaseRecyclerAdapter<ProductModel,ItemProductViewBinding,ProductViewHolder>(){
    override fun createViewBinding(parent: ViewGroup, viewType: Int): ItemProductViewBinding {

        return ItemProductViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)

    }

    override fun createViewHolder(
        binding: ItemProductViewBinding,
        viewType: Int
    ): ProductViewHolder {
        return ProductViewHolder(binding)
    }
}