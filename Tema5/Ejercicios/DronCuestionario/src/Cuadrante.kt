
class Cuadrante {

    var mecanico:String="JACK"
    var supervisora:String="VIKA"
    var equipoDrones=ArrayList<Dron>()

    constructor(fila:Int, columna:Int,equipoDrones:ArrayList<Dron>){
        mecanico = "$mecanico$fila$columna"
        supervisora = supervisora+fila+columna
        this.equipoDrones=equipoDrones

    }

    constructor(){}

    constructor(fila:Int, columna:Int,tet:Tet){

        mecanico = "$mecanico$fila$columna"
        supervisora = supervisora+fila+columna
        this.equipoDrones=tet.devolverDrones()

    }

    fun aniadirDron(dron:Dron){
        if (equipoDrones.size < Constantes.CANTIDAD_MAXIMO_DRONES_CUADRANTE){

            equipoDrones.add(dron)
        }

    }



}