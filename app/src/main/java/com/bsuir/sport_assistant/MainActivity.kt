package com.bsuir.sport_assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.navigation.nav_graph.SetupNavGraph
import com.bsuir.sport_assistant.ui.theme.Sport_assistantTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sport_assistantTheme {
                navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }
}



