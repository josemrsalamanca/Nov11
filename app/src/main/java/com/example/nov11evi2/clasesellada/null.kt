package com.example.nov11evi2.clasesellada


fun main(){
    val describir = describeString("")
    println(describir)
}

// con ? se evita el nullpointerexeption

fun describeString(maybeString: String?):
        String {
    if (maybeString != null && maybeString.isNotEmpty()) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}