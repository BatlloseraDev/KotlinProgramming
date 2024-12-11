import kotlin.random.Random

const val N= 3
const val MAX= 10
fun main() {

    var matrix= Array(N){IntArray(N){Random.nextInt(0, MAX)} }
    var valores = Array(N){0}

}


fun devolverMaximos(m:Array<IntArray>, v:Array<Int>)
{
    var max =m[0][0]
    for(i in m.indices)
    {
        for(j in m[i].indices)
        {
            if(m[i][j]>max)
            {
                max= m[i][j]
            }
            v[i]= max
            max= 0
        }
    }
}