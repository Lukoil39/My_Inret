package com.example.myinret.`billing report`

interface IReport {

    fun calculate()
    fun output(outputMethod: IOutput)
}