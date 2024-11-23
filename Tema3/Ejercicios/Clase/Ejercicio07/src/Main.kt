fun main() {
    //primer ejercicio matrices
    var m = Array(3){IntArray(3){0}}
    var i= 0
    var j = 0
    var cont =0
    while(i<m.size)
    {
        if(j>=m.size)
        {
          i++
          j=0
        }
        m[i][j] = 1
        j++
    }

}