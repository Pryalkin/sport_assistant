package com.bsuir.sport_assistant.domain.usercase

import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.repository.UserRepository

class SignUpPersonUseCase(private val userRepository: UserRepository){

    fun execute(surname: String,
                name: String,
                patronymic: String,
                dateOfBirth: String
    ): Long {
        val person = Person(surname = surname, name = name, patronymic = patronymic, dateOfBirth = dateOfBirth)
        val id = userRepository.savePerson(person)
        return id
    }

}