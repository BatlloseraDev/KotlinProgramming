class Tet {

    var naves = ArrayList<Nave>()
    var planeta = Planeta()

    constructor(){

        naves= Factoria.generarGrupoDrones(Constantes.CANTIDADDRONESTET)

    }

    fun devolverDrones():ArrayList<Nave>{
        var ar= ArrayList<Nave>()
        var cantidad = Constantes.devolverCantidadDrones()


        for(i in 1..cantidad)
        {
            if(naves.isNotEmpty()){
                ar.add(naves.first())
                naves.removeFirst()
            }
        }
        return  ar
    }


    /*
    * Generar naves
    *
    * //ordenes a las naves por lo que le tiene que asignar un cuadrante.
    * */

}