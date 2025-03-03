class Planeta {

    var nombre= ""
    var tamCuadrante= 3;
    var cuadrantes = Array<Array<Cuadrante>>(tamCuadrante){Array<Cuadrante>(tamCuadrante){Cuadrante()} }

    constructor()
    {

    }
    constructor(nombre:String, tamCuadrante:Int)
    {
        this.nombre= nombre
        this.tamCuadrante = tamCuadrante
        this.cuadrantes= Array<Array<Cuadrante>>(tamCuadrante){Array<Cuadrante>(tamCuadrante){Cuadrante()} }
    }

    fun recorrerCuadrantes(){

        for(i in cuadrantes.indices)
        {
            for(j in cuadrantes.indices)
            {
                cuadrantes[i][j].recorrerNaves()
            }
        }
    }

    fun devolverNavesEstropeadas(): ArrayList<Nave>//no lo uso debido a cambios
    {
        var estropeadas= ArrayList<Nave>()
        for(i in cuadrantes.indices)
        {
            for(j in cuadrantes.indices)
            {
                var datosCuadrante=  cuadrantes[i][j].inspeccionarNaves()
                if(datosCuadrante.size!=0)
                {
                    estropeadas.addAll(datosCuadrante)
                }

            }
        }
        return estropeadas
    }

    fun devolverCuadrantes():Array<Array<Cuadrante>>
    {
        return cuadrantes
    }

    fun ejecutarOrdenes(tet: Tet)
    {
        for(i in cuadrantes.indices)
        {
            for(j in cuadrantes.indices)
            {
                cuadrantes[i][j].ejecutarOrdenes(tet)
            }
        }
    }

    fun imprimirInfo():String
    {
        return "Planeta: $nombre,\nTamaño cubo: $tamCuadrante,\n Cuadrante:\n\t${cuadrantes.joinToString("\n\t"){ fila -> fila.joinToString("\t") }}"
    }
    /*override fun toString(): String {
        return "RutaTuristica(nombre=$nombre,\n" +
                "cantidadLugares=${lugaresTuristicos.size}, \n" +
                "Lugares=[\n ${lugaresTuristicos.joinToString ( "\n\t" )}])"
    }*/
}