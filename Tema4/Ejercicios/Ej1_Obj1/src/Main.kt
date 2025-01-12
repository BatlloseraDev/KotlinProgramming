fun main() {
    var reloj = Reloj(28, 59,80,50)

    println(reloj.toString())
    reloj.recargarPila(100)
    println(reloj.pila)
}