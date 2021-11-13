package com.example.nov11evi2

import java.util.concurrent.ConcurrentNavigableMap

// Las clases se definen por: palabra reservada class + () + parametros dentro de () + {el cuerpo}
//Ejemplo
class contacto(var nombre:String, val mail:String){
}

fun main(){
    val Contacto = contacto("jose","josemrsalamanca@gmail.com")
    println(Contacto.mail)
    Contacto.nombre = "holaaaa"
    println(Contacto.nombre)
}



