package com.example.roomapp.data

import androidx.lifecycle.LiveData
import com.bsuir.sport_assistant.data.dao.UserDao
import com.bsuir.sport_assistant.domain.models.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

}