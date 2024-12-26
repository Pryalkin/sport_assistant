package com.bsuir.sport_assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.presentation.navigation.nav_graph.SetupNavGraph
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel
import com.bsuir.sport_assistant.ui.theme.Sport_assistantTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sport_assistantTheme {
                navController = rememberNavController()
                SetupNavGraph(navController, userViewModel)
            }
        }
    }
}



