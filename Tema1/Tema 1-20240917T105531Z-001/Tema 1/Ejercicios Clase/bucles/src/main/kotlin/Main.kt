fun main() {
    var i = 0
    var j= 0
    val N = 10
    while(j<N){
        while (i<N){
            println("$j $i")
            i++
        }
        j++
        i=0
    }
}