open class GalletaBase {
    var sabor: Sabor = Sabor()
    var peso=0
    var ingredientes = ArrayList<ElementoElaboracion>()

    constructor()
    {
        numeroGalletas++
    }
    constructor(sabor: Sabor, peso:Int, ingredientes:ArrayList<ElementoElaboracion>)
    {
        this.sabor= sabor
        this.peso = peso
        this.ingredientes=ingredientes
        numeroGalletas++
    }


    companion object{
        var numeroGalletas= 0
    }

    fun addIngrediente(e: ElementoElaboracion)
    {
        ingredientes.add(e)
    }

    override fun toString(): String {
        return "Esta galleta es una galleta base \n\tSabor: $sabor\n\tPeso: $peso\n\t\t"+
                ingredientes.mapIndexed{index, elementoElaboracion -> "${index +1}. $elementoElaboracion" }.joinToString( "\n\t\t" )
    }
}