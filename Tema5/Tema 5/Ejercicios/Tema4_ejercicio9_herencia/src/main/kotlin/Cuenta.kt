open class Cuenta() {
    var titulares = ArrayList<Persona>()
    var numeroCuenta: Int = 0
    private var saldo: Double = 0.0
    open val comision=true

    fun addTitular(p:Persona){
        if (titulares.size <3){
             titulares.add(p)
        }else{
            println("Numero máximo")
        }
    }
    fun borrarTitular(p:Persona){
        if (titulares.size <= 1){
            println("No se puede borrar")
        }else{
            if (titulares.remove(p)){
                println("Borrado con exito")
            }else{
                println("Error borrar")
            }
        }
    }
    fun borrarTitular(dni:Int){
        if (titulares.size <= 1){
            println("No se puede borrar")
        }else{
            for(persona in titulares){
                if (persona.dni ==dni){
                    titulares.remove(persona)
                }
            }
        }
    }

    override fun toString(): String {
        return "Cuenta(titulares=$titulares, numeroCuenta=$numeroCuenta, saldo=$saldo, comision=$comision)"
    }

    open fun ingresarDinero(cantidad:Double){
        if (cantidad > 0) {
            saldo += cantidad
        }
    }
    open fun sacarDinero(cantidad:Double):Boolean{
        var correcto = false
        if (cantidad>0) {
            if ((cantidad <= saldo)) {
                saldo -= cantidad //saldo = saldo -cantidad
                correcto = true
            }
        }
        return correcto
    }
    fun getSaldo():Double{
        return saldo
    }
}