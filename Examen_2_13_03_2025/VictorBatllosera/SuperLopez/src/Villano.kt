class Villano:Monigote {


    var seniorDeLosChupetes= false
    var chupetes = ArrayList<Chupete>()

    constructor(){
        this.tipoMonigote = TipoMonigote.PersonajeSecundario
    }



    fun buscarChupete(chupeteUnico: ChupeteUnico){

        var nRandom= Constantes.devolverRandomEncontrarChuepete()
        var cAux: Chupete? = null
        if(nRandom<=Constantes.PROB_ENCONTRAR_CHUPETE)
        {
            //encuentra chupete basico
            cAux=chupeteUnico.generarChupete(false)
        }
        else if(nRandom<=Constantes.PROB_ENCONTRAR_CHUPETE_NEGRO)
        {
            //encuenta chupete negro
            cAux = chupeteUnico.generarChupete(true)
            seniorDeLosChupetes=true

        }

        if(cAux!=null) //en caso de que haya encontrado uno
        {
            aniadirChupete(cAux)
        }
    }



    fun aniadirChupete(chupete: Chupete){ //si encuentra uno negro y esta lleno lo guarda igualmente descartando 1 basico

        if(chupetes.size==Constantes.MAX_CHUPETES_VILLANOS && chupete is ChupeteNegro )
        {
            //solo meter chupete negro
            var cAux: Chupete?=null
            var encontrado=false
            for(chupete in chupetes)
            {
                if(chupete !is ChupeteNegro && !encontrado)
                {
                    cAux=chupete //aqui vendría bien la mutable Array List pero por si acaso lo hago asi
                    encontrado=true
                }
            }
            if(cAux!=null)
            {
                chupetes.remove(cAux)
                chupetes.add(chupete)
            }

        }
        else if(chupetes.size<Constantes.MAX_CHUPETES_VILLANOS)
        {
            chupetes.add(chupete)
        }// en cualquier otro caso no lo añade

    }



    fun devolverEnergiaTotal(): Int
    {
        //como no lo especifica si un senior de los chupetes tiene mas de un chupete negro, se suman aunque seguramente si me sobra tiempo lo voy a cambiar a que solo puedan buscar si no son seniores
        var energia = 0
        for(chupete in chupetes){
            if(chupete is ChupeteNegro)
            {
                energia+=chupete.devolverEnergia()
            }
        }
        return energia
    }


    fun quitarChupete(): Chupete?
    {
        var nChupetesNegros = 0
        var cAux: Chupete?=null


        for(chupete in chupetes)
        {
            if(chupete is ChupeteNegro)
            {
                nChupetesNegros++
                cAux= chupete
            }
        }

        if(cAux!=null)
        {
            chupetes.remove(cAux)

        }
        seniorDeLosChupetes=false
        return cAux
    }

    override fun pintarse() {
        println("Soy un señor de los chupetes y tengo lo siguiente. \n\t"+
            chupetes.joinToString("\n\t")
        ) //meter chuepetes
    }


}