package com.stargazer.progress.features.shop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stargazer.progress.R
import com.stargazer.progress.domain.manager.CartManager


@Composable
fun cart(navController: NavController) {

    val cartItems= CartManager.cartItems
    val totalItemCount = cartItems.fold(0) {acc, product ->
        acc + 1
    }
    var couponCode by remember { mutableStateOf("")}


    Column(modifier = Modifier.fillMaxSize().background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Here are the products you added to your cart",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Total Number of Products in Your Cart: $totalItemCount",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        if (cartItems.isEmpty()){
            Text("Your cart is empty.")
        }else{
            LazyColumn (modifier = Modifier.weight(1f)) {
                items(cartItems){product ->
                    Card(modifier = Modifier.fillMaxWidth().padding(8.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(4.dp)) {

                        Row(modifier = Modifier.fillMaxSize().padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween) {

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(painter = painterResource(id = product.displayImageResId),
                                    contentDescription = "null",
                                    modifier = Modifier.size(64.dp))
                                Spacer(modifier = Modifier.width(16.dp))
                                Text(product.name, fontWeight = FontWeight.Bold)
                            }
                            Icon(painter = painterResource(id = R.drawable.icondelete),
                                contentDescription = "delete",
                                modifier = Modifier.size(32.dp).clickable {
                                    CartManager.removeFromCart(product)
                                })
                        }
                    }
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically) {

                TextField(
                    value = couponCode,
                    onValueChange = {couponCode= it},
                    label ={ Text("Coupon Code")},
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = {
                        if(couponCode.uppercase() == "TEST0000"){
                            val couponItem = Coupon(
                                id = "CUPON-${couponCode.uppercase()}",
                                name = "Discount Code(${couponCode.uppercase()})",
                                displayImageResId = R.drawable.logo
                            )
                            CartManager.addToCart(couponItem)
                            couponCode = ""
                            println("add coupon true")
                        }else {
                            println("add coupon false")
                        }
                    }
                ) {
                    Text("Add")
                }
            }




            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { CartManager.clearCart()}) {

                Text("Clear Cart")
            }
        }

    }
}

