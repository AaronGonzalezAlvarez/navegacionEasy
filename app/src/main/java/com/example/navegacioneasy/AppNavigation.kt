package com.example.navegacioneasy

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacioneasy.screens.Pantall1
import com.example.navegacioneasy.screens.Pantall2

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()){
    NavHost(
        navController = navController,
        startDestination = Routes.Pantall1.route
    ){
        composable (route = Routes.Pantall1.route){
            Pantall1(navController)
        }
        composable (
            route = Routes.Pantall2.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){type= NavType.StringType})
            ){
            Pantall2(navController, it.arguments?.getString("text"))
        }
    }
}