package com.example.navigation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    var edad: Int by remember { mutableStateOf(0) }

    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Segunda Pantalla")

        OutlinedTextField(
            value = edad.toString(),
            onValueChange = {edad = it.toInt()},
            label = {
                Text(text = "Ingresa tu edad")
            },
            placeholder = {
                Text(text = "Por favor, ingresa tu edad")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Star, contentDescription = "Icon")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        )

        Button(onClick = {
            navController.navigate("TerceraPantalla/$edad")
        }) {
            Text(text = "Siguiente")
        }

        Button(onClick = {
                navController.popBackStack()
            }
        ) {
            Text(text = "Regresar")
        }
    }
}

@Composable
fun ThirdView(navController: NavHostController, age: Int) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Su edad es $age")

        Button(onClick = {
            navController.popBackStack()
        }
        ) {
            Text(text = "Regresar")
        }
    }
}