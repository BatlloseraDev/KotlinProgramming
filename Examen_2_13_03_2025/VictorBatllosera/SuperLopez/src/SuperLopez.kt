class SuperLopez: Monigote {

    var chupetes = ArrayList<Chupete>()//solo guardará los chupetes negros que consiga
    var vida = 500

    constructor(){

    }



    fun revisarVillanos(aVillano: ArrayList<Villano>): Villano?//revisa los villanoss y si encuentra uno senior lo ataca
    {
        var senior: Villano? = null
        var nBusquedaMin: Int = aVillano.size/2
        var n = 0
        while ((n<nBusquedaMin && senior!=null) || (n<aVillano.size && senior==null))
        {
            // me aseguro de buscar al menos el 50 porciento pero como no especifica nada mas  sigo buscando hasta encontrar uno si
            //una vez buscado  no he encontrado nada me salgo
            if(aVillano[n].seniorDeLosChupetes)
            {
                senior= aVillano[n]
            }

            n++
        }

        return senior

    }

    fun devolverEnergia():Int
    {
        return Constantes.devolverEnergiaRandom()
    }


    fun aniadirChupete(chupete: Chupete){
        chupetes.add(chupete)
    }

    fun tieneSeisChupetes():Boolean
    {
        return chupetes.size==6
    }


    fun estaVivo():Boolean
    {
        return vida>0
    }

    fun restarVida(n:Int)
    {
        vida-=n
    }

}