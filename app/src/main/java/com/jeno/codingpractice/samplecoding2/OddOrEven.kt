package com.jeno.codingpractice.samplecoding2

import java.util.*

class OddOrEven {

}

fun main(args : Array<String>){
    var input = Scanner(System.`in`)
    var number :Int = input.nextInt()

    if (number % 2 == 0){
        println("even")
    }else{
        println("odd")
    }

}