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
    //for loop with range
    for(k in 5..7){
        println(k)
    }

    //Functions
    addition(2,6)
    addition_with_return(12,10)
    println("value return ${addition_shortReturn(40,14)}")
    println("value returnShort ${addition_shortest_return(121,35)}")
}

//void functions
fun addition(num :Int,num2:Int){
    println(num+num2)
}
fun addition_with_return(num :Int,num2:Int){
    return println("Total ${num.plus(num2)}")
}
fun addition_shortReturn(num:Int,num2: Int):Int
{
    return num+num2
}
fun addition_shortest_return(num: Int,num2: Int)=num+num2