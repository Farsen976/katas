package com.ynov.katas.fizzBuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `should return nothing when it's not divisible by 3 or 5`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("1",fizzBuzz.execute(1))
    }

    @Test
    fun `should return fizz if it's divisible by 3`() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz",fizzBuzz.execute(3))
    }

    @Test
    fun `should return buzz if it's divisible by 5`(){
        val fizzBuzz = FizzBuzz()
        assertEquals("Buzz",fizzBuzz.execute(5))
    }

    @Test
    fun `should return FizzBuzz if it's divisible by 5 and 3`(){
        val fizzBuzz = FizzBuzz()
        assertEquals("FizzBuzz",fizzBuzz.execute(15))
    }
}