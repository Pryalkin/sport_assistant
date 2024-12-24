package com.bsuir.sport_assistant.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.bsuir.sport_assistant.navigation.DETAIL_ARGUMENT_KEY
import com.bsuir.sport_assistant.navigation.DETAIL_ARGUMENT_KEY2
import com.bsuir.sport_assistant.navigation.HOME_ROUTE
import com.bsuir.sport_assistant.navigation.Screen
import com.bsuir.sport_assistant.screens.app.MenuScreen

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
    }

}