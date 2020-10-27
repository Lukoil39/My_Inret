package com.example.myinret.Stantion

import java.time.LocalDateTime

interface MeteoSensor {

    fun getId(): Int   // Идентификатор датчика
    fun getTemperature(): Float// Температура датчика
    fun getHumidity(): Float// Влажность
    fun getPressure(): Float// Давление
    fun getDateTime(): LocalDateTime// Время чтения данных датчика
}