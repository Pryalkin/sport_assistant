package com.bsuir.sport_assistant.presentation.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bsuir.sport_assistant.presentation.navigation.Screen
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel

@Composable
fun SingUpPlaceScreen(
    navController: NavHostController,
    viewModel: UserViewModel
) {
    val country = remember { mutableStateOf("") }
    val city = remember { mutableStateOf("") }
    val street = remember { mutableStateOf("") }
    val house = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = country.value,
            onValueChange = { country.value = it },
            label = { Text("Страна") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = city.value,
            onValueChange = { city.value = it },
            label = { Text("Город") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = street.value,
            onValueChange = { street.value = it },
            label = { Text("Улица") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = house.value,
            onValueChange = { house.value = it },
            label = { Text("Дом") },
            modifier = Modifier.width(300.dp),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModel.signUpPlaceUserCase(country = country.value, city = city.value,
                    street = street.value, house = house.value)
                navController.navigate(Screen.SignUpAuth.route)
            },
            modifier = Modifier.width(300.dp)
        ) {
            Text("Далее")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SingUpPlaceScreenPreview(){
    SingUpPlaceScreen(
        navController = rememberNavController(),
        viewModel = viewModel()
    )
}