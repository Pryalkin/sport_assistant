package com.bsuir.sport_assistant.domain.usercase

import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place
import com.bsuir.sport_assistant.domain.repository.UserRepository

class SignUpPlaceUseCase(private val userRepository: UserRepository){

    fun execute(country: String,
                city: String,
                street: String,
                house: String
    ): Long {
        val place = Place(id = 0L, country = country, city = city, street = street, house = house)
        return userRepository.savePlace(place)
    }

}