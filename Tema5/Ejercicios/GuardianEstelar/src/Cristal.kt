

open class Cristal: Entidades {

    var id= 0
    var cr_color = Colores.ROJO
    var origen: CoronaCristal


    constructor(id:Int,origen:CoronaCristal, cr_color: Colores)
    {
        this.id = id
        this.tipo= TipoEntidad.ARTEFACTO
        this.origen = origen
        this.cr_color = cr_color

    }
/*    constructor(id:Int,origen: CoronaCristal,cr_color: Colores,energia:Int){

        this.id = id
        this.tipo= TipoEntidad.ARTEFACTO
        this.origen = origen
        this.cr_color = cr_color
        this.energia=energia

    }*///puede ser hija pero decidi implementarla en uno ya que no hay gran diferencia

    fun esPurpura():Boolean
    {
        return cr_color==Colores.PURPURA
    }

    override fun toString(): String {
        return "Cristal con id:$id ,color:$cr_color"
    }


}