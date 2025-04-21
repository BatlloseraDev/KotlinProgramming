package com.ejercicio.controlesvarios

import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*
import javafx.scene.input.MouseEvent
import java.net.URL
import java.util.*

class VentanaPrincipalController: Initializable {


    @FXML
    private lateinit var chbBaseDeDatos: CheckBox

    @FXML
    private lateinit var chbLenguajedeMarcas: CheckBox

    @FXML
    private lateinit var chbProg: CheckBox

    @FXML
    private lateinit var txtNombre: TextField

    @FXML
    private lateinit var rbDAM: RadioButton

    @FXML
    private lateinit var rbDAW: RadioButton

    @FXML
    private lateinit var choiceNombres: ChoiceBox<String>

    @FXML
    private lateinit var combNombres: ComboBox<String>




    @FXML
    fun onBTNMarcadoresPressed(event: ActionEvent) {
        var textoMostrar=""
        textoMostrar += txtNombre.text
        textoMostrar += " está matriculado de: \n"
        if(rbDAM.isSelected){
            textoMostrar += rbDAM.text
        }
        if(rbDAW.isSelected){
            textoMostrar += rbDAW.text
        }

        if(chbBaseDeDatos.isSelected){
            textoMostrar+= chbBaseDeDatos.text
            textoMostrar +="\n"
        }

        if(chbLenguajedeMarcas.isSelected){
            textoMostrar += chbLenguajedeMarcas.text
            textoMostrar +="\n"
        }
        if(chbProg.isSelected){
            textoMostrar += chbProg.text
            textoMostrar +="\n"
        }

        var ale = Alert(Alert.AlertType.INFORMATION)
        ale.title="Matrícula"
        ale.contentText = textoMostrar
        ale.show()
    }

    @FXML
    fun onBTNSalirPressed(event: ActionEvent) {
       Platform.exit()
    }


    @FXML
    fun onAddPressed(event: ActionEvent) {
        if(txtNombre.text.isNotBlank()){
            combNombres.items.add(txtNombre.text)
            choiceNombres.items.add(txtNombre.text)
        }


    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        rbDAW.isSelected=true;
        chbProg.isSelected=true;
        combNombres.items.add("R2D2")
        combNombres.items.add("C3PO")
        choiceNombres.items.add("Vader")
        choiceNombres.items.add("Yoda")
    }



    @FXML
    fun onChoiceClicked(event: MouseEvent) {

    }

    @FXML
    fun onComboNombresPressed(event: ActionEvent) {
        txtNombre.text= combNombres.selectionModel.selectedItem.toString()
        println(combNombres.selectionModel.selectedIndex)
    }

}