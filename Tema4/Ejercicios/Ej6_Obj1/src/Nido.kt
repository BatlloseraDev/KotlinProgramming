import kotlin.random.Random



class Nido {
    var maxSerpientes = 20
    var serpientes = ArrayList<Serpiente>()
    private val MAXKIllS= 4



    fun vivirUnSegundo()
    {
        if(serpientes.isNotEmpty())
        {
            for(s in serpientes)
            {
                s.vivirUnAnio()

            }
            serpientes.removeIf{!it.viva} //me daba error intentar eliminar una serpiente mientras recorria el for.
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
        if(Random.nextDouble(.0,1.0)<=.2)
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
    }

    override fun toString(): String {
        return "Nido: ${serpientes.size} serpientes\n${serpientes.joinToString ( "\n" )}" //de esta forma escribo en una sola linea el codigo
    }

}