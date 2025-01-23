fun main() {

    var a: ArrayList<Silla> = ArrayList()
    var cantidadSillas=10
    for(i in 0 until cantidadSillas)
    {
        a.add(Silla())
    }
    //Lucha
    for(silla in a)
    {
        println(silla)
    }

    var resultadoPelea= Silla.lucha(a[0],a[1])
    println("Gano la silla $resultadoPelea")




}