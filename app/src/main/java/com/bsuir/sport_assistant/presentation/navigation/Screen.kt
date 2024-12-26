package com.bsuir.sport_assistant.presentation.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home"
const val WORKOUT_ROUTE = "workout"

sealed class Screen(val route: String) {

    data object Hello: Screen(route = "hello_screen")
//    data object Menu: Screen(route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}"){
//        fun passNameAndId(
//            id: Int = 0,
//            name: String = "admin"
//        ): String{
//            return "detail_screen?id=$id&name=$name"
//        }
//    }
    data object Menu: Screen(route = "menu_screen")
    data object Login: Screen(route = "login_screen")
    data object SignUpPerson: Screen(route = "sign_up_person_screen")
    data object SignUpPlace: Screen(route = "sign_up_place_screen")
    data object SignUpAuth: Screen(route = "sign_up_auth_screen")
    data object SignUp: Screen(route = "sign_up_screen")
    data object Workout: Screen(route = "workout_screen")
    data object AddWorkout: Screen(route = "add_workout_screen")
    data object HistoryWorkout: Screen(route = "history_workout_screen")
}