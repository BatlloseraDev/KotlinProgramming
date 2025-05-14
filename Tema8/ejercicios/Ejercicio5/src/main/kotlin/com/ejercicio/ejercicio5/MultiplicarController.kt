package com.ejercicio.ejercicio5

import javafx.fxml.FXML
import javafx.event.ActionEvent
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.control.Alert
import javafx.scene.control.ButtonType
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import java.net.URL
import java.util.*

class MultiplicarController: Initializable {

    @FXML
    private lateinit var VboxxContaiiner: VBox

    @FXML
    private lateinit var txtNumero: TextField

    @FXML
    fun onComprobarPressed(event: ActionEvent) {
        VboxxContaiiner.children.forEach { parent->
            if(parent is Parent){
                val lastObj = parent.childrenUnmodifiable.last()
                if(lastObj is TextField){
                    val index= VboxxContaiiner.children.indexOf(parent)
                    try {
                        if(index*txtNumero.text.toInt() == lastObj.text.toInt()){

                            lastObj.style= "-fx-background-color: rgba(0,255,0,0.5);"
                        }
                        else{
                            lastObj.style= "-fx-background-color: rgba(255,0,0,0.5);"
                        }
                    }catch (e:NumberFormatException){
                        lastObj.style= "-fx-background-color: rgba(255,0,0,0.5);"
                    }

                }
            }

        }
    }



    @FXML
    fun onMerindoPressed(event: ActionEvent) {
        VboxxContaiiner.children.forEach { parent->
            if(parent is Parent){
                val lastObj = parent.childrenUnmodifiable.last()
                if(lastObj is TextField){

                    val index= VboxxContaiiner.children.indexOf(parent)
                    lastObj.text="${index*txtNumero.text.toInt()}" //(index*txtNumero.text.toInt()).toString()

                }
            }

        }
    }

    @FXML
    fun onNuevoPressed(event: ActionEvent) {
        txtNumero.text="0"
        VboxxContaiiner.children.forEach { parent->
            if(parent is Parent){
                val firstObj = parent.childrenUnmodifiable.first()
                val lastObj = parent.childrenUnmodifiable.last()
                if(firstObj is TextField){
                    firstObj.clear()
                }
                if(lastObj is TextField){
                    lastObj.clear()
                    lastObj.style= ""
                }
            }

        }
    }




    fun rellenarAutomaticamente(){
        VboxxContaiiner.children.forEach { parent->
            if(parent is Parent){
                val firstObj = parent.childrenUnmodifiable.first()
                if(firstObj is TextField){
                    firstObj.text = txtNumero.text
                }
            }

        }
    }


    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        txtNumero.text = "0"
        txtNumero.textProperty().addListener { _, oldValue, newValue ->
            if (!newValue.matches(Regex("\\d*")) || newValue.isEmpty()) {
                // Permitir solo números
                txtNumero.text = oldValue
            }
            rellenarAutomaticamente()
        }
    }

}