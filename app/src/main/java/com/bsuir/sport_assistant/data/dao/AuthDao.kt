package com.bsuir.sport_assistant.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.bsuir.sport_assistant.domain.models.Auth

@Dao
interface AuthDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAuth(auth: Auth): Long

}