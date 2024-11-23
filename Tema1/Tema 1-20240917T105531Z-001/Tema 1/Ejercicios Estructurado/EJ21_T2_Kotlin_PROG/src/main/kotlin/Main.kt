fun main(args: Array<String>) {
    var cont : Int = 2
    var i : Int = 0
    println("---- con while -----")
    while (cont <= 20){
        println(cont)
        cont+=2
    }
    println("---- con for -----")
    for (i in 2..20 step 2){
        println(i)
    }
}