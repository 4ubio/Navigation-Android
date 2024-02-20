package com.example.navigation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun HomeView(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Inicio")
        Button(onClick = {
            navController.navigate("SegundaPantalla")
        }) {
            Text(text = "Siguiente")
        }
    }
}

@Composable
fun SecondView(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Segunda Pantalla")

        Button(onClick = {
                navController.popBackStack()
            }
        ) {
            Text(text = "Regresar")
        }
    }
}