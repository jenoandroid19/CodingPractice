package com.jeno.codingpractice.samplecoding


fun isLeapYear(year: Int) : Boolean{
    return ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0)
}

fun main(){
    val year = 2028
    if (isLeapYear(year)){
        println("$year is Leap year")
    }else{
        println("$year is not Leap year")
    }

}