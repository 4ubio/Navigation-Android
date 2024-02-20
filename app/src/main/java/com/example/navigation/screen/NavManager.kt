package com.example.navigation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "PrimerPantalla") {
        //Definiendo Rutas
        composable(route = "PrimerPantalla") {
            HomeView(navController)
        }

        composable(route = "SegundaPantalla") {
            SecondView(navController)
        }
    }
}