package com.bsuir.sport_assistant.data.dao.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bsuir.sport_assistant.data.dao.AuthDao
import com.bsuir.sport_assistant.domain.models.Auth

@Database(entities = [Auth::class], version = 1, exportSchema = false)
abstract class AuthDatabase : RoomDatabase() {

    abstract fun authDao(): AuthDao

    companion object {
        @Volatile
        private var INSTANCE: AuthDatabase? = null

        fun getDatabase(context: Context): AuthDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AuthDatabase::class.java,
                    "auth_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}