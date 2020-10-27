package com.example.myinret.Stantion

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class ST500Info {
    fun getData():SensorTemperature{
        return object: SensorTemperature{
            override fun identifier(): Int {
                return 1
            }

            override fun temperature(): Double {
                return 22.0
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun year(): Int {
                return LocalDateTime.now().year
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun day(): Int {
                return LocalDateTime.now().dayOfYear
            }

            @RequiresApi(Build.VERSION_CODES.O)
            override fun second(): Int {
                val now = LocalDateTime.now();
                return now.hour *3600 + now.minute *60 + now.second
            }
        }
    }
}