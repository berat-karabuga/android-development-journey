package com.stargazer.progress.features.profile

import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.height
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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
import com.stargazer.progress.domain.manager.UserManager
import com.stargazer.progress.navigation.navigateToOpenProfile


@Composable
fun profileScreen(navController: NavController) {
    var showButtons by remember { mutableStateOf(true) }
    var showLoginForm by remember { mutableStateOf(false) }
    var showSignUpForm by remember { mutableStateOf(false) }

    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            AnimatedVisibility(
                visible = showButtons,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {

                Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Choose an action:", fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center) {
                        Button(onClick = {
                            showButtons = false
                            showLoginForm = true
                        }) {
                            Text("Login")
                        }
                        Spacer(modifier = Modifier.width(8.dp))

                        Button(onClick = {
                            showButtons = false
                            showSignUpForm = true
                        }) {
                            Text("Sign Up")
                        }
                    }
                }
            }


            AnimatedVisibility(
                visible = showLoginForm,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Log in to see profile", fontWeight = FontWeight.Bold)

                    Spacer(modifier = Modifier.padding(20.dp))

                    TextField(
                        value = user,
                        onValueChange = { user = it },
                        label = { Text("Username") },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White
                        )

                    )

                    Spacer(modifier = Modifier.padding(5.dp))

                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White
                        ))

                    Spacer(modifier = Modifier.padding(10.dp))

                    Button(onClick = {
                        if(UserManager.login(user,password)){
                            navController.navigateToOpenProfile()
                            println("log in true")
                        }else{
                            println("log in false")}
                    }){
                        Text("Log in")

                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        showLoginForm = false
                        showButtons = true
                    }) {
                        Text("Back")
                    }
                }
            }

            AnimatedVisibility(
                visible = showSignUpForm,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Sign Up screen (soon...)")
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        showSignUpForm = false
                        showButtons = true
                    }) {
                        Text("Back")
                    }
                }
            }
        }
    }

@Composable
fun openProfile(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Image(painter = painterResource(id= R.drawable.profile), contentDescription = "")
    }
}

