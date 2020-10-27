package com.example.myinret.Stantion

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

class ST500Adapter(private val st500Info: ST500Info): MeteoSensor {
    override fun getId(): Int {
        return st500Info.getData().identifier()
    }

    override fun getTemperature(): Float {
        return st500Info.getData().temperature().toFloat()
    }

    override fun getHumidity(): Float {
        return -1f
    }

    override fun getPressure(): Float {
        return -1f
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getDateTime(): LocalDateTime {

        val localDate = LocalDate.ofYearDay(st500Info.getData().year(), st500Info.getData().day())
        val localTime = LocalTime.ofSecondOfDay(st500Info.getData().second().toLong())

        return LocalDateTime.of(localDate, localTime)
    }
}