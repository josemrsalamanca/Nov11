package com.example.nov11evi2.clasesellada

class Mutable<E>(private vararg val items:E){
    fun randomObject():E{
        return items.random()
    }
}

fun main(){
    val mutableInt: Mutable<Int>
    mutableInt = Mutable(1,2,3,4,5)

    var randomInt =mutableInt.randomObject()
    println(randomInt)
}