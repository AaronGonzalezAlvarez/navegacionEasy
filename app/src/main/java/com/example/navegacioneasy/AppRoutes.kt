package com.example.navegacioneasy

sealed class AppRoutes(val route: String){
    object Pantall1: AppRoutes("pantalla_1")
    object Pantall2: AppRoutes("pantalla_2")
}
