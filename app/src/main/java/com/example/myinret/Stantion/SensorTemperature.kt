package com.example.myinret.Stantion

interface SensorTemperature {
    fun identifier():Int        // Идентификатор датчика
    fun temperature():Double    // Температура датчика
    fun year():Int		       // Год
    fun day():Int		 // День года
    fun second():Int		 // Секунда дня
}