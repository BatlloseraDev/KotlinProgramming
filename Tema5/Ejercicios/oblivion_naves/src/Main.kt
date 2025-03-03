fun main() {

    var tiempoLimite= 10*60
    var tiempo=0

    var tet = Factoria.generarTet("Tierra",3)



    while(tiempo<=tiempoLimite)
    {
        when
        {
            tiempo%20==0->{
                //println("Tiempo div 20 $tiempo")
                //llamar a los cuadrantes.
                tet.ejecutarOrdenes()

            }
            tiempo%10==0->{
                //println("Tiempo div 10 $tiempo")
                tet.recorrerPlaneta(tiempo)//checkea las naves y genera ordenes de reparacion
                tet.reconocimiento(tiempo)//genera las ordenes de observacion
            }
            tiempo%4==0->{
                //println("Tiempo div 4 $tiempo")
                tet.recorrerCuadrantes();
            }

        }
        tiempo++
    }

   tet.imprimirOrdenes()
   tet.imprimirPlaneta()

    //var tet = Tet()
}