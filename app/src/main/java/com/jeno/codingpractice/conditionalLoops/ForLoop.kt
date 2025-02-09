package com.jeno.codingpractice.conditionalLoops

import java.util.*


fun main(args : Array<String>){
    handlingLoop(2)
}

fun handlingLoop(int: Int){
    if (int > 20) return
    for(i in 1 .. 10){
        println("$i x $int = ${i*int}")
    }
    val num = int + 1
    handlingLoop(num)
}
