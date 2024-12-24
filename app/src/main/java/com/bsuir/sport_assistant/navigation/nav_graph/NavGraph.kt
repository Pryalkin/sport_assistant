package com.bsuir.sport_assistant.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.bsuir.sport_assistant.navigation.AUTHENTICATION_ROUTE
import com.bsuir.sport_assistant.navigation.ROOT_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AUTHENTICATION_ROUTE,
        route = ROOT_ROUTE
    ){
        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)

    }
}