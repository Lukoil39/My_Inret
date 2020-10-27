package com.example.myinret.`billing report`

class Decorator (private val report: Report):IReport {

    override fun calculate() {
        report.calculate()
    }

    override fun output(outputMethod: IOutput) {
        outputMethod.output(report.items)
    }

}