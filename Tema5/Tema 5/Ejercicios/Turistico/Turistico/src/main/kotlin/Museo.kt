class Museo: LugaresTuristicos {
    var tematica:String = ""
    var salas:Int = 0

    constructor(n:String,p:Int,v:Int, t: String, s:Int) : super(n,p,v) {
        tematica = t
        salas = s
    }

    override fun mediaCalidad():Int{
        try{
            return precio/salas
        }catch (e:Exception){
            return 0
        }
    }

   /* override fun toString(): String {
        return super.toString() + " ,tematica='$tematica', salas=$salas -- "
    }*/

    override fun toString(): String {
        return super.toString() + " ,tematica='$tematica', salas=$salas -- "
    }

}