
class Tet {
    var almacen = ArrayList<Dron>()

    constructor(){

        almacen = Factoria.generarGrupoDones(Constantes.CANTIDADDRONESTET)
    }

    fun devolverDrones():ArrayList<Dron>{
        var auxiliar = ArrayList<Dron>()
        var cantidad = Constantes.devolverCantidadDrones()

        //if (almacen.isNotEmpty()) {
        for (i in 1..cantidad) {

            if (almacen.isNotEmpty()) {

                auxiliar.add(almacen.first)
                almacen.removeFirst()

            }

        }
        //}
        return auxiliar
    }

}