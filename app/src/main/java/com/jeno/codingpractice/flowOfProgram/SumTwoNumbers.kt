package com.jeno.codingpractice.flowOfProgram

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
    for (number in 1 .. 3){
        println("$number * $input = ${number * input}")
    }
    for (number in 5 downTo 1){
        println("$number * $input = ${number * input}")
    }

    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (num in numbers){
        if (num % 4 == 0){
            print(num)
        }
    }
    println()
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for (plant in planets){
        print(plant)
    }
    println()
    for (plant in planets.indices){
        print(plant)
    }
    println()
    for ((index,value ) in planets.withIndex()){
        println("$value in $index th index")
    }

}