open class Chupete:ChupeteUnico {

    var colorChupete: ColorChupete

    constructor(colorChupete: ColorChupete, orden: Int){
        this.tipoMonigote= TipoMonigote.Objeto
        this.colorChupete = colorChupete
        this.orden= orden
    }


    override fun toString(): String {
        return "Chupete de  id:$orden color $colorChupete"
    }

}