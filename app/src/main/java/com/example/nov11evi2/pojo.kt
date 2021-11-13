package com.example.nov11evi2

fun main(){
    //Basta añadir DATA para obtener get/set en kotlin
    data class Persona(val nombre: String, val rut: String, val edad: Int){
    }

    //Aca se asignan paramtros de la variable Persona
    val persona = Persona("Juan","111111-1",100)
    //Aca se consigue el nombre
    println("Nombre Persona= ${persona.nombre}")
}

