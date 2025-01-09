fun main(args: Array<String>) {
    var c1 = Cubo(100,"Rojo",Material.PLASTICO,false,20)
    var c2 = Cubo(10,"Rojo",Material.LATON,false,5)
    println(c1)
    println(c2)
    c1.volcarAlCubo(c2)
    println(c1)
    println(c2)
}