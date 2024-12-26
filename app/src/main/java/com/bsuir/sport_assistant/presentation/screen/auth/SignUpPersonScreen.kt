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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bsuir.sport_assistant.presentation.navigation.Screen
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel


@Composable
fun SingUpPersonScreen(
    navController: NavHostController,
    viewModel: UserViewModel
) {

    val surname = remember { mutableStateOf("") }
    val name = remember { mutableStateOf("") }
    val patronymic = remember { mutableStateOf("") }
    val dateOfBirth = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = surname.value,
            onValueChange = { surname.value = it },
            label = { Text("Фамилия") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Имя") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = patronymic.value,
            onValueChange = { patronymic.value = it },
            label = { Text("Отчество") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = dateOfBirth.value,
            onValueChange = { dateOfBirth.value = it },
            label = { Text("Дата рождения") },
            modifier = Modifier.width(300.dp),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModel.signUpPersonUserCase(surname = surname.value, name = name.value,
                    patronymic = patronymic.value, dateOfBirth = dateOfBirth.value)
                navController.navigate(Screen.SignUpPlace.route)
            },
            modifier = Modifier.width(300.dp)
        ) {
            Text("Далее")
        }
    }
}

//@Composable
//@Preview(showBackground = true)
//fun SingUpPersonScreenPreview(){
//    SingUpPersonScreen(
//        navController = rememberNavController(),
//        viewModel = viewModel(),
//        null
//    )
//}