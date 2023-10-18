package com.saidur.mykotline

fun main() {
//object create
    var obj=User()
    obj.age=30
    obj.salary=1500.00
    obj.name="Saidur Rahman"

    var obj2=User()
    obj2.name="Leon"
    obj2.salary=300.00
    obj2.age=22
    println(obj2.salary)


    var user=User("Saidur",22,true,1300.00)
    var user2=User("Leon",18,true,200.00)

 /*   var list= arrayListOf<User>()
    list.add(user)
    list.add(user2)
    println("datas : $list")*/

    //Call parameterized class
    var std=Student("Fuad",3.35,"pass")
    //println(std.name)

var std_fun=Student_with_fun("Fuad",3.35,"pass")
    std_fun.result(3.27)

}
//Class
class User {
    var name = ""
    var age = 0
    var isActive = false
    var salary = 0.00
    constructor()
    //constructor
    constructor(name: String, age: Int, isActive: Boolean, salary: Double) {
        this.name = name
        this.age = age
        this.isActive = isActive
        this.salary = salary
    }


}
class Student(var name:String,var point:Double,var result:String)
class Student_with_fun(var name:String,var point:Double,var result:String)
{
    fun greet(){
        println("Great!! $name you pass")
    }
    fun greet_bad(data:Double){
        println("Shame!! $name you loose,you've got $data")
    }
    fun result(point:Double){
        if(point>3.00)
        {
            greet()
        }else{
            greet_bad(point)
        }

    }
}
