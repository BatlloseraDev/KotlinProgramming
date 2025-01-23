class CuentaJoven: Cuenta() {
    override var comision=false
    companion object{
        var afortunados: Int = 1000
    }
    init{
        afortunados--
    }
    override fun ingresarDinero(cantidad: Double) {
        var suma = 0.0
        if (cantidad>0) {
            //cantidad = cantidad+ 50
            suma = cantidad + 50
            super.ingresarDinero(suma)
            //super.ingresarDinero(cantidad + 50)
        }
    }

}