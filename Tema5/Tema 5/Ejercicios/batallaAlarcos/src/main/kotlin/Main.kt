/*
Tenemos 2 ejercitos:
Jefe del ejercito Cristiano —> Alfonso X —> 10 soldados
Jefe del ejercito Islámico —> Yusuf —> 10 soldados

Cada soldado tiene un nombre y una fuerza del 1 al 100.El programa principal simulara la batalla de Alarcos,
acaba cuando no haya soldados.
Se coge un guerrero aleatorio de cada uno de los bandos y el que tenga mayor fuerza gana,
uno muere y el otro sigue vivo (opción dificil: ponerle vida a los soldados y cuando llegue a 0 muere)

Cada vez que haya una batalla los jefes van a mantener una conversación, en la que diran cuantos soldados les queda,
cuando termine el programa dira quien es el ganador y que haga una lista en el orden que han ido muriendo
Podemos crear una lista con los nombres
 */


fun main(args: Array<String>) {
    var cristiano = Ejercito("Alfonso")
    var arabe = Ejercito("Yusuf")
    var cementerio = Ataud()

    cristiano.crearBatallon(10,"Cristiano")
    arabe.crearBatallon(10, "Arabe")

    while (cristiano.quedanVivos() && arabe.quedanVivos()){
        var soldadoCristiano= cristiano.soldadoParaPelear()
        var soldadoArabe= arabe.soldadoParaPelear()
        println("_________Guerreros Combaten_________")
        println(soldadoCristiano)
        println(soldadoArabe)
        when (soldadoCristiano.peleaSoldado(soldadoArabe)){
            0 -> {
                println("Empate en la pelea. Mueren todos.")
                arabe.morirSoldado(soldadoArabe)
                cristiano.morirSoldado(soldadoCristiano)
                cementerio.soldadoMuerto(soldadoArabe)
                cementerio.soldadoMuerto(soldadoCristiano)

            }
            1 ->{
                println("          COMPEÓN BATALLA:"+ soldadoCristiano)
                arabe.morirSoldado(soldadoArabe)
                cementerio.soldadoMuerto(soldadoArabe)

            }
            2 ->{
                println("          COMPEÓN BATALLA:"+ soldadoArabe)
                cristiano.morirSoldado(soldadoCristiano)
                cementerio.soldadoMuerto(soldadoCristiano)

            }
        }
        println("${cristiano.jefe}. Me quedan ${cristiano.cantidadSoldados()}")
        println("${arabe.jefe}. Me quedan ${arabe.cantidadSoldados()}")

    }
    cementerio.listarMuertos()
}