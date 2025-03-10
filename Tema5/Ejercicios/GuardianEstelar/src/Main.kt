fun main() {

    var juego= true
    var guardianEstelar = Factoria.generarGuardian()
    var adversarios= ArrayList<Adversario>()
    var coronaCristal = Factoria.generarCorona()

    var turno = 1
    while(juego)
    {
        println("\n\n\nTURNO $turno:\n\n\n")
        //generar adversarios
        if(Adversario.num_adversarios<Costantes.MAXADVERSARIOS)
        {
            var n_adversarios= Costantes.devolverNumAdversarios()
            if(n_adversarios+Adversario.num_adversarios>Costantes.MAXADVERSARIOS)
            {
                n_adversarios = Costantes.MAXADVERSARIOS-Adversario.num_adversarios
            }//en el caso de que haya 99 y quiera generar 3 que solo sea 1

            for(i in 0..<n_adversarios){
                adversarios.add(Factoria.generarAdversario())
            }
        }//se puede sacar a la factoria

        //encontrar cristales
        for(adversario in adversarios)
        {
            if(Costantes.devolverEncontrarCristal() ) //si tiene menos crist del max y encuentra
            {
                if(adversario.devolverNumCristales()<Costantes.MAXCRISTALESADVERSARIO)
                {
                    adversario.aniadirCristal(coronaCristal.generarCristal())
                }
                else //en caso de que tenga los bolsillos llenos, pero encuentre un cristal púrpura lo guarda
                {
                    var cristal = coronaCristal.generarCristal()
                    if(cristal is CristalPurpura)
                    {
                        adversario.quitarCristalNoPurpura()
                        adversario.aniadirCristal(cristal)
                    }
                }

            }
        }

        //Guardian busca adversario
        var enfreta = guardianEstelar.revisarAdversarios(adversarios)
        if (enfreta != null) {
            println("Maestro de cristales encontrado")

            //generar energia
            var energia = guardianEstelar.devolverEnergia()
            var energia_ad= enfreta.devolverEnergia()

            println("¡El guardian generó $energia de energía!")
            //luchar
            if (energia>=energia_ad)//como no lo especifica en el caso de que sea igual considero que gana
            {
                var cristal= enfreta.quitarCristal()
                if(cristal!=null && cristal is CristalPurpura)//no debería de darse el caso, pero por si acaso
                {
                    println("El guardian ganó y le quitó un cristal morado de energía: ${cristal.energia}")
                    guardianEstelar.aniadirCristal(cristal)
                }
            }
            else//pierde
            {
                guardianEstelar.restarResistencia(energia_ad)
                println("El guardian perdió contra un adversario de ${energia_ad} energia y se quedó a ${guardianEstelar.resistencia} de resistencia")
            }

        }else{
            println("No encontró ningún maestro de cristales")
        }

        //imprimir enemigos
        println("\nLos adversarios actuales están:")
        for(ad in 0..<adversarios.size)
        {
            println("Para el adversario ${ad+1}: ${adversarios[ad]}")
        }

        //checks finales
        if(guardianEstelar.devolverNumCristales()==Costantes.MAXCRISTALESPURPURA || guardianEstelar.devolverResistencia()<=0 )
        {
            juego= false
        }

        turno++
    }

    if(guardianEstelar.devolverNumCristales()==Costantes.MAXCRISTALESPURPURA )
    {
        println("El guardían ganó quedando con ${guardianEstelar.resistencia} de resitencia y con los cristales:\n\t"+
                guardianEstelar.cristales.joinToString("\n\t")
        )
    }
    else{
        println("El guardian perdio toda la resistencia quedando a: ${guardianEstelar.resistencia}, con los cristales:\n\t"
                + guardianEstelar.cristales.joinToString("\n\t"))
    }

}