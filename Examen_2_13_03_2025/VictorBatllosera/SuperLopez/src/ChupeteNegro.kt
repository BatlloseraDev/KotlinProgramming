class ChupeteNegro: Chupete {

    var energia:Int

    constructor(orden:Int): super( ColorChupete.Negro, orden){

        this.energia= Constantes.devolverEnergiaRandom()
    }



    fun devolverEnergia():Int
    {
        return energia
    }


    override fun toString(): String {
        return super.toString()+" y tengo energía ${energia}"
    }
}