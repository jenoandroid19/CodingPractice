package com.jeno.codingpractice.samplecoding2

class Fibonacci {
}

fun main(args : Array<String>){
    var total = 0
    var t1 = 0
    var t2 = 1
    for (number in 0..10){
        total = t1 + t2
        
        println(total)
    }
}