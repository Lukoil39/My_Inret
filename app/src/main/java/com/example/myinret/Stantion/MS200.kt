package com.example.myinret.Stantion

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class MS200(private val id:Int): MeteoSensor {

    override fun getId(): Int {
        return id
    }

    override fun getTemperature(): Float {
        return 20f
    }

    override fun getHumidity(): Float {
        return 60f
    }

    override fun getPressure(): Float {
        return 752.4f
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun getDateTime(): LocalDateTime {
        return  LocalDateTime.now()
    }
}