

class Cristal: Entidades {

    var id= 0
    var cr_color = Colores.ROJO
    var energia=0
    var origen: CoronaCristal


    constructor(id:Int,origen:CoronaCristal, cr_color: Colores)
    {
        this.id = id
        this.tipo= TipoEntidad.ARTEFACTO
        this.origen = origen
        this.cr_color = cr_color

    }
    constructor(id:Int,origen: CoronaCristal,cr_color: Colores,energia:Int){

        this.id = id
        this.tipo= TipoEntidad.ARTEFACTO
        this.origen = origen
        this.cr_color = cr_color
        this.energia=energia

    }

    fun esPurpura():Boolean
    {
        return cr_color==Colores.PURPURA
    }




}