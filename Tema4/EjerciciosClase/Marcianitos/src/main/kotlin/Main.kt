fun main(args: Array<String>) {


    var j1 = Factoria.crearJugador("Angel")
    var j2 = Factoria.crearJugador()

    do{

        //j1.elegirLuchador().pelea(j2.elegirLuchador())
         var m1 = j1.elegirLuchador()
         var m2 = j2.elegirLuchador()
         m1.pelea(m2)
         println(j1)
         println("***********************")
         println(j2)
    }while(j1.seguirJuego() && j2.seguirJuego())



}