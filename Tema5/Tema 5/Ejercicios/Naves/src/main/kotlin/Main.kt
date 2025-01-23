fun main(args: Array<String>) {
    var tetOrbitando = Tet()
    var laTierra = Tierra()

    while(tetOrbitando.AlmacenNoCompleto()){
        var d1= Drones()
        tetOrbitando.aniadirDron(d1)
    }
    var i = 1
    while (i<=3){
        var j=1
        while (j<=3){
            var M_Aux = Mecanico("Jack",i,j)
            var S_Aux = Supervisora("Vika",i,j)
            var C_Aux = Cuadrante(i,j,M_Aux,S_Aux)
            var k=0
            while (k<3){
                if (tetOrbitando.puedoAsignarDron()){
                    C_Aux.dron((tetOrbitando.AsignarDron()))
                }
                k++
            }
            laTierra.aniadirCuadrante(C_Aux)
            j++
        }
        i++
    }
    var tiempo=0
    while (tiempo<21){
        if (tiempo%4 == 0){
            laTierra.Recorre()
        }
        if (tiempo%10==0){
            tetOrbitando.cursarOrdenesReparacion(laTierra)
            tetOrbitando.cursarOrdenesObservacion(laTierra)
        }
        if (tiempo%20==0){
           laTierra.ResuelveOrdenes(tetOrbitando)
        }
        tiempo++
    }
    println(tetOrbitando)
    println(laTierra)
}