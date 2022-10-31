package com.jeno.codingpractice.samplecoding

import java.util.*

class SumRandomNumbers {

    companion object {
        var total = 0;
        fun getInput() {
            val number1 = Scanner(System.`in`)
            print("Enter an integer: ")
            var enteredNumber1 = number1.next()
            if (!enteredNumber1.equals("x")){
                total = total + enteredNumber1.toInt()
                getInput()
            }else{
                println("Total : $total")
            }

        }
    }

}

fun main(args : Array<String>){
    SumRandomNumbers.getInput()
}