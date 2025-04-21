package com.ejercicio.ejercicio2

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextField


class CalculadoraController {

    var cadena= StringBuilder();
    @FXML
    private lateinit var lbNumbers: TextField


    @FXML
    fun onErase(event: ActionEvent) {
        cadena.deleteCharAt(cadena.length - 1)
        updateInputFIeld()
    }

    @FXML
    fun onEraseAll(event: ActionEvent) {
        cadena.clear()
        updateInputFIeld()
    }


    @FXML
    fun onEqual(event: ActionEvent) {
        var mensaje=""
        //aqui tendré que hacer un try catch
        try{
            val expression = cadena.toString()


            // Evaluar la expresión matemática
            val result = evaluateExpression(expression)

            // Formatear resultado (eliminar .0 en enteros)
            val formattedResult = if (result % 1 == 0.0) "${result.toInt()}" else "$result"

            mensaje= "Aun estoy trabajando en la implementacion de calculos :D"


        } catch (e:NumberFormatException) {
            mensaje=e.toString()
        }
        catch (e: ArithmeticException){
            mensaje=e.toString()
        }
        catch (e: Exception){
            mensaje=e.toString()
        }
        cadena.clear().append(mensaje)
        updateInputFIeld()

    }

    private fun evaluateExpression(expresion:String):Double{

        var contenidos = ArrayList<String>()
        var lastItem='0'
        var contador= -1
        for(c in cadena){

            if(contenidos.isEmpty() || !c.isDigit() ||!lastItem.isDigit()){
                contenidos.add(c.toString())
                contador++
                lastItem=c
            }
            else{
                contenidos[contador]+=c.toString()
                lastItem=c
            }
        }
        for(contenido in contenidos){
            println("$contenido")
        }

        return 0.0
    }


    @FXML
    fun onNumber(event: ActionEvent) {
        val number = (event.source as Button).text;
        cadena.append(number);
        updateInputFIeld()
    }

    @FXML
    fun onOperator(event: ActionEvent) {
        val operator = (event.source as Button).text;
        cadena.append(operator);
        updateInputFIeld()
    }


    fun updateInputFIeld() {
        lbNumbers.text = cadena.toString()
    }



}