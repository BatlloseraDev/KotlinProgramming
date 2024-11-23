class ChupeteNegro: Chupete {
    var potencia=(1..50).random()
    companion object{
        var chupetesNegrosCreados = 0
    }
    constructor(){
        chupetesNegrosCreados ++
    }
}