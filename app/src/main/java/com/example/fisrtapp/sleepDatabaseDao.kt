package com.example.fisrtapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface sleepDatabaseDao {
    @Insert
    fun insert(night:sleepNight)
    @Update
    fun update(night:sleepNight)
    @Query("DELETE FROM daily_sleep_quality_table")
    fun clear()
    @Query("SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    fun get(key:Long):sleepNight?
    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight():sleepNight?
    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNight(): LiveData<List<sleepNight>>
}