package com.amna.ecommerceapplication.uiscreens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.amna.ecommerceapplication.data.Product
import com.amna.ecommerceapplication.data.ProductData
import com.amna.ecommerceapplication.viewmodel.CartViewModel

@Composable
fun ProductListScreen(category: String, cartViewModel: CartViewModel) {
    val products =  ProductData.products.filter { it.productCategory == category }

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(products) {
            ProductItem(it) {
                cartViewModel.addToCart(it)





           }
       }
    }
}

