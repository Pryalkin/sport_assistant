package com.bsuir.sport_assistant.domain.usercase

import com.bsuir.sport_assistant.domain.models.Auth
import com.bsuir.sport_assistant.domain.repository.UserRepository

class SignUpAuthUseCase(private val userRepository: UserRepository) {


    fun execute(email: String,
                numberPhone: String,
                password: String
    ): Long {
        val auth = Auth(id = 0L, email = email, numberPhone = numberPhone, password = password)
        return userRepository.saveAuth(auth)
    }

}