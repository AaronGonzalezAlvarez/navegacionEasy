package com.example.navegacioneasy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navegacioneasy.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pantall2(navController: NavController , text:String?){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "hola") },
                navigationIcon = {
                    Icon( imageVector =  Icons.Default.ArrowBack,
                        contentDescription = "Atras",
                        modifier = Modifier.clickable { navController.popBackStack() })
                }
            )
        }
    ){
            innerPadding ->
        BodyContentSecond(modifier = Modifier.padding(innerPadding),navController,text)
    }
}

@Composable
fun BodyContentSecond(modifier: Modifier,navController: NavController, text:String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "he navegado")
        text?.let {
            Text(text = it)
        }
        Button(onClick = {
            navController.navigate(route = Routes.Pantall1.route)
            //navController.popBackStack()
        }) {
            Text(text = "volver atras")
        }
    }
}