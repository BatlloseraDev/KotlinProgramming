class Superlopez: Monigotes {
    override var tipo:Tipos = Tipos.Principal
    var potenciaHistorial = ArrayList<Int>()
    var vida =500
    var negros = ArrayList<ChupeteNegro>()

    constructor(){}

    fun estaMuerto():Boolean{
        return (vida<=0)
    }
    fun tieneLosSeisChupetes():Boolean{
        return (negros.size == 6)
    }

    fun potencia():Int{
        var potenciaPelea = (1..50).random()
        this.potenciaHistorial.add(potenciaPelea)
        return potenciaPelea
    }
    fun guardarChupete(chu:ChupeteNegro){
        negros.add(chu)
    }
}