package com.example.navegacioneasy.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navegacioneasy.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pantall1(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "hola") })
        }
    ){
        innerPadding ->
        BodyContent(modifier = Modifier.padding(innerPadding),navController)
    }
}

@Composable
fun BodyContent(modifier: Modifier,navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hola navegación")
        Button(onClick = {navController.navigate(route = Routes.Pantall2.route + "/hola loca")}) {
            Text(text = "Navega")
        }
    }
}







