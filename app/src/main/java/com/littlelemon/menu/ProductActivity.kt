package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

    class ProductActivity : ComponentActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            var productImage = intent.getIntExtra(KEY_IMAGE,-1)
            var productPrice = intent.getDoubleExtra(KEY_PRICE,0.0)
            var productCategory = intent.getStringExtra(KEY_CATEGORY).toString()
            var productTitle = intent.getStringExtra(KEY_TITLE).toString()
            val productItem =
                ProductItem(productTitle, productPrice, productCategory, productImage)//todo replace with the passed values from intent
            setContent { ProductDetails(productItem) }
        }
        companion object {
            const val KEY_TITLE = "title"
            const val KEY_PRICE = "price"
            const val KEY_IMAGE = "image"
            const val KEY_CATEGORY = "category"
        }
    }
