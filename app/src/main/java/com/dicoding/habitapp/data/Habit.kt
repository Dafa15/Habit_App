package com.dicoding.habitapp.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

//TODO 1 : Define a local database table using the schema in app/schema/habits.json
@Parcelize
@Entity(tableName = "habits")
data class Habit(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id")
    val id: Int = 0,

    @ColumnInfo("title")
    val title: String,

    @ColumnInfo("minutesFocus")
    val minutesFocus: Long,

    @ColumnInfo("startTime")
    val startTime: String,

    @ColumnInfo("priorityLevel")
    val priorityLevel: String
): Parcelable
