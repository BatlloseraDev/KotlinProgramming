fun main() {
    var cadena: String = "el martes es un dia de lluvia"

    println(cadena.length)

    var cadenaBlancos = "     tengo espacio"
    println(cadenaBlancos.length)
    println(cadenaBlancos.trim().length)

    println(cadenaBlancos.substring(5))
    println(cadenaBlancos.substring(5,6))

    var v1= "a"
    var v2= "d"
    println(v1.compareTo(v2))
    println(v2.compareTo(v1))



}