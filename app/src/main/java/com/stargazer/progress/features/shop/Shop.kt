package com.stargazer.progress.features.shop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stargazer.progress.R
import com.stargazer.progress.core.utils.doActionAndNavigate
import com.stargazer.progress.domain.manager.CartManager
import com.stargazer.progress.navigation.navigateToCart

interface CartItem <T> {
    val id: T
    val name: String
    val displayImageResId: Int
}

data class Product(
    override val id: String,
    override val name: String,
    override val displayImageResId: Int
): CartItem<String>

data class Coupon(
    override val id: String,
    override val name: String,
    override val displayImageResId: Int
): CartItem<String>


@Composable
fun shopScreen(navController: NavController){
    var searchText by remember{ mutableStateOf("") }

    val productNumberRange = (1..16)

    val productList = productNumberRange.map{index ->
        val id = "P${index.toString().padStart(3, '0')}"
        val name = "test item${index}"

        Product(
            id = id,
            name = name,
            displayImageResId = R.drawable.logo
        )
    }


    val filteredProductList = productList.filter { product ->
        product.name.contains(searchText, ignoreCase = true)
    }

    Column(modifier = Modifier.fillMaxSize().background(color = Color.Cyan)) {
        TextField(value = searchText,
            onValueChange = {searchText = it},
            label ={ Text("Search...")},
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White
            ))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize().background(color = Color.Cyan))
        { items(filteredProductList) { product -> readyToCard( navController,
            productName = product.name,
            imagePainter = painterResource(id = product.displayImageResId), product= product) }
        }
    }

}

@Composable
fun readyToCard(navController: NavController,
                product: Product,
                imagePainter: Painter,
                productName: String,
                modifier: Modifier = Modifier
) {
    Card( modifier = Modifier.padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column (
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = imagePainter, contentDescription = "",
                modifier = Modifier.size(64.dp))

            Text(text = productName, color = Color.Black)
            Button(
                onClick = {
                    navController.doActionAndNavigate(
                        action = { CartManager.addToCart(product)},
                        destination = {navController.navigateToCart()})
                }
            ) {
                Text("Add To Cart")
            }
        }

    }
}

