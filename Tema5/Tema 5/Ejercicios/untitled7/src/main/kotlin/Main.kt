fun main(args: Array<String>) {
    var listaGatos = ArrayList<Gato> ()

    var g1 = Gato()

    g1.nombre = "Garfiel"

    listaGatos.add(g1)


    println("Soy la variable g1 y apunto al objeto --->" + g1.toString())

    println("Soy la lista listaGatos[0] y apunto al objeto --->" + listaGatos[0].toString())

    listaGatos.add(g1)

    println("Soy la lista listaGatos[1] y apunto al objeto --->" + listaGatos[1].toString())

    g1 = Gato()

    println("Soy la variable g1 y apunto al objeto --->" +g1)
    println("Soy la lista listaGatos[0] y apunto al objeto --->" + listaGatos[0])

    var colonia1 = ConjuntodeGatos(g1)

    println("Soy el objeto ConjuntodeGatos y apunto al objeto --->" +colonia1)

    listaGatos[0].nombre = "SoyGarfiel cambiado de Nombre"

    println("Soy la lista listaGatos[0] y apunto al objeto --->" + listaGatos[0].toString())
    println("Soy la lista listaGatos[1] y apunto al objeto --->" + listaGatos[1].toString())

}