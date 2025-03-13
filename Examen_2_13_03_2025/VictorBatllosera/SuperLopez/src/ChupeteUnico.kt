open class ChupeteUnico: Monigote {

    var orden: Int =1 //siempre es el numero 1
    private var chupetes = ArrayList<Chupete>() //todos los chupetes que se generen se guardan aqui
    private var nChupeteNegros = 0

    constructor(){
        this.tipoMonigote=TipoMonigote.Objeto

    }
    //generar chupetes


    fun generarChupete(cNegro:Boolean):Chupete
    {
        var cAux:Chupete
        //podría hacerlo con when pero me siento mas seguro haciendolo asi
        if(cNegro&& nChupeteNegros<Constantes.MAX_CHUPETES_NEGROS)
        {
            //crear chupete negro
            cAux=Factoria.generarChupeteNegro(orden+chupetes.size+1)//+1 porque no inicializo el array con el chupete unico
            nChupeteNegros++
        }
        else{
            //crear chupete basico
            cAux= Factoria.generarChupeteBasico(orden+chupetes.size+1)
        }
        chupetes.add(cAux)
        return cAux
    }

    //funcion buscar chupetes


    fun localizarChupetesNegros(): ArrayList<Chupete>
    {
        var chupetesAux = ArrayList<Chupete>()
        for(chupete in chupetes)
        {
            if(chupete is ChupeteNegro)
            {
                chupetesAux.add(chupete)
            }

        }
        return chupetesAux
    }


    fun localizarNChupetesBasicos(n: Int):ArrayList<Chupete>
    {
        var chupetesAux = ArrayList<Chupete>()
        var i = 0
        var nAux =0
        while(i<chupetes.size &&  nAux<n) // por si se recorre todo el array y no se han encontrado todos los deseados que no siga buscando
        {
            if(chupetes[i] !is ChupeteNegro )
            {
                chupetesAux.add(chupetes[i])
                nAux++
            }
            i++

        }
        return chupetesAux
    }
}