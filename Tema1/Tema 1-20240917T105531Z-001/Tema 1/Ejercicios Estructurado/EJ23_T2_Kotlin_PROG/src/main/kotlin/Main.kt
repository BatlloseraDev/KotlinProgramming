fun main() {
    var n : Int = 0
    var total : Int = 1
    var i : Int = 0

    print("Número: ")
    n = readln().toInt()

    for(i in 1..n) {
        total*=i//total = total * i
    }
    println("Resultado: ${total}")
}