package com.saidur.mykotline

fun main() {
    //while loop
    var i = 0
    var j = 0

    while (5 > i) {
        println(i)
        i++
    }
    //do while
    do {
        println(j)
        j++
    } while (5 > j)

    //for loop
    //data set
    var stringdata = arrayOf("ddd", "sfa", "moa")
    var intdata = intArrayOf(5,9,8)
    for (k in stringdata) {
        println(k)
    }
    for (k in intdata) {
        println(k)
    }
}
