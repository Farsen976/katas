package com.ynov.katas.leapYears

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LeapYearsTest {

    @Test
    fun`should be leap year if it's divisible by 400`(){
        val leapYears = LeapYears()
        assertEquals("Leap Year", leapYears.execute(2000))
    }

    @Test
    fun`should not be leap year if it's divisible by 100 but not by 400`(){
        val leapYears = LeapYears()
        assertEquals("Not Leap Year", leapYears.execute(1700))
    }

    @Test
    fun`should be leap year if it's divisible by 4 but not by 100`(){
        val leapYears = LeapYears()
        assertEquals("Leap Year", leapYears.execute(2008))
    }

    @Test
    fun`should not be leap year if it's not divisible by 4`(){
        val leapYears = LeapYears()
        assertEquals("Not Leap Year", leapYears.execute(2019))
    }
}