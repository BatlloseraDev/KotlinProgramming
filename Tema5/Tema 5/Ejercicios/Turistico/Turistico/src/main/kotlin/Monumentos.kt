class Monumentos: LugaresTuristicos {
    var Fecha:String = ""
    var Creador:String = ""

    constructor(n:String,p:Int,v:Int, t: String, s:String) : super(n,p,v) {
        Fecha = t
        Creador = s
    }


    override fun mediaCalidad():Int{
        try{
            return precio/valoracion
        }catch (e:Exception){
            return 1
        }
    }

    /*override fun toString(): String {
        return super.toString() + " ,Fecha='$Fecha', Creador='$Creador' -- "
    }*/

    override fun toString(): String {
        return super.toString() + " ,Fecha='$Fecha', Creador='$Creador' -- "
    }

}