//Aqui lo que hago es representar una estructura de datos llamada grafo (no sabia que existia esto en kotlin)
//Esta clase almacena vertices, que es el nombre de los vertices existentes
//Aristas que son las conexiones que tienen cada vertice.

data class Grafo(val vertices: List<String>, val aristas: Map<String, List<String>>)

fun main() {

    // podria introducir uno por teclado pero dejo este como ejemplo.

    val vertices = listOf("a","b","c","d","e") //declaro todos los vertices que tenemos en nuestra geometria.

    var aristas = mapOf(
        "a" to listOf("b","c","e"),
        "b" to listOf("a","d","e"),
        "c" to listOf("a","d","e"),
        "d" to listOf("b","c","e"),
        "e" to listOf("a","b","c","d")
    )//declaro todas las conexiones que tiene cada vertice
    //es decir para el valor a, esta relacionado con b , c y e

    /*Esto lo he hecho con lo que he ido buscando y aprendiendo pero pensandolo
* despues de haberlo terminado asi creo que se puede hacer con matrices cuadradas
* es decir, cada fila y columna es un vector y 0 si estan conectadas o es la misma o 1 si si estan conectadas
* para este caso seria algo así
* [0,1,1,0,1
*  1,0,0,1,1
*  1,0,0,1,1
*  0,1,1,0,1
*  1,1,1,1,0]
*
* Lo voy a volver a intentar a hacer con matrices
* */

    val grafo = Grafo(vertices,aristas) // aqui genero el grafo


    if(esHamiltoniano(grafo)) // y con solo llamarlo aqui se hace,
    {
        println("El grafo contiene un ciclo hamiltoniano")
    }
    else
    {
        println("El grafo no contiene un cico hamiltoniano")
    }

}


//esta clase tiene que devolver que si el grafo que le hemos pasado es hamiltoniano o no
fun esHamiltoniano(grafo:Grafo):Boolean
{
    val VISITADOS = mutableSetOf<String>()
    //Un conjunto mutable sirve para almacenar datos y editarlos (se parecen a las listas, esto es apunte mio)
    val CAMINO = mutableListOf<String>()

    //Aqui he generado dos varialbes, una para guardar los datos (vertices) que he visitado y otra para saber el camino que llevo recorrido.


    //No sabia que se podia generar una funcion dentro de otra función, esto lo he aprendido buscando en internet
    //Y chat gpt para una explicación mas detallada a mis dudas.
    fun backtrack(vertice:String):Boolean
    {
        var completo=false//me servira mas adelante
        var devolver = false
        CAMINO.add(vertice) //añado el actual vertice a camino para registrar el camino que voy a ir siguiendo
        VISITADOS.add(vertice) //y marco ademas el vertice como que ya esta visitado.

        //con esto empiezo a recorrer los posibles caminos

        if(CAMINO.size == grafo.vertices.size)//compruebo si ya he llegado al final
        {
            completo= grafo.aristas[vertice]?.contains(CAMINO[0])== true
            //compruebo si el ultimo vertice en el que estoy uno de sus vecinos es el primer vertice que recorri
        }
        if(completo) // si ya esta completo no hace falta que siga comprobando
        {
            devolver=true
        }
        else // en el caso que no sea así que siga comprobando
        {
            for(vecino in grafo.aristas[vertice] ?: emptyList()) // recorre todos los vecinos del vertice y la lista no esta vacia.
            {
                if(vecino !in VISITADOS)//si vecino no ha sido visitado compruebo de forma recursiva si forma un ciclo
                {
                    if(backtrack(vecino))//si devuelve true es que encontró camino en la siguiente iteracion del vecino
                    {
                        devolver= true // por ende devuelvo true esta iteracion
                    }
                }
            }

            //si he llegado aqui y devolver sigue siendo false retrocedo, por lo que me permite probar otros caminos
            if(!devolver)
            {
                VISITADOS.remove(vertice)//borro el vertice actual de los visitados para volver atras
                CAMINO.removeAt(CAMINO.size -1) //borro el vertice actual que es el ultimo que he guardado

                //si llego aqui lo que se devuelve al final es false.
            }

        }

        return devolver
    }

    return grafo.vertices.any(){ vertice->
        VISITADOS.clear()
        CAMINO.clear()
        backtrack(vertice)
    }
    // es una funcion que no he terminado de entender del todos
    // Devuelvo para cualquier intento de la lista de vertices si cualquiera de ellos da positivo entonces hay ciclo
    //si en el caso que todos de false entonces es que habiendo intentado todos los intentos
    //para cada iteraccion se resetean los mutables.

}