package com.bsuir.sport_assistant.presentation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.bsuir.sport_assistant.presentation.navigation.AUTHENTICATION_ROUTE
import com.bsuir.sport_assistant.presentation.navigation.Screen
import com.bsuir.sport_assistant.presentation.screen.auth.HelloScreen
import com.bsuir.sport_assistant.presentation.screen.auth.LoginScreen
import com.bsuir.sport_assistant.presentation.screen.auth.SignUpScreen
import com.bsuir.sport_assistant.presentation.screen.auth.SingUpAuthScreen
import com.bsuir.sport_assistant.presentation.screen.auth.SingUpPersonScreen
import com.bsuir.sport_assistant.presentation.screen.auth.SingUpPlaceScreen
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController,
    userViewModel: UserViewModel
){

    navigation(
        startDestination = Screen.Hello.route,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            route = Screen.Hello.route
        ){
            HelloScreen(navController = navController)
        }
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUpPerson.route
        ){
            SingUpPersonScreen(navController = navController,
                viewModel = userViewModel)
        }
        composable(
            route = Screen.SignUpPlace.route
        ){
            SingUpPlaceScreen(navController = navController,
                viewModel = userViewModel)
        }
        composable(
            route = Screen.SignUpAuth.route
        ){
            SingUpAuthScreen(navController = navController,
                viewModel = userViewModel)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController = navController)
        }


    }
}