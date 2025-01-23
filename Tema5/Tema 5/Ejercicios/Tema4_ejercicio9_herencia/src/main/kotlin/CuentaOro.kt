class CuentaOro: Cuenta() {
    var esCuentaOro = true
    override fun sacarDinero(cantidad:Double):Boolean{
       var correcto = false
        correcto = super.sacarDinero(cantidad)
        requisitos()
        return correcto
    }
    fun requisitos(){
        if (getSaldo() < 1000){
            esCuentaOro = false
        }else{
            esCuentaOro = true
        }
    }

}