import kotlin.random.Random


class Mosca {

    var posicion = IntArray(2){0}
    var vida= 3
    //tipo mosca
    constructor( ){}


    fun MoveMosca(tamanio: Int): IntArray
    {
        posicion[0] = Random.nextInt(0,tamanio)
        posicion[1] = Random.nextInt(0,tamanio)

        return posicion;
    }

    fun perderVida()
    {
        vida--
    }

}