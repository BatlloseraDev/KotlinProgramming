import kotlin.random.Random

fun main() {

    var listaDados = ArrayList<Dado>()

    for(i in 1..6) //creo 6 dados
    {
        listaDados.add(Dado())
    }

    for(i in 0 until listaDados.size)
    {
        listaDados[i].unaTirada()
    }

    Dado.nCaras=20
    listaDados[Random.nextInt(listaDados.size)].tiradas(5)


    for(i in 0 until listaDados.size)
    {
        println("Para el dado: ${i+1}:")
        for(j in 0 until listaDados[i].historial.size)
        {
            println("\t-En la tirada:${j+1} ha sacado ${listaDados[i].historial[j]} ")
        }
    }


}