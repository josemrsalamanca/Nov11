package com.example.nov11evi2

open class Persona(nombre:String, edad:Int) {
    open fun trabajar(){
        println("Esta trabajando")
    }
}

// dentro de los parametros se agrega lenguaje, eso es una EXTENSION DEL COMPORTAMIENTO
class Programador(nombre: String, edad: Int,lenguaje:String) : Persona(nombre, edad) {
    override fun trabajar() {
        super.trabajar()
        println("Programando")       //sobreescritura en herencia
    }
}

class Diseñador(nombre: String, edad: Int) : Persona(nombre, edad){
    override fun trabajar() {
        super.trabajar()
    }
}

//EXTENSION DEL COMPORTAMIENTO REFLEJA, AHORA RECIBE UN NUEVO PARAMETRO LENGUAJE
fun main(){
    val programador = Programador("jose",29,"kotlin")
    programador.trabajar()
    val diseñador = Diseñador("miguel",25)
    diseñador.trabajar()

}
