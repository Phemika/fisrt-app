package com.example.fisrtapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.time.Instant

@Database(entities = [sleepDatabase ::class],version = 1 ,exportSchema = false)
abstract class sleepDatabase : RoomDatabase(){
    abstract val sleepDatabase:sleepDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE: sleepDatabase? = null

        fun getInstance(context: Context):sleepDatabase{
            synchronized(this) {
                var instant = INSTANCE

                if (instant == null) {
                    instant = Room.databaseBuilder(
                        context.applicationContext,
                        sleepDatabase::class.java,
                        "sleep_history_database"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instant

                }
                return instant
            }
        }
    }
}