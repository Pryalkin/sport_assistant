package com.bsuir.sport_assistant.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "auth")
data class Auth(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val email: String,
    val numberPhone: String,
    val password: String
)
