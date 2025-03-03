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
        fun generarTet(nombrePlaneta:String,tamanioPlaneta:Int):Tet
        {
            var t= Tet()
            t.cambiarPlaneta(generarPlaneta(nombrePlaneta,tamanioPlaneta,t))
            return t
        }

        //fun generarPlaneta
        fun generarPlaneta(n:String, t:Int,tet: Tet):Planeta
        {
            var p= Planeta(n,t)
            for(i in 0..<t)
            {
                for(j in 0..<t)
                {
                    p.cuadrantes[i][j]= generarCuadrante(i,j,tet)
                }
            }
            return p
        }

        //fun generarCuadrante
        fun generarCuadrante(f: Int, c:Int,tet: Tet):Cuadrante
        {
            return Cuadrante(f,c,tet.devolverDrones())
        }
        //fun generarCuadrantes
        /*fun generarCuadrantes():Array<Array<Cuadrante>>
        {

            return ar
        }*/
        //fun generar orden
        fun generarOrdenReparacion(fecha: String,fil:Int,Col:Int,dron:Nave ):Reparacion
        {
            return Reparacion(fecha,fil, Col,dron )
        }


        fun generarOrdenReconocimiento(fecha: String,fil:Int,Col:Int):Reconocimiento
        {
            return Reconocimiento(fecha,fil,Col)
        }

    }


}