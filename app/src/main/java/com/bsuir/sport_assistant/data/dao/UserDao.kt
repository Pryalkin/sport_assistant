package com.bsuir.sport_assistant.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bsuir.sport_assistant.domain.models.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(user: User): Long

    @Query("SELECT * FROM user ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

}