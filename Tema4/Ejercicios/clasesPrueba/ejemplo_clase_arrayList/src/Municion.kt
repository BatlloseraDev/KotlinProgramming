class Municion {

    var calibre:Int = 45
    var peso= 13

    constructor(){}
    constructor(calibre: Int, peso: Int) {
        this.calibre = calibre
        this.peso = peso
    }
    fun cantidadDanio():Int
    {
        return(1..10).random()
    }

}