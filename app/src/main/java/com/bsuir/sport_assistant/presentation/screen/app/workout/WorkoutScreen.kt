package com.bsuir.sport_assistant.presentation.screen.app.workout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.presentation.navigation.Screen

@Composable
fun WorkoutScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {
                navController.navigate(Screen.AddWorkout.route)
            },
            modifier = Modifier.width(200.dp).height(75.dp)
        ) {
            Text("Добавить тренировку")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(Screen.HistoryWorkout.route)
            },
            modifier = Modifier.width(200.dp).height(75.dp)
        ) {
            Text("История тренировок")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(Screen.Login.route)
            },
            modifier = Modifier.width(200.dp).height(75.dp)
        ) {
            Text("Статистика")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(Screen.Menu.route)
            },
            modifier = Modifier.width(200.dp).height(75.dp)
        ) {
            Text("МЕНЮ")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun WorkoutScreenPreview(){
    WorkoutScreen(
        navController = rememberNavController()
    )
}