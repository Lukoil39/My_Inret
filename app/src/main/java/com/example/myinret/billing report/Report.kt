package com.example.myinret.`billing report`

class Report {

    val items: MutableList<ReportItem> = mutableListOf()

    fun calculate(){
        items.add(ReportItem("First", 5f))
        items.add(ReportItem("Second", 6f))
    }

    fun output(){
        val printReport = PrintReport()
        printReport.output(items)
    }
}