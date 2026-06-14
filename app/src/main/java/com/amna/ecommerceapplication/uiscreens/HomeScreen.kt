//package com.amna.ecommerceapplication.uiscreens
//
//import android.R.attr.category
//import android.R.attr.contentDescription
//import android.R.attr.fontWeight
//import android.widget.Toast
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.R
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.foundation.lazy.grid.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Add
//import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.Search
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.OutlinedTextFieldDefaults
//import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.focus.onFocusChanged
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.amna.ecommerceapplication.data.Product
//import com.amna.ecommerceapplication.data.ProductData
//import com.amna.ecommerceapplication.ui.theme.Violet
//import com.amna.ecommerceapplication.viewmodel.CartViewModel
//import kotlinx.coroutines.delay
//
//import androidx.compose.foundation.clickable
//import com.amna.ecommerceapplication.data.ProductCategory
//
//
//@Composable
//fun HomeScreen(navController: NavController,
//               cartViewModel: CartViewModel,
//               modifier: Modifier = Modifier
//){
//    LazyColumn(modifier = modifier.fillMaxSize()
//    ) {
//        item {
//            HomeHeader(navController)
//        }
//        item {
//            OfferBanners()
//        }
//        item {
//            SectionTitleText("Categories")
//        }
//        item {
//            CategoryGridSection(navController)
//        }
//        item {
//            SectionTitleText("Best Selling Products")
//        }
//        item {
//            BestSellingProducts(cartViewModel)
//        }
//
//    }
//}
//
//@Composable
//fun HomeHeader(navController: NavController){
//    Column(modifier = Modifier.fillMaxWidth()
//        .background(Violet)
//        .padding(16.dp)
//    ){
//        Row(modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(text = "Amazon",
//                color = Color.White,
//                fontSize = 22.sp,
//                fontWeight = FontWeight.Bold)
//            Icon(imageVector = Icons.Default.Notifications,
//                contentDescription = null,
//                tint = Color.White
//            )
//        }
//        Spacer(Modifier.height(12.dp))
//
//        OutlinedTextField(
//            value = "",
//            onValueChange = {},
//            modifier = Modifier.fillMaxWidth()
//                .onFocusChanged{ focusState ->
//                    if(focusState.isFocused){
//                        navController.navigate("search")
//                    }
//                },
//            readOnly = true,
//            placeholder = {Text("Search products")},
//            leadingIcon = {Icon(Icons.Default.Search,
//                contentDescription = "search")},
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedContainerColor = Color.White,
//                unfocusedContainerColor = Color.White,
//                focusedBorderColor = Color.Transparent,
//                unfocusedBorderColor = Color.Transparent
//            ),
//            shape = RoundedCornerShape(14.dp)
//        )
//    }
//}
//@Composable
//  fun OfferBanners(){
//      val images: List<Int> = listOf(
//        com.amna.ecommerceapplication.R.drawable.sale1,
//        com.amna.ecommerceapplication.R.drawable.sale2,
//        com.amna.ecommerceapplication.R.drawable.sale3
//     )
////fun OfferBanners(){
////    val images = listOf(
////        R.drawable.sale1,
////        R.drawable.sale2,
////        R.drawable.sale3
////    )
//    var index by remember { mutableStateOf(0) }
//
//    LaunchedEffect(Unit){
//        while (true) {
//            delay(3000)
//            index = (index + 1) %images.size
//        }
//
//    }
//    Column(modifier = Modifier.padding(16.dp)
//    ) {
//        Text(text = "Special Offer",
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Bold)
//        Spacer(Modifier.height(12.dp))
//        Card(shape = RoundedCornerShape(16.dp),
//            elevation = CardDefaults.cardElevation(6.dp)
//        ){
//            Image(painter = painterResource(images[index]),
//                contentDescription = null,
//                modifier = Modifier.fillMaxWidth()
//                    .height(180.dp),
//                contentScale = ContentScale.Crop
//                )
//        }
//        Spacer(Modifier.height(8.dp))
//        Row(modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.Center
//        ){
//            images.forEachIndexed { i, _ ->
//                Box(modifier = Modifier
//                    .padding(4.dp)
//                    .size(if (i == index) 10.dp else 8.dp)
//                    .clip(CircleShape)
//                    .background(if (i == index) Violet else Color.LightGray)
//                )
//
//            }
//
//        }
//
//    }
//}
//@Composable
//fun SectionTitleText(title: String) {
//    Text(text = title,
//        fontSize = 18.sp,
//        fontWeight = FontWeight.Bold,
//        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp )
//    )
//}
//@Composable
//fun CategoryGridSection(navController: NavController) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(3),
//        modifier = Modifier.height(220.dp),
//        contentPadding = PaddingValues(8.dp)
//    ) {
//        items(ProductData.categories) { category ->
//            CategoryGrid(category) {
//                navController.navigate("products/${category.categoryName}")
//            }
//        }
//    }
//}
//
//
//@Composable
//fun BestSellingItem(
//    product: Product,
//    onAdd: () -> Unit
//) {
//    val context = LocalContext.current
//
//    Card(
//        modifier = Modifier.padding(8.dp),
//        shape = RoundedCornerShape(16.dp),
//        elevation = CardDefaults.cardElevation(4.dp),
//        colors = CardDefaults.cardColors(
//            containerColor = Violet
//        )
//    ) {
//        Column {
//            Box {
//                Image(
//                    painter = painterResource(product.productImage),
//                    contentDescription = null,
//                    modifier = Modifier.fillMaxWidth()
//                        .height(140.dp),
//                    contentScale = ContentScale.Crop
//                )
//                IconButton(
//                    onClick = {
//                        onAdd()
//                        Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT)
//                            .show()   // ← Yeh sahi hai
//                    },
//                    modifier = Modifier
//                        .align(Alignment.TopEnd)
//                        .background(Violet, CircleShape)
//                ) {
//                    Icon(
//                        Icons.Default.Add,
//                        contentDescription = null,
//                        tint = Color.White
//                    )
//                }
//                Column(
//                    Modifier.padding(8.dp)
//                ) {
//
//                    Text(
//                        text = product.productName,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.White
//                    )
//                    Text("Rs${product.productPrice}", color = Color.White)
//                }
//            }
//
//        }
//    }
//    @Composable
//    fun BestSellingProducts(cartViewModel: CartViewModel) {
//        val products = ProductData.products.take(4)
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(2),
//            modifier = Modifier.height(420.dp),
//            contentPadding = PaddingValues(8.dp)
//        ) {
//            items(products) {
//                BestSellingItem(it) {
//                    cartViewModel.addToCart(it)
//                }
//            }
//        }
//    }
//
//    @Composable
//    fun CategoryGrid(category: ProductCategory, onClick: () -> Unit) {
//        Card(
//            modifier = Modifier
//                .padding(8.dp)
//                .clickable { onClick() },
//            shape = RoundedCornerShape(12.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .size(100.dp)
//                    .background(Color.LightGray),
//                contentAlignment = Alignment.Center
//            ) {
//                Text(
//                    text = category.categoryName,
//                    fontWeight = FontWeight.Medium
//                )
//            }
//        }
//    }
//}
//new code



package com.amna.ecommerceapplication.uiscreens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.amna.ecommerceapplication.R
import com.amna.ecommerceapplication.data.Product
import com.amna.ecommerceapplication.data.ProductCategory
import com.amna.ecommerceapplication.data.ProductData
import com.amna.ecommerceapplication.ui.theme.Violet
import com.amna.ecommerceapplication.viewmodel.CartViewModel
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(
    navController: NavController,
    cartViewModel: CartViewModel,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item { HomeHeader(navController) }
        item { OfferBanners() }
        item { SectionTitleText("Categories") }
        item { CategoryGridSection(navController) }
        item { SectionTitleText("Best Selling Products") }
        item { BestSellingProducts(cartViewModel) }
    }
}

// Baqi functions same rahenge (short version)

@Composable
fun HomeHeader(navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth().background(Violet).padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Text("Amazon", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Icon(Icons.Default.Notifications, contentDescription = null, tint = Color.White)
        }
        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { focusState ->
                    if (focusState.isFocused) {
                        navController.navigate("search")
                    }
                },
            readOnly = true,
            placeholder = { Text("Search products") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = "search") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            shape = RoundedCornerShape(14.dp)
        )
    }
}

@Composable
fun OfferBanners() {
    val images: List<Int> = listOf(R.drawable.sale1, R.drawable.sale2, R.drawable.sale3)

    var index by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            index = (index + 1) % images.size
        }
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Special Offer", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(12.dp))

        Card(shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(6.dp)) {
            Image(painter = painterResource(images[index]), contentDescription = null, modifier = Modifier.fillMaxWidth().height(180.dp), contentScale = ContentScale.Crop)
        }

        Spacer(Modifier.height(8.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            images.forEachIndexed { i, _ ->
                Box(modifier = Modifier.padding(4.dp).size(if (i == index) 10.dp else 8.dp).clip(CircleShape).background(if (i == index) Violet else Color.LightGray))
            }
        }
    }
}

@Composable
fun SectionTitleText(title: String) {
    Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp))
}

@Composable
fun CategoryGridSection(navController: NavController) {
    LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = Modifier.height(220.dp), contentPadding = PaddingValues(8.dp)) {
        items(ProductData.categories) { category ->
            CategoryGrid(category) {
                navController.navigate("products/${category.categoryName}")
            }
        }
    }
}

@Composable
fun BestSellingItem(product: Product, onAdd: () -> Unit) {
    val context = LocalContext.current
    Card(modifier = Modifier.padding(8.dp), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(4.dp), colors = CardDefaults.cardColors(containerColor = Violet)) {
        Column {
            Box {
                Image(painter = painterResource(product.productImage), contentDescription = null, modifier = Modifier.fillMaxWidth().height(140.dp), contentScale = ContentScale.Crop)
                IconButton(onClick = { onAdd(); Toast.makeText(context, "Added to cart", Toast.LENGTH_SHORT).show() }, modifier = Modifier.align(Alignment.TopEnd).background(Violet, CircleShape)) {
                    Icon(Icons.Default.Add, contentDescription = null, tint = Color.White)
                }
            }
            Column(Modifier.padding(8.dp)) {
                Text(text = product.productName, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = "Rs ${product.productPrice}", color = Color.White)
            }
        }
    }
}

@Composable
fun BestSellingProducts(cartViewModel: CartViewModel) {
    val products = ProductData.products.take(4)
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.height(420.dp), contentPadding = PaddingValues(8.dp)) {
        items(products) { product ->
            BestSellingItem(product) { cartViewModel.addToCart(product) }
        }
    }
}

//@Composable
//fun CategoryGrid(category: ProductCategory, onClick: () -> Unit) {
//    Card(modifier = Modifier.padding(8.dp).clickable { onClick() }, shape = RoundedCornerShape(12.dp)) {
//        Box(modifier = Modifier.size(100.dp).background(Color.LightGray), contentAlignment = Alignment.Center) {
//            Text(text = category.categoryName, fontWeight = FontWeight.Medium)
//        }
//    }
//}
@Composable
fun CategoryGrid(category: ProductCategory, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = category.categoryName,
                fontWeight = FontWeight.Medium
            )
        }
    }
}