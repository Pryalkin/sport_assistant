package com.bsuir.sport_assistant.data.dao.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bsuir.sport_assistant.data.dao.AuthDao
import com.bsuir.sport_assistant.data.dao.PersonDao
import com.bsuir.sport_assistant.data.dao.PlaceDao
import com.bsuir.sport_assistant.data.dao.UserDao
import com.bsuir.sport_assistant.domain.models.Auth
import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place
import com.bsuir.sport_assistant.domain.models.User

@Database(entities = [User::class, Person::class, Place::class, Auth::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun placeDao(): PlaceDao
    abstract fun personDao(): PersonDao
    abstract fun authDao(): AuthDao


    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "test_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                return instance
            }
        }
    }

}