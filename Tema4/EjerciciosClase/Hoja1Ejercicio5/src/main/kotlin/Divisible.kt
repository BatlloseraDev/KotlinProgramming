class Divisible {
    var divisor: Int = 0
    var texto: String = ""
    //var limiteSuperior: Int=0
    //var limiteInferior: Int=0

    constructor(divisor:Int,texto:String){
        this.divisor = divisor
        this.texto = texto
       // this.limiteSuperior = limiteSuperior
       // this.limiteInferior = limiteInferior
    }

    fun esDivisible(numero:Int):Boolean{
        return (numero%divisor == 0)
    }

}