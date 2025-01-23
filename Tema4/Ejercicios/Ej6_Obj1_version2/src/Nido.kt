import kotlin.random.Random

val MAXKIllS= 4

class Nido {
    var maxSerpientes = 20
    var serpientes = ArrayList<Serpiente>()

    fun limpiarSerpientes()
    {
        if(serpientes.isNotEmpty())
        {
            serpientes.removeIf{!it.viva}
        }
    }

    fun addSerpientes(cantidad:Int)
    {
        for(i in 0 until  cantidad)
        {
            if(serpientes.size<maxSerpientes) serpientes.add(Serpiente())
        }
    }

    fun mangostaAtaca()
    {
        var cantidad = Random.nextInt(0,MAXKIllS+1)
        for(i in 0 until cantidad)
        {
            if (serpientes.isNotEmpty())//como no especifica que serpiente es, lo hago de manera aleatoria
            {
                serpientes.removeAt(Random.nextInt(serpientes.size))
            }
        }

    }

    override fun toString(): String {
        return "Nido: ${serpientes.size} serpientes\n${serpientes.joinToString ( "\n" )}" //de esta forma escribo en una sola linea el codigo
    }

}