class Aula{
    var nombreAula = ""
    var curso= ""

    private var ordenadores = ArrayList<Ordenador>()
    companion object
    {
        var cantidadAulas = 0
    }
    constructor()
    {
        cantidadAulas++
    }

    constructor(nombreAula: String, curso: String) {
        this.nombreAula = nombreAula
        this.curso = curso
        cantidadAulas++
    }


    fun addOrdenador(ordenador: Ordenador)
    {
        ordenadores.add(ordenador)
        println("Ordenador con ID ${ordenador.id} añadido correctamente")
        ordenadores.sortBy { it.id }
    }

    fun eliminarOrdenador(id:Int) //por id
    {
        var ordenador = ordenadores.find { it.id==id }
        if(ordenador!=null)
        {
            ordenadores.remove(ordenador)
            println("Ordenador con ID $id eliminado correctamente")//este texto se puede modularizar
        }else
        {
            println("No se encontró el ordenador")// se puede modularizar
        }
    }

    fun imprimirOrdenadores()
    {
        if(ordenadores.isEmpty())
        {
            println("Aun no hay ordenador en el aula")
        }
        else
        {
            println("ordenadores en el aula:")
            ordenadores.forEach{ println(it)}
            println("------------------------")
        }
    }

    override fun toString(): String {
        return "Aula: $nombreAula\nCurso: $curso\nTotal ordenadores: ${ordenadores.size}"
    }
}