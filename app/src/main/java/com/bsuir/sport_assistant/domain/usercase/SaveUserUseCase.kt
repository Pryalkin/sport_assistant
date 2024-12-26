package com.bsuir.sport_assistant.domain.usercase

import com.bsuir.sport_assistant.domain.models.User
import com.bsuir.sport_assistant.domain.repository.UserRepository

class SaveUserUseCase(private val userRepository: UserRepository) {


    fun execute(personId: Long, placeId: Long, authId: Long): Long{
        val user: User = User(0L, personId = personId, placeId = placeId, authId = authId)
        return userRepository.saveUser(user = user)
    }
}