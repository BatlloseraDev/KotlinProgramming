
class Factoria {

    companion object {

        fun gererarDron(): Dron {
            return Dron()
        }

        fun generarGrupoDones(cantidad: Int): ArrayList<Dron> {
            var almacen = ArrayList<Dron>()
            for (i in 1..cantidad) {
                almacen.add(Dron())
            }
            return almacen
        }

        fun crearCuadrante(fila:Int, columna:Int, tet:Tet):Cuadrante{
            return Cuadrante(fila,columna,tet)
        }

    }

}