package com.example.myinret.`billing report`

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinret.R

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val report = Report()
        //must have to report
        report.calculate()
        report.output()

        Decorator(report).output(ReportUnderwrite())
        Decorator(report).output(Showing())

    }
}