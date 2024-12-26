package com.bsuir.sport_assistant.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "person")
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val surname: String,
    val name: String,
    val patronymic: String,
    val dateOfBirth: String)
