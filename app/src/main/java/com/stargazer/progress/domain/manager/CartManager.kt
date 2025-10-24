package com.stargazer.progress.domain.manager

import androidx.compose.runtime.mutableStateListOf
import com.stargazer.progress.features.shop.CartItem

object CartManager {

    private val _cartItems = mutableStateListOf<CartItem<String>>()
    val cartItems: List<CartItem<String>> get() = _cartItems

    fun addToCart(product: CartItem<String>){
        _cartItems.add(product)
    }

    fun removeFromCart(product: CartItem<String>){
        _cartItems.remove(product)
    }

    fun clearCart() {
        _cartItems.clear()
    }
}


