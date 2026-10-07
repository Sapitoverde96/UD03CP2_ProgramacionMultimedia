package com.example.ud03cp2_programacionmultimedia

class Persona(private var nombre: String, private var apellido: String, private var telefono: Int) {
    constructor() : this("Nombre", "Apellido", 0)

    init {
        require(validarTelefono(this.telefono)) { "El teléfono debe tener 9 dígitos" }
    }

    fun getNombre(): String {
        return this.nombre
    }
    fun getApellido(): String {
        return this.apellido
    }

    fun validarTelefono(telefono: Int): Boolean {
        val telefonoString = telefono.toString()
        if (!telefonoString.matches(Regex("[0-9]{9}"))) {
            return false
        } else {
            this.telefono = telefono
            return true
        }
    }

    override fun toString(): String {
        return "Nombre: ${this.nombre} ${this.apellido}, Tel: +34 ${this.telefono}"
    }
}