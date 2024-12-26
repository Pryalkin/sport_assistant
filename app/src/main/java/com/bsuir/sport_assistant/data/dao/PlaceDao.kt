package com.bsuir.sport_assistant.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place

@Dao
interface PlaceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addPlace(person: Place): Long

}