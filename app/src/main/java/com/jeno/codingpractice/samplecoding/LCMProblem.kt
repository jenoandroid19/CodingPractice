package com.jeno.codingpractice.samplecoding

class LCMProblem {
}

fun main(args : Array<String>){
    var n1 = 170
    var n2 = 140
    var lcm = if (n1 > n2) n1 else n2

    while (true){
        println(lcm)
        if (lcm % n1 == 0 && lcm % n2 == 0){
            println("LCM is $lcm")
            break
        }
        lcm++
    }
}