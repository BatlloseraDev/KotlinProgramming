package com.example.ejercicio1

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TextField
import javafx.scene.input.InputMethodEvent
import javafx.scene.input.KeyEvent

class HelloController {


    @FXML
    private lateinit var txtN1: TextField

    @FXML
    private lateinit var txtN2: TextField

    @FXML
    private lateinit var txtSolucion: TextField


    @FXML
    fun onDividir(event: ActionEvent) {
        var valor1 = checkInt(txtN1.text)
        var valor2 = checkInt(txtN2.text)
        if(valor1 ==null || valor2 ==null) {
            txtSolucion.text="Error, uno de los numeros no es un Int"
        }
        else if(valor2 ==0){
            txtSolucion.text = "No se puede dvividr entre 0"
        }
        else{

            txtSolucion.text = dividir(valor1, valor2)
        }

    }

    @FXML
    fun onMultiplicar(event: ActionEvent) {

        var valor1 = checkInt(txtN1.text)
        var valor2 = checkInt(txtN2.text)
        if(valor1 ==null || valor2 ==null) {
            txtSolucion.text="Error, uno de los numeros no es un Int"
        }
        else{
            txtSolucion.text = multiplicar(valor1, valor2)
        }

    }

    @FXML
    fun onRestar(event: ActionEvent) {
        var valor1 = checkInt(txtN1.text)
        var valor2 = checkInt(txtN2.text)
        if(valor1 ==null || valor2 ==null) {
            txtSolucion.text="Error, uno de los numeros no es un Int"
        }
        else{
            txtSolucion.text = restar(valor1, valor2)
        }

    }

    @FXML
    fun onSumar(event: ActionEvent) {

        var valor1 = checkInt(txtN1.text)
        var valor2 = checkInt(txtN2.text)
        if(valor1 ==null || valor2 ==null) {
            txtSolucion.text="Error, uno de los numeros no es un Int"
        }
        else{
            txtSolucion.text = sumar(valor1, valor2)
        }

    }


    @FXML
    fun onTextIntroduced(event: KeyEvent) {
        println("Letra presionada ${event.code.char}")
    }


    fun checkInt(n: String):Int?{

        var valor:Int?
        try{

            valor = n.toInt()

        }catch(e:Exception){
            valor = null
        }
        return valor
    }


    fun sumar(n1:Int,n2:Int):String{

        return "${n1+n2}"
    }


    fun restar(n1:Int,n2:Int):String{
        return "${n1-n2}"
    }

    fun multiplicar(n1:Int,n2:Int):String{
        return "${n1*n2}"
    }
    fun dividir(n1:Int,n2:Int):String{
        return "${n1/n2}"
    }
}