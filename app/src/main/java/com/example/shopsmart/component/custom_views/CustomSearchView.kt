package com.example.shopsmart.component.custom_views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.dovshan.databinding.LayoutCustomSearchBinding

class CustomSearchView @JvmOverloads constructor(
    ctx: Context,
    attrSet: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(ctx, attrSet, defStyle) {
    private val binding: LayoutCustomSearchBinding =
        LayoutCustomSearchBinding.inflate(LayoutInflater.from(context), this, true)
}