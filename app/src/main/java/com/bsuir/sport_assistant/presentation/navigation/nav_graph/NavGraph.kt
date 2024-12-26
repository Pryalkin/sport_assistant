package com.bsuir.sport_assistant.presentation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.bsuir.sport_assistant.presentation.navigation.AUTHENTICATION_ROUTE
import com.bsuir.sport_assistant.presentation.navigation.ROOT_ROUTE
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    userViewModel: UserViewModel
) {
    NavHost(
        navController = navController,
        startDestination = AUTHENTICATION_ROUTE,
        route = ROOT_ROUTE
    ){

        authNavGraph(navController = navController,
                    userViewModel = userViewModel)
        homeNavGraph(navController = navController)

    }
}