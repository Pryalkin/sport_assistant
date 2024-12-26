package com.bsuir.sport_assistant.presentation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.bsuir.sport_assistant.presentation.navigation.Screen
import com.bsuir.sport_assistant.presentation.navigation.WORKOUT_ROUTE
import com.bsuir.sport_assistant.presentation.screen.app.workout.AddWorkoutScreen
import com.bsuir.sport_assistant.presentation.screen.app.workout.HistoryWorkoutScreen
import com.bsuir.sport_assistant.presentation.screen.app.workout.WorkoutScreen

fun NavGraphBuilder.workoutNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Workout.route,
        route = WORKOUT_ROUTE
    ){
        composable(
            route = Screen.Workout.route,
        ){
            WorkoutScreen(navController = navController)
        }
        composable(
            route = Screen.AddWorkout.route,
        ){
            AddWorkoutScreen(navController = navController)
        }
        composable(
            route = Screen.HistoryWorkout.route,
        ){
            HistoryWorkoutScreen(navController = navController)
        }
    }

}