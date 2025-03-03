class Tet {

    var naves = ArrayList<Nave>()
    var planeta = Planeta()
    var ordenes = ArrayList<Ordenes>()


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

    fun devolverDron():Nave?
    {
        var nave: Nave? = null
        if(naves.size!=0)
        {
            nave= naves.first()
            naves.removeFirst()
        }

        return nave
    }


    fun cambiarPlaneta(p:Planeta)
    {
        this.planeta= p
    }

    fun recorrerCuadrantes()
    {
        planeta.recorrerCuadrantes()
    }

    fun recorrerPlaneta(seg: Int) //genera ordenes.
    {
        /*var datosPlaneta= planeta.devolverNavesEstropeadas()
        if(datosPlaneta.size!=0)
        {
            //aqui trataria de generar la orden pero me he quedado pillado a la hora de pensar como conseguir el dato de fila y columna
            //En vez de devolver un array con naves estropeadas podría devolver un array por nave con la info de la nave mas la fila y columna en la que se hayaba
            //de esta forma tratando esa informacion aqui y separandolá con un trim.
        }*/

        var cuadrantesPlaneta = planeta.devolverCuadrantes()

        for(i in cuadrantesPlaneta.indices)
        {
            for(j in cuadrantesPlaneta.indices)
            {
                var navesEstropeadas= cuadrantesPlaneta[i][j].inspeccionarNaves()
                if(navesEstropeadas.size!=0)
                {
                    for(n in navesEstropeadas)
                    {
                        var orden= Factoria.generarOrdenReparacion("02-05-2077 seg: $seg",i,j,n)
                        ordenes.add(orden)
                        cuadrantesPlaneta[i][j].aniadirOrden(orden)
                    }
                }
            }
        }
    }

    fun reconocimiento(seg: Int)
    {
        var cuadrantesPlaneta = planeta.devolverCuadrantes()
        for(i in cuadrantesPlaneta.indices)
        {
            for(j in cuadrantesPlaneta.indices)
            {
                var n= Constantes.devolverCantidadObservacion()
                for(k in 1..n){
                    var orden= Factoria.generarOrdenReconocimiento("02-05-2077 seg: $seg",i,j)
                    ordenes.add(orden)
                    cuadrantesPlaneta[i][j].aniadirOrden(orden)
                }
            }
        }
    }

    fun ejecutarOrdenes()
    {
        planeta.ejecutarOrdenes(this)
    }


    fun imprimirOrdenes()
    {
        for(orden in ordenes)
        {
            println(orden.mostrarInfo())
        }
    }

    fun imprimirPlaneta()
    {
        println(planeta.imprimirInfo())
    }
    /*
    * Generar naves
    *
    * //ordenes a las naves por lo que le tiene que asignar un cuadrante.
    * */

}