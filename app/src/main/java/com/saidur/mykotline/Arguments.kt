package com.saidur.mykotline

fun main(){
    //Neg,Pos finder
    val number = listOf<Int>(1,2,3,-2,4,-4,-5,-7)
    var negetive=number.filter { x-> x<0 }
    var positive=number.filter { x->x>0 }
    println(positive)
    println(negetive)

}