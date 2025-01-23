import kotlin.random.Random

class Cuadrante {
    var numero:Int = 0
    var dronesAsignados = ArrayList<Drones>()
    var personalAsignado = ArrayList<Persona>()
    var ordenesAsignadas = ArrayList<Ordenes>()
    var x:Int=0
    var y:Int =0

    constructor(){}
    constructor(x:Int,y:Int,p1:Persona,p2:Persona){
        this.x = x
        this.y = y
        personalAsignado.add(p1)
        personalAsignado.add(p2)
    }
    fun dron(d:Drones){
        d.asignadoX = x
        d.asignadoY = y
        dronesAsignados.add(d)
    }
    fun aniadirOrden(o:Ordenes){
        ordenesAsignadas.add(o)
    }
    fun revisaDrones(){
        for (i in dronesAsignados){
            i.Chequeado()
        }
    }

    fun revisaOrdenes(t:Tet){
        for (i in ordenesAsignadas){
            i.completada = true
            if (i.getDronOrden() ==0){ //tipo reconocimiento
                var j = Random.nextInt(1,2)
                i.setReconocimiento(j)
                //ordenesAsignadas.remove(i)
            }else{ //tipo reparacion
                var en:Drones = Drones()
                for (k in dronesAsignados){
                    if (k.numeroDron == i.getDronOrden()){
                       en=k
                    }
                }
                var j = Random.nextInt(0,100)
                if (j<=50){
                    en.operativo = true
                }else{
                    if (t.puedoAsignarDron()){
                        dronesAsignados.add(t.AsignarDron())
                    }
                }
            }
        }
        ordenesAsignadas.clear()
    }

    override fun toString(): String {
        return "Cuadrante(numero=$numero, dronesAsignados=$dronesAsignados, personalAsignado=$personalAsignado, x=$x, y=$y)"
    }

}