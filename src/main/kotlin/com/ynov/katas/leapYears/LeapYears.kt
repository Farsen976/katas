package com.ynov.katas.leapYears

class LeapYears {
    fun execute(year: Int): String {
        if(year.rem(400) == 0) return "Leap Year"
        if(year.rem(4) == 0 && year.rem(100) != 0) return "Leap Year"
        return "Not Leap Year"
    }
}