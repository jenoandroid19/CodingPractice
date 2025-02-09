package com.jeno.codingpractice.flowOfProgram




fun main(){
    val year = 1999
    if((year % 4 == 0 || year % 400 == 0 ) && (year % 100 != 0)){
        println("$year is  Leap year")
    } else {
        println("$year is not Leap year")
    }

}