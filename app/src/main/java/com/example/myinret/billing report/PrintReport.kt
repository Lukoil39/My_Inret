package com.example.myinret.`billing report`

class PrintReport {
//Вывод на принтер
    fun output(items: MutableList<ReportItem>){
        println("Output to PRINTER")
        for (item in items){

            val description = item.description
            val amount = item.amount
            println("PRINTER $description - $amount")
        }
    }
}