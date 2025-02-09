package com.jeno.codingpractice.conditionalLoops

import java.util.*


fun main(args : Array<String>){
    var input = Scanner(System.`in`)
    var number :Int = input.nextInt()

    val names = arrayOf("Jeno", "Jeno1", "Jeno2", "Jeno3")

    // do while loop example

    do {
        println(number)
        number++
    }while (number <= 10)



}