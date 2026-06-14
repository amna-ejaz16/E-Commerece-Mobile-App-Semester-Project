package com.amna.ecommerceapplication.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.amna.ecommerceapplication.uiscreens.CartScreen
import com.amna.ecommerceapplication.uiscreens.HomeScreen
import com.amna.ecommerceapplication.uiscreens.OrderSuccessScreen
import com.amna.ecommerceapplication.uiscreens.PaymentScreen
import com.amna.ecommerceapplication.uiscreens.ProductListScreen
import com.amna.ecommerceapplication.uiscreens.ProfileScreen
import com.amna.ecommerceapplication.uiscreens.SearchScreen
//import com.amna.ecommerceapplication.uiscreens.SearchScreen
import com.amna.ecommerceapplication.viewmodel.CartViewModel

@Composable
fun AppNavGraph(cartViewModel: CartViewModel) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBarNavigation(navController)
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier.fillMaxSize().padding(paddingValues)

        ) {
            NavHost(
                navController, startDestination = "home"
            )

            {
                composable("home"){
                    HomeScreen(navController = navController,
                        cartViewModel = cartViewModel)
                }

                composable("products/{category}"){
                    ProductListScreen(it.arguments?.getString("category")!!, cartViewModel)
                }

                composable("cart"){
                    CartScreen(navController, cartViewModel)
                }

                composable("payment"){
                    PaymentScreen(navController)
                }

                composable("success"){
                    OrderSuccessScreen(navController, cartViewModel )
                }

                composable("search"){
                    SearchScreen(cartViewModel)
                }

                composable("profile"){
                    ProfileScreen()
                }
            }
        }
    }

}

@Composable
fun BottomBarNavigation(navController: NavController){

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Cart,
        BottomNavItem.Profile

    )

    NavigationBar(
        modifier = Modifier.background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(color = 0xff6a1b9a),
                    Color(color = 0xff8e24aa),
                )
            )
        ),

        containerColor = Color.Transparent,

    ) {

        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { item ->
            val selected = currentRoute == item.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }

                },

                icon = {
                    Icon(imageVector = item.icon,
                        contentDescription = "Icon",
                        tint = Color.White)
                },

                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.White.copy(alpha = 0.18f)
                )

            )

        }



    }

}

//class AppNavGraph {
//}