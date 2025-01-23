class Tributo {
    var vida = 0
    var fuerza=0
    var distrito = 0
    companion object{
        var vivos=0

        fun quedaMasDeUno(): Boolean{
            return vivos > 1
        }
    }
    constructor(distrito:Int){
        vivos ++
        this.distrito = distrito
    }

    fun muerto(){
        vivos--
    }
}