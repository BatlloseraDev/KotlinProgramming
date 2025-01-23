import kotlin.random.Random

class Soldado {
    var nombre:String =""
    var fuerza:Int = Random.nextInt(0,100)


    constructor(n:String){
        nombre=n
    }

    fun peleaSoldado(s:Soldado):Int{
        var resultado = 0 //0empate, 1 gano, 2 pierdo
        if (fuerza > s.fuerza) resultado = 1
        if (fuerza<s.fuerza) resultado = 2
        return resultado
    }

    override fun toString(): String {
        return "${nombre} --> Fuerza: ${fuerza}"
    }
}