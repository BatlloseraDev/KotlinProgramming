class Villano: Monigotes {
    var chupetes =ArrayList<Chupete>()
    var señorDelosChupetes = false
    var chupetesGuardar=0

    constructor(chupetesGuardar:Int){
        this.chupetesGuardar = chupetesGuardar
    }

    fun aniadirChupete(c:Chupete){
        if (c is ChupeteNegro){
            chupetes.add(c)
        }else {
            if (chupetes.size < chupetesGuardar) {
                chupetes.add(c)
            }
        }
    }

    fun devolverChupeteNegro(): ChupeteNegro {
        var n = chupetes.filterIsInstance<ChupeteNegro>()
        return n[0]
    }

    fun quitarChupeteNegro(){
        var posicion=0
        var contar=0
        for (i in chupetes){
            if (i is ChupeteNegro){
                posicion = contar
            }
            contar++
        }
        chupetes.removeAt(posicion)
    }
    override fun pintarse(){
        println("Los chupetes que tengo son ${chupetes.size}")
    }
    override fun toString(): String {
        return "Los chupetes que tengo son ${chupetes.size}"
    }

}