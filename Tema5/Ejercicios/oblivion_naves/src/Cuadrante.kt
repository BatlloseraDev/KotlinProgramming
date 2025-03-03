import kotlin.random.Random


class Cuadrante {

    var fila=0
    var columna=0
    var supervisor= "VIKA"
    var mecanico="JACK"
    var naves = ArrayList<Nave>()

    var ordenes = ArrayList<Ordenes>()

    constructor(){

    }

    constructor(fila:Int, columna:Int,naves:ArrayList<Nave>)
    {
        this.fila=fila
        this.columna=columna
        mecanico= mecanico+fila+columna;
        supervisor= supervisor+fila+columna;
        this.naves= naves
    }


    fun aniadirDron(dron:Nave){
        if(naves.size<Constantes.MAXNAVESCUADRANTE)
        {
            naves.add(dron)
        }
    }

    fun recorrerNaves()
    {
        for(i in naves.indices)
        {
            if(Random.nextFloat()<=Constantes.PORCENTAJEROTURA)
            {
                naves[i].cambiarEstado(false);
            }
        }
    }

    fun inspeccionarNaves():ArrayList<Nave> //devuelve las naves estropeadas en el cuadrante
    {
        var n= ArrayList<Nave>()
        for(i in naves.indices)
        {
            if(!naves[i].operativo)
            {
                n.add(naves[i])
            }
        }
        return n
    }
    fun aniadirOrden(orden:Ordenes)
    {
        ordenes.add(orden)
    }

    fun ejecutarOrdenes(tet: Tet)
    {
        for(orden in ordenes.filter { !it.completada })
        {
            when(orden)
            {
                is Reparacion->{
                    //coger dron, hacer un 50%
                    //si no llamo a tet y cambio dron.
                    if(Constantes.devolverReparacionNave())
                    {
                        for(i in naves)
                        {
                            if(i.id == orden.dron.id)
                            {
                                i.cambiarEstado(true)
                            }
                        }
                    }
                    else
                    {
                        naves.remove(orden.dron)
                        var nuevaNave=tet.devolverDron()
                        if( nuevaNave!= null)
                        {
                            naves.add(nuevaNave)
                        }
                    }
                    orden.completada=true
                }
                is Reconocimiento->{
                    orden.cambiarEncontrado(Constantes.devolverAllazgo())
                    orden.completada=true
                }
            }
        }
    }

    override fun toString(): String {
        return "\n\tCuadrante: $fila$columna \n\tSupervisor: $supervisor\n\tMecanico: $mecanico\n\t" +
                "naves:\n\t\t${naves.joinToString("\n\t\t") }"
    }
    //fun de crear  nombre
}