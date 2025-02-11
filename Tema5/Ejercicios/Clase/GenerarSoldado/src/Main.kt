fun main() {

    var nazi1=Factoria.crearGeneralConEjercito("H",100)
    var Sovietico=General("S")

    var capitanAmerica = Soldado(nazi1,"CA")
   // nazi1.ejercito.add(capitanAmerica)
   // nazi1.aniadirSoldado(capitanAmerica)


    for (i in 1..200)
    {
        var soldado= Soldado(Sovietico,"JUAN${i}")
        Sovietico.aniadirSoldado(soldado);

    }
    //println(Sovietico.dameSoldado()?.miGeneral?.dameSoldado()?.miGeneral?.dameSoldado().toString())

    var g1 = Sovietico.dameSoldado()
    if (g1 != null) {
        g1.miGeneral
    }
}