fun main(args: Array<String>) {
    val CHUPETESMAXIMOSGUARDAR =5
    val CHUPETESNEGROSMAXIMOS=6
    var unico=ChupeteUnico(100,CHUPETESNEGROSMAXIMOS)
    var sL=Superlopez()

    var villanos=ArrayList<Villano>()


    var ciclos =0
    while (!sL.estaMuerto() && !sL.tieneLosSeisChupetes()){
        if (ciclos%3 == 0){
            if (villanos.size<100) {
                var r = (1..3).random()
                for (i in 0..<r) {
                    var v = Villano(CHUPETESMAXIMOSGUARDAR)
                    villanos.add(v)
                }
            }
        }
        if (!villanos.isEmpty()) {
            for(elVillano  in  villanos) {
                var pro = (1..100).random()
                if (pro < 65) {
                    var negro = (1..100).random()
                    if (pro < 2) {

                        if (ChupeteNegro.chupetesNegrosCreados < CHUPETESNEGROSMAXIMOS) {
                            elVillano.aniadirChupete(unico.crearChupeteNegro())
                            elVillano.señorDelosChupetes = true
                        }
                    } else {
                        elVillano.aniadirChupete(unico.crearChupeteBasico())
                    }
                }
            }
        }
        var cantidad = (villanos.size/2)
        for (i in 0.. cantidad){
            var elVillano = villanos.random()
            if (elVillano.señorDelosChupetes){
                if (sL.potencia() >= elVillano.devolverChupeteNegro().potencia){
                    elVillano.señorDelosChupetes = false
                    sL.guardarChupete(elVillano.devolverChupeteNegro())
                    elVillano.quitarChupeteNegro()
                    println("TENGO UN CHUPETE NEGROOOOOO")
                }else{
                    sL.vida = sL.vida - elVillano.devolverChupeteNegro().potencia
                    println("Me me han quitado vida  ${sL.vida}")
                }
            }else{
                //println(elVillano)
            }

        }
        if(ciclos%10==0){

        }

        ciclos ++
    }


}