package com.bsuir.sport_assistant.domain.repository

import com.bsuir.sport_assistant.domain.models.Auth
import com.bsuir.sport_assistant.domain.models.LoginUser
import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place
import com.bsuir.sport_assistant.domain.models.User

interface UserRepository {

    fun saveUser(user: User): Long
    fun login(loginUser: LoginUser)
    fun savePerson(person: Person): Long
    fun savePlace(place: Place): Long
    fun saveAuth(auth: Auth): Long

}