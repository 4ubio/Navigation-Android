package com.example.navigation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

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

        composable(
            route = "TerceraPantalla/{age}",
            arguments = listOf(
                navArgument("age") {
                    type = NavType.IntType
                })
        ) {
            parameters ->
                var age:Int = parameters.arguments?.getInt("age") ?: 0

            ThirdView(navController, age)
        }
    }
}