import kotlin.random.Random

class Tet {
    var cantidadDrones:Int =100
    var dronesAsignados:Int = -1
    var almacenDrones = ArrayList<Drones>()
    var almacenOrdenes = ArrayList<Ordenes>()

    fun aniadirDron(i:Drones){
        almacenDrones.add(i)
    }

    fun AlmacenNoCompleto():Boolean{
        return almacenDrones.size <100
    }

    fun puedoAsignarDron():Boolean{
        return dronesAsignados != 100
    }
    fun AsignarDron():Drones{
        dronesAsignados++
        return almacenDrones.get(dronesAsignados)

    }
    fun cursarOrdenesReparacion(t:Tierra){
        for (i in almacenDrones){
            if (!i.operativo){
                var orden  = Ordenes(i.asignadoX,i.asignadoY,i.numeroDron,1)
                almacenOrdenes.add(orden)
                var c = t.buscarCuadrante(i.asignadoX,i.asignadoY)
                c.aniadirOrden(orden)
            }
        }
    }
    fun cursarOrdenesObservacion(t:Tierra){
        var i = Random.nextInt(1,2)
        var x= Random.nextInt(1,3)
        var y= Random.nextInt(1,3)
        for (j in 0..i ){
            var orden = Ordenes(x,y,i)
            almacenOrdenes.add(orden)
            var c = t.buscarCuadrante(x,y)
            c.aniadirOrden(orden)
        }
    }

    override fun toString(): String {
        return "Tet(cantidadDrones=$cantidadDrones, dronesAsignados=$dronesAsignados, almacenDrones=$almacenDrones, almacenOrdenes=$almacenOrdenes)"
    }


}