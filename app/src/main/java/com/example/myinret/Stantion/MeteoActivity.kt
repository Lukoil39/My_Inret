package com.example.myinret.Stantion

import com.example.myinret.R
import kotlinx.android.synthetic.main.activity_meteo.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MeteoActivity : AppCompatActivity() {

    private val meteoDB = MeteoStore()
    private val ms200_1 = MS200(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meteo)


        useST500Sensor()
        useMS200Sensor()

    }

    private fun useST500Sensor() {

        st500UseBtn.setOnClickListener {
            val st500Info = ST500Info()
            meteoLog.text = meteoDB.save(ST500Adapter(st500Info)).second
        }
    }

    private fun useMS200Sensor() {

        ms200UseBtn.setOnClickListener {
            meteoLog.text = meteoDB.save(ms200_1).second
        }
    }


}