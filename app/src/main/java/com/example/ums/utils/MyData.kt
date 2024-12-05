package com.example.ums.utils

import com.example.ums.models.MyInfo

object MyData {
    val tarifList = arrayListOf(
        MyInfo("Mobi 30", "*880*0#", "Pul"),
        MyInfo("Mobi 50", "*150*4#", "Pul"),
        MyInfo("Mobi 75", "*280*2#", "Pul"),
        MyInfo("Mobi 100", "*770*7#", "Pul")

    )
    val daqiqaList = arrayListOf(
        MyInfo("30 daq", "*820*0#", "Pul"),
        MyInfo("50 daq", "*830*0#", "Pul"),
        MyInfo("80 daq", "*840*0#", "Pul"),
        MyInfo("100 daq", "*850*0#", "Pul")

    )
    val internetList = arrayListOf(
        MyInfo("Gb 20", "*120*0#", "Pul"),
        MyInfo("Gb 30", "*130*0#", "Pul"),
        MyInfo("Gb 40", "*140*0#", "Pul"),
        MyInfo("Gb 50", "*150*0#", "Pul")

    )
    val xizmatList = arrayListOf(
        MyInfo("Tariflar bo'yicha", "*880#", "Pul"),
        MyInfo("Daqiqalar bo'yicha", "*770#", "Pul"),
        MyInfo("Internet bo'yicha", "*550#", "Pul"),
        MyInfo("boshqa xizmatlar bo'yicha", "*330#", "Pul")

    )
    val smsList = arrayListOf(
        MyInfo("SMS 30", "*880*0#", "Pul"),
        MyInfo("SMS 40", "*880*0#", "Pul"),
        MyInfo("SMS 50", "*880*0#", "Pul"),
        MyInfo("SMS 60", "*880*0#", "Pul")

    )
}