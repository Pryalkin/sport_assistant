package com.bsuir.sport_assistant.data.repository

import com.bsuir.sport_assistant.data.dao.AuthDao
import com.bsuir.sport_assistant.data.dao.PersonDao
import com.bsuir.sport_assistant.data.dao.PlaceDao
import com.bsuir.sport_assistant.data.dao.UserDao
import com.bsuir.sport_assistant.domain.models.Auth
import com.bsuir.sport_assistant.domain.models.LoginUser
import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place
import com.bsuir.sport_assistant.domain.models.User
import com.bsuir.sport_assistant.domain.repository.UserRepository

class UserRepositoryImpl(private val personDao: PersonDao,
                         private val placeDao: PlaceDao,
                         private val authDao: AuthDao,
                         private val userDao: UserDao
): UserRepository {

    override fun saveUser(user: User): Long{
        return userDao.addUser(user)
    }

    override fun login(loginUser: LoginUser){

    }

    override fun savePerson(person: Person): Long {
        return personDao.addPerson(person)
    }

    override fun savePlace(place: Place): Long {
        return placeDao.addPlace(place)
    }

    override fun saveAuth(auth: Auth): Long {
        return authDao.addAuth(auth)
    }

}