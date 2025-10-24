package com.stargazer.progress.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.stargazer.progress.R
import com.stargazer.progress.navigation.navigateToCart
import com.stargazer.progress.navigation.navigateToProfile
import com.stargazer.progress.navigation.navigateToShop
import com.stargazer.progress.core.utils.standartClickableCardStyle


@Composable
fun mainScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize().background(Color.Cyan).
    padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Welcome, what do you want to do today?",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.padding(20.dp))

        Column {

            Row {
                Card(
                    modifier = Modifier.standartClickableCardStyle { navController.navigateToShop() },
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.shop),
                            contentDescription = "",
                            modifier = Modifier.size(150.dp)
                        )
                        Text(
                            "Shop", textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(modifier = Modifier.padding(16.dp))

                Card(
                    modifier = Modifier.standartClickableCardStyle { navController.navigateToProfile() },
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "",
                            modifier = Modifier.size(150.dp)
                        )
                        Text(
                            "Profile", textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.padding(8.dp))

            Row {
                Card(
                    modifier = Modifier.standartClickableCardStyle { navController.navigateToCart() },
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.order),
                            contentDescription = "",
                            modifier = Modifier.size(150.dp)
                        )
                        Text(
                            "Cart", textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}