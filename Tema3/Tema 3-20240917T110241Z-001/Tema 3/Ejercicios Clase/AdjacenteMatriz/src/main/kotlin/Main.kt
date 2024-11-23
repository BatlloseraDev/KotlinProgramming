fun main(args: Array<String>) {
    var m =Array(5){Array<Int>(5){7}}
    var i = -1
    var j= -1
    var x = 0
    var y = 0
    m[x][y]=3

    while (i<=1){
        j=-1
        while (j<=1) {
            var adjX = x + i
            var adjY = y + j
            if ((adjX >= 0) && (adjX < m.size) && (adjY >= 0) && (adjY < m.size)){
                if ((i != 0) || (j != 0)) {
                    print(" " + m[adjX][adjY])
                } else {
                    print("  ")
                }
            }else{
                print("  ")
            }
            j++
        }
        println()
        i++
    }



}