open class Entidades {

    var tipo = TipoEntidad.PERSONAJE_SECUNDARIO


    open fun representarse():String
    {
        return "Hola soy $tipo"
    }

}