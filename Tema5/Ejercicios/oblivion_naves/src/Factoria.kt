class Factoria {

    companion object{


        fun generarDron():Nave
        {
            return Nave()
        }

        fun generarGrupoDrones(cantidad: Int):ArrayList<Nave>
        {
            var facNaves = ArrayList<Nave>()

            for(i in 1..cantidad){
                facNaves.add(Nave())
            }
            return  facNaves
        }

        //fun generarTet
        //fun generarPlaneta
        //fun generarCuadrante
        fun generarCuadrante(f: Int, c:Int,tet: Tet):Cuadrante
        {
            return Cuadrante(f,c,tet.devolverDrones())
        }
        //fun generarCuadrantes
        fun generarCuadrantes():Array<Array<Cuadrante>>
        {

            return ar
        }

    }


}