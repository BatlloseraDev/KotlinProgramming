fun main(args: Array<String>) {
    var n : Int = 0
    var m : Int = 0
    var i : Int = 0
    var j : Int = 0

    print("Primer número: ")
    n = readln().toInt()
    print("Segundo número: ")
    m = readln().toInt()

    for(i in 1..n) {
        for(j in 1..m) {
            println("$i $j")
        }
    }
}