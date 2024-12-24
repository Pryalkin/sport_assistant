package com.bsuir.sport_assistant.screens.app

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.navigation.HOME_ROUTE
import com.bsuir.sport_assistant.navigation.Screen
import com.bsuir.sport_assistant.screens.auth.LoginScreen

@Composable
fun MenuScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            Button(
                onClick = {
                    navController.navigate(Screen.Login.route)
                },
                modifier = Modifier.width(200.dp).height(75.dp)
            ) {
                Text("Тренировки")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate(Screen.Login.route)
                },
                modifier = Modifier.width(200.dp).height(75.dp)
            ) {
                Text("Питание")
            }

        Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate(Screen.Login.route)
                },
                modifier = Modifier.width(200.dp).height(75.dp)
            ) {
                Text("Сон")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    navController.navigate(Screen.Login.route)
                },
                modifier = Modifier.width(200.dp).height(75.dp)
            ) {
                Text("Эмоциональное состояние")
            }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(Screen.Login.route)
            },
            modifier = Modifier.width(200.dp).height(75.dp)
        ) {
            Text("Дневник")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuScreenScreenPreview(){
    MenuScreen(
        navController = rememberNavController()
    )
}