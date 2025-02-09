package com.jeno.codingpractice.conditionalLoops

import java.util.*

class OddOrEven {

}

fun main(args : Array<String>){
    var input = Scanner(System.`in`)
    var number :Int = input.nextInt()

    val names = arrayOf("Jeno", "Jeno1", "Jeno2", "Jeno3")

    // while loop example

    while (number <= 10){
        println(number)
        number++
    }

    while (number < names.size){
        println(names[number])
        number++
    }

    // do while loop example

    do {
        println(number)
        number++
    }while (number <= 10)



}