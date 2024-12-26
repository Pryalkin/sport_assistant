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
fun SingUpAuthScreen(
    navController: NavHostController,
    viewModel: UserViewModel
) {
    val email = remember { mutableStateOf("") }
    val numberPhone = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val checkPassword = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = numberPhone.value,
            onValueChange = { numberPhone.value = it },
            label = { Text("Телефон (+375291112233)") },
            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.width(300.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = checkPassword.value,
            onValueChange = { checkPassword.value = it },
            label = { Text("Проверка пароля") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.width(300.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                viewModel.signUpAuthUserCase(email = email.value, numberPhone = numberPhone.value,
                    password = password.value, checkPassword = checkPassword.value)
                navController.navigate(Screen.SignUp.route)
            },
            modifier = Modifier.width(300.dp)
        ) {
            Text("Далее")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SingUpAuthScreenPreview(){
    SingUpAuthScreen(
        navController = rememberNavController(),
        viewModel = viewModel()
    )
}