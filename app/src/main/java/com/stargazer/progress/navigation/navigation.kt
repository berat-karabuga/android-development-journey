package com.stargazer.progress.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stargazer.progress.features.shop.cart
import com.stargazer.progress.features.profile.openProfile
import com.stargazer.progress.features.profile.profileScreen
import com.stargazer.progress.features.shop.shopScreen
import com.stargazer.progress.ui.main.mainScreen

const val ROUTE_MAIN = "main"
const val ROUTE_SHOP = "shop"
const val ROUTE_PROFILE = "profile"
const val ROUTE_OPEN_PROFILE = "openProfile"
const val ROUTE_CART = "cart"


@Composable
fun navi() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ROUTE_MAIN) {
        composable(ROUTE_MAIN){
            mainScreen(navController)
        }

        composable(ROUTE_SHOP) {
            shopScreen(navController)
        }
        composable(ROUTE_PROFILE) {
            profileScreen(navController)
        }
        composable(ROUTE_OPEN_PROFILE){
            openProfile(navController)
        }
        composable(ROUTE_CART){
            cart(navController)
        }
    }
}


fun NavController.navigateToMain(){
    this.navigate(ROUTE_MAIN)
}
fun NavController.navigateToShop(){
    this.navigate(ROUTE_SHOP)
}
fun NavController.navigateToProfile(){
    this.navigate(ROUTE_PROFILE)
}
fun NavController.navigateToOpenProfile(){
    this.navigate(ROUTE_OPEN_PROFILE)
}
fun NavController.navigateToCart(){
    this.navigate(ROUTE_CART)
}

