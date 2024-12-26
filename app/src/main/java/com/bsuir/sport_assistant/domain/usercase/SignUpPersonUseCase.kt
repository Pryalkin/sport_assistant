package com.bsuir.sport_assistant.domain.usercase

import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.repository.UserRepository

class SignUpPersonUseCase(private val userRepository: UserRepository){

    fun execute(surname: String,
                name: String,
                patronymic: String,
                dateOfBirth: String
    ): Long {
        val person = Person(id = 0L, surname = surname, name = name, patronymic = patronymic, dateOfBirth = dateOfBirth)
        return userRepository.savePerson(person)
    }

}