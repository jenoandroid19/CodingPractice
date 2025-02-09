package com.jeno.codingpractice.flowOfProgram

fun main(){
    print("Enter a number: ")
    val number = readlnOrNull()?.toIntOrNull() ?: return

    println("Multiplication table of $number:")

    for ( i in 1..10){
        println("$number * $i = ${number * i}" )
    }
}