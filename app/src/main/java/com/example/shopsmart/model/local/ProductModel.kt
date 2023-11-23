package com.example.shopsmart.model.local

 data class ProductModel(
     val id:Int,
     val productId:String,
     val productTitle:String,
     val productImage:Int,
     val price:String,
     val description:String,
     val isFavorite:Boolean=false)
