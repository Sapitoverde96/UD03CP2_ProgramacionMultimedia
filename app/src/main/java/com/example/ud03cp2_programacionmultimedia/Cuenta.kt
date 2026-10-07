package com.example.ud03cp2_programacionmultimedia

class Cuenta(private var numeroCuenta: String, private var saldo: Double = 0.0, private var propietario: Persona) {

    init {
        require(saldo >= 0.0) { "El saldo debe ser mayor o igual a 0" }
    }

    fun getNumeroCuenta(): String {
        return this.numeroCuenta
    }
    fun getSaldo(): Double {
        return this.saldo
    }
    fun getPropietario(): Persona {
        return this.propietario
    }

    fun setNumeroCuenta(numeroCuenta: String) {
        this.numeroCuenta = numeroCuenta
    }
    fun setSaldo(saldo: Double) {
        if (saldo > 0.0) {
            this.saldo = saldo
        } else {
            this.saldo = 0.0
        }
    }
    fun setPropietario(propietario: Persona) {
        this.propietario = propietario
    }

    fun transaccion(tipoTransaccion: TipoTransaccion, cantidad: Double) {
        if (cantidad <= 0.0) {
            println("La cantidad debe ser mayor que 0")
            return
        }
        when (tipoTransaccion) {
            TipoTransaccion.REINTEGRO -> {
                if (this.saldo >= cantidad) {
                    this.saldo -= cantidad
                } else {
                    println("No hay suficiente dinero")
                }
            }
            TipoTransaccion.INGRESO -> {
                this.saldo += cantidad
            }
        }
        println("Transacción: $tipoTransaccion, Cantidad: $cantidad, Saldo actual: ${this.saldo}")
    }

    override fun toString(): String {
        return """
            Numero de cuenta: $numeroCuenta
            Saldo: $saldo
            Propietario: ${propietario.getNombre()} ${propietario.getApellido()}
        """.trimIndent()
    }
}