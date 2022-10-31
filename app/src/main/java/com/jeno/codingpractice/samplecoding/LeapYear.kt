package com.jeno.codingpractice.samplecoding

class LeapYear {

}

fun main(args : Array<String>){
    var year = 2012
    var leap = false
    if (year % 4 == 0 ){
        if (year % 100 == 0){
            leap = year % 400 ==0
        }else{
            leap = true
        }
    }else{
        leap = false
    }
    println("$year is Leap year : $leap")
}