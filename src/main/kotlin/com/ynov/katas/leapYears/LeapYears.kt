package com.ynov.katas.leapYears

class LeapYears {
    fun execute(year: Int): String {
        if(year.rem(400) == 0) return LEAP_YEAR
        if(year.rem(4) == 0 && year.rem(100) != 0) return LEAP_YEAR
        return NOT_LEAP_YEAR
    }
    companion object{
        const val LEAP_YEAR = "Leap Year"
        const val NOT_LEAP_YEAR = "Not Leap Year"
    }
}