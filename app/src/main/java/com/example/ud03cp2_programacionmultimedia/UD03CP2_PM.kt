package com.example.ud03cp2_programacionmultimedia

fun main() {
    val persona01 = Persona("Fulanito", "Navarro", 611457823)
    val persona02 = Persona("Fulanita", "Navarra", 611567983)
    // val persona03 = Persona("Fulanita", "Navarra", 0) // <-- Quita el comentario para ver el error.
    println(persona01)
    println(persona02)

    println()

    val cuenta01 = Cuenta("123456789", 1000.0, persona01)
    val cuenta02 = Cuenta("987654321", 2000.0, persona02)
    // val cuenta03 = Cuenta("987654321", -2000.0, persona02) // <-- Quita el comentario para ver el error.
    println("$cuenta01\n")
    println("$cuenta02\n")

    cuenta01.transaccion(TipoTransaccion.REINTEGRO, 500.0)
    println("$cuenta01\n")

    cuenta02.transaccion(TipoTransaccion.INGRESO, 1000.0)
    println("$cuenta02\n")
}