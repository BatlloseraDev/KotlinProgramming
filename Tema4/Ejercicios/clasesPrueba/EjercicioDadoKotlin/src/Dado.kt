import kotlin.random.Random

class Dado {
    //var nCaras = 6
    var historial = ArrayList<Int>()


    fun unaTirada(): Int
    {
        var resultado = Random.nextInt(1, nCaras+1)
        historial.add(resultado)
        return resultado
    }
    fun tiradas(n:Int):ArrayList<Int>
    {
        var resultados = ArrayList<Int>()
        for(i in 1..n)
        {
            resultados.add(unaTirada())
        }
        return resultados
    }
    constructor(){

    }


    companion object{
        var nCaras= 6

    }
}