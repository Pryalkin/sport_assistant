package com.bsuir.sport_assistant.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "place")
data class Place(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val country: String,
    val city: String,
    val street: String,
    val house: String,)
