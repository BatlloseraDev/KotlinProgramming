class Tierra {
    var Cuadrantes= ArrayList<Cuadrante>()

    fun aniadirCuadrante(c:Cuadrante){
        Cuadrantes.add(c)
    }

    fun Recorre(){
        for (i in Cuadrantes){
            i.revisaDrones()
        }
    }
    fun ResuelveOrdenes(t:Tet){
        for (i in Cuadrantes){
            i.revisaOrdenes(t)
        }
    }

    fun buscarCuadrante(x:Int,y:Int):Cuadrante{
        var c:Cuadrante=Cuadrante()
        for (i in Cuadrantes){
            if ((i.x == x)and (i.y == y)){
                c=i
            }
        }
        return c
    }
    override fun toString(): String {
        return "Tierra(Cuadrantes=$Cuadrantes)"
    }




}