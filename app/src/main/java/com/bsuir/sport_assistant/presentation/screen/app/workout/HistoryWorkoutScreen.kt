package com.bsuir.sport_assistant.presentation.screen.app.workout

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.presentation.navigation.Screen

@Composable
fun HistoryWorkoutScreen(navController: NavHostController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Workout.route)
            },
            text = "Hello",
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.displayMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }

}

@Composable
@Preview(showBackground = true)
fun HistoryWorkoutScreenPreview(){
    HistoryWorkoutScreen(
        navController = rememberNavController()
    )
}