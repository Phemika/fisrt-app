package com.example.fisrtapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class SleepNight(
    var nightId: Long = 0L,
    val startTimeMilli:Long = System.currentTimeMillis(),
    var endtimeMilli: Long = startTimeMilli,
    var sleepQuality: Int = -1
)
@Entity(tableName = "daily_sleep_quality_table")
data class sleepNight(
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,

    @ColumnInfo(name = "start_time_milli")
    val startTimeMilli: Long = System.currentTimeMillis(),

    @ColumnInfo(name = "end_time_milli")
    var endTimeMilli: Long = startTimeMilli,

    @ColumnInfo(name = "quality_rating")
    var sleepQuality: Int = -1
)