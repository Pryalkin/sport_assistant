package com.bsuir.sport_assistant.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.bsuir.sport_assistant.navigation.AUTHENTICATION_ROUTE
import com.bsuir.sport_assistant.navigation.Screen
import com.bsuir.sport_assistant.screens.auth.HelloScreen
import com.bsuir.sport_assistant.screens.auth.LoginScreen
import com.bsuir.sport_assistant.screens.auth.SignUpScreen
import com.bsuir.sport_assistant.screens.auth.SingUpAuthScreen
import com.bsuir.sport_assistant.screens.auth.SingUpPersonScreen
import com.bsuir.sport_assistant.screens.auth.SingUpPlaceScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
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
            SingUpPersonScreen(navController = navController)
        }
        composable(
            route = Screen.SignUpPlace.route
        ){
            SingUpPlaceScreen(navController = navController)
        }
        composable(
            route = Screen.SignUpAuth.route
        ){
            SingUpAuthScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController = navController)
        }


    }
}