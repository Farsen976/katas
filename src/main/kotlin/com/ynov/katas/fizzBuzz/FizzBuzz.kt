package com.ynov.katas.fizzBuzz

class FizzBuzz {
    fun execute(number: Int): String {
        if (divisibleBy5And3(number) == 0) {
            return  "FizzBuzz"
        }

       if (divisibleBy5(number) == 0) {
           return "Buzz"
       }
        if (divisibleBy3(number) == 0){
            return "Fizz"
        }
        return "$number"
    }

    private fun divisibleBy3(number: Int): Int =  number % 3
    private fun divisibleBy5(number: Int): Int = number % 5
    private fun divisibleBy5And3(number: Int): Int = divisibleBy5(number) + divisibleBy3(number)

}