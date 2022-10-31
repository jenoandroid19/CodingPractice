package com.jeno.codingpractice.samplecoding

class Sample {

    fun add(a : Int ,b:Int) : Int{
        return a+b
    }

}

fun main(args : Array<String>){
    //Sum of two numbers
    println("Sum of value ${Sample().add(5,6)}")

    // Multiplication table
    val input = 8
    for (number in 1..10){
        println("$number * $input = ${number * input}")
    }
}