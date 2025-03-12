fun main() {

    var naciones = ArrayList<Nacion>()

    naciones.add(Factoria.devolverNacion(Constantes.NOMBRENACIONES[0],"Isabel I"))
    naciones.add(Factoria.devolverNacion(Constantes.NOMBRENACIONES[1],"Constantino II"))

    var mina = Factoria.devolverMina(TipoMina.ORO, 500)

    var tiempo = 0
    while(tiempo<=Constantes.TIEMPOMAXIMO)
    {
        tiempo++
        when{
            tiempo%5==0->{ //ataque cura bizantino

                var trabajadores = mina.getArrayTrabajadores()
                var convertido= false
                for(t in trabajadores.indices)
                {
                    if(trabajadores[t].getNombreNacion()==Constantes.NOMBRENACIONES[0] && !convertido)
                    {
                        trabajadores[t].cambiarNacion(naciones[Constantes.NOMBRENACIONES.indexOf("BIZANTINO")])
                        convertido=true
                    }
                }
            }
            tiempo%2==0->{
                var trabajadorNuevo: Aldeano? = Factoria.devolverAldeano(naciones)
                if(trabajadorNuevo!=null)
                {
                    mina.addTrabajador(trabajadorNuevo)
                }

            }
            else->{ //cada segundo
                mina.esTrabajada()
            }
        }



    }

}