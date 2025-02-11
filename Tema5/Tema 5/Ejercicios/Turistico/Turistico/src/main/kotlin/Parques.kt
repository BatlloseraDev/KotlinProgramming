class Parques: LugaresTuristicos {
    var NumeroAtracciones: Int = 0
    var NumeroJuegos: Int = 0

    constructor(n:String, p:Int,v:Int, t: Int, s:Int) : super(n,p,v) {
        NumeroAtracciones = t
        NumeroJuegos = s
    }

    override fun mediaCalidad():Int{
        try{
            return NumeroAtracciones/precio
        }catch (e:Exception){
            return 0
        }
    }

   /* override fun toString(): String {
        return super.toString()+", NumeroAtracciones=$NumeroAtracciones, NumeroJuegos=$NumeroJuegos -- "
    }*/


    override fun toString(): String {
        return super.toString()+", Atracciones=$NumeroAtracciones, Juegos=$NumeroJuegos -- "
    }

}