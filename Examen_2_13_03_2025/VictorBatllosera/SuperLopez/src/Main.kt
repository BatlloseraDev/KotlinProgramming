fun main() {


    var villanos= ArrayList<Villano>()
    var superLopez = Factoria.generarSuperLopez()
    var chupeteUnico = Factoria.generarChupeteUnico()
    var juego= true


    while(juego)
    {

        //generacion

        if(villanos.size<Constantes.MAX_VILLANOS)
        {
            var nVillanos = Constantes.devolverNumVillanos()

            if(nVillanos+villanos.size>Constantes.MAX_VILLANOS) //me aseguro que no se creen mas de el maximo
            {
                nVillanos=Constantes.MAX_VILLANOS-villanos.size
            }
            for(i in 1..nVillanos)
            {
                villanos.add(Factoria.generarVillano())
            }

        }
        //busqueda de los villanos

        for(villano in villanos)
        {
            villano.buscarChupete(chupeteUnico)

        }

        //Pinto seniores de los chupetes

        for(villano in villanos)
        {
            if(villano.seniorDeLosChupetes && villano.devolverEnergiaTotal()==0)
            {
               //villano.seniorDeLosChupetes= false // lo se he "matado una mosca a base de cañonazos"
            }


            if(villano.seniorDeLosChupetes){

                villano.pintarse()
            }


        }

        //busquedas de super Lopez
        var vAux: Villano? =   superLopez.revisarVillanos(villanos)


        //enfrentamiento
        if(vAux!= null)
        {
            println("Super López encontró un villano")
            vAux = villanos[villanos.indexOf(vAux)]

            var energiaVillano = vAux.devolverEnergiaTotal()
            var energiaSL = superLopez.devolverEnergia()



            println("Super López generó $energiaSL de energía y el villano tenia $energiaVillano de energía")
            if(energiaSL>=energiaVillano)
            {
                //le quita el chupete
                println("Super López ganó y le quitó el juguete")

                var cAux = vAux.quitarChupete()
                if(cAux!=null)//no debería de darse el caso pero por si acaso
                {
                    superLopez.aniadirChupete(cAux)
                }
                else{
                    println("Hubo un error quitando el chupete")

                }
                if(vAux.seniorDeLosChupetes && vAux.devolverEnergiaTotal()==0)
                {
                    println("Hola")
                }
            }
            else{
                superLopez.restarVida(energiaVillano)
                println("Super López perdió quedando a ${superLopez.vida} de vida")
            }
        }


        //checks fin juego
        if(!superLopez.estaVivo() || superLopez.tieneSeisChupetes())
        {
            juego=false
        }



    }

    if(!superLopez.estaVivo())
    {
        println("Super López perdió esta vez")
    }
    else if(superLopez.tieneSeisChupetes())
    {
        println("Super López consiguió arrebatar los 6 chupetes")
    }


}