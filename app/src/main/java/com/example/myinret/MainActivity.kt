package com.example.myinret

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinret.Stantion.MeteoActivity
import com.example.myinret.`billing report`.ReportActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toBillingReport()
        toMeteoStation()
    }

    private fun toMeteoStation(){
        stationBtn.setOnClickListener {
            startActivity(Intent(this, MeteoActivity::class.java))
        }
    }

    private fun toBillingReport(){
        toBillingReportBtn.setOnClickListener {
            startActivity(Intent(this, ReportActivity::class.java))
        }
    }
}
