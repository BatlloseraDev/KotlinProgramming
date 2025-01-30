class GalletaRellenaEspecial: GalletaRellena {
    var saboresEspecial= ArrayList<Sabor>()
    var animal= false

    companion object
    {
        var numeroGalletaRellenaEspecial= 0
    }


    constructor( animal: Boolean,saboresEspecial: ArrayList<Sabor>)
    {
        this.animal = animal
        this.saboresEspecial = saboresEspecial

        numeroGalletaRellenaEspecial++
    }
    constructor()
    {

        numeroGalletaRellenaEspecial++
    }

    fun cambiarConsumoAnimal(t: Boolean)
    {
        animal=t
    }

    fun addSaboresEsp(s:Sabor)
    {
        saboresEspecial.add(s)
    }

}