package com.bsuir.sport_assistant.presentation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.bsuir.sport_assistant.presentation.navigation.HOME_ROUTE
import com.bsuir.sport_assistant.presentation.navigation.Screen
import com.bsuir.sport_assistant.presentation.screen.app.MenuScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Menu.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Menu.route,
        ){
            MenuScreen(navController = navController)
        }
        workoutNavGraph(navController = navController)
    }

}