class Conjunto {

    var conjunto = ArrayList<Char>()

    companion object
    {

        fun interseccion(a:Conjunto, b:Conjunto):Conjunto
        {
            var resultado=  Conjunto()
            resultado.conjunto.addAll(a.conjunto.intersect(b.conjunto))   //forma 1

            return resultado
        }
        fun union(a: Conjunto, b: Conjunto):Conjunto
        {
            var resultado= Conjunto()
            resultado.conjunto.addAll(a.conjunto.union(b.conjunto))
            return resultado
        }


        fun cardinalidad(c: Conjunto):Int
        {
            return c.conjunto.size
        }
    }

    override fun toString(): String {
       /* var cadenaTexto = ""
        conjunto.forEach{cadenaTexto+="$it, "}
        return cadenaTexto*/
       return conjunto.joinToString (", ","{","}" )
    }


    fun addElemento(elemento : Char)
    {
        if(elemento !in conjunto ) conjunto.add(elemento)
        //else println("Ya existe dicho elemento")
    }
    fun eliminarElemento(elemento: Char)
    {
        var eliminar = conjunto.find { it==elemento }
        if(eliminar!= null)
        {
            println("Eliminando elemento $elemento del Conjunto")
            conjunto.remove(elemento)
        }
        else
        {
            println("No se encontró ningun elemento de tipo $elemento en el conjunto")
        }
    }


}