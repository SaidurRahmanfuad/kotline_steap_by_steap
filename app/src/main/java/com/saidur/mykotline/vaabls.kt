package com.saidur.mykotline

fun main()
{
    //variable create var=changable,val=not changable,constant
    var changable="rimon"
    val name="Fuad"
    val age="28"
    val score=25
    changable="masud"
    println("My name is "+changable+" and i'm "+score+" years old")

    //vaiable types
    var designation : String
    var x: Int
    var y:Int
    x=2
    y=5
    var sum = x + y
    designation="Software"
    println(designation+":"+sum)

    //Findin a string in a string
    var data="My name is saidur rahman"
    println(data.indexOf("saidur"))

    //Concat
    var data1="I'm a software engineer"
    println(data1+":"+"ok")
    println(data1.plus(":ok2"))
    println("I'm saidur,$data $data1")

    //if else as an expression
    val a=10
    var result= if(a > 8){
        "Big brother"
    }else{
        "Younger brother"
    }
    println(result)

    //when as an expression
    val z = 6
    var res=when(z){
        1->"Uno"
        2->"Due"
        3->"Tre"
        4->"Quarto"
        5->"Chinque"
        6->"Sei"
        7->"Sette"
        else -> "Nothing"
    }
    println(res)

    //Loops


}