import kotlin.enums.enumEntries

class Coche {
    var numRuedas: Int
    var vMax: Int
    var matricula: String
    constructor()
    {
        numRuedas= 0
        vMax= 0
        matricula="0"
    }
    constructor(numRuedas: Int, vMax:Int, matricula:String)
    {
        this.numRuedas = numRuedas
        this.vMax= vMax
        this.matricula = matricula
    }

}