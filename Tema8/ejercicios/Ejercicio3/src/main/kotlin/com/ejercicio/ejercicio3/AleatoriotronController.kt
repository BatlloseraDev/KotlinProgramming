package com.ejercicio.ejercicio3

import javafx.fxml.FXML
import javafx.event.ActionEvent
import javafx.fxml.Initializable
import javafx.scene.control.*
import java.net.URL
import java.util.*

class AleatoriotronController:Initializable{


    @FXML
    private lateinit var spNumero1: Spinner<Int>

    @FXML
    private lateinit var spNumero2: Spinner<Int>

    @FXML
    private lateinit var txtResultado: TextField

    @FXML
    fun onBtnGenerarPressed(event: ActionEvent) {
        var tipoError= ""
        if(spNumero2.editor.text.toInt()<spNumero1.editor.text.toInt()){
            txtResultado.text="Error"
            tipoError="El numero segundo no puede ser menor que el primero"
        }
        else if(spNumero2.editor.text.toInt()==spNumero1.editor.text.toInt()){
            txtResultado.text="Error"
            tipoError="El numero segundo no puede ser igual que el primero"
        }
        else{
            var random = Random().nextInt(spNumero1.editor.text.toInt(),spNumero2.editor.text.toInt()+1)
            txtResultado.text=random.toString()
        }
        if (tipoError.isNotEmpty()){
            mostrarAlertError(tipoError)
        }
    }
    fun mostrarAlertError(errorTexto: String){
        val alert = Alert(Alert.AlertType.ERROR)
        alert.title = "Error"
        alert.headerText = errorTexto
        alert.buttonTypes.setAll(ButtonType.OK)
        alert.showAndWait()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        spNumero1.valueFactory = SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0)
        spNumero2.valueFactory = SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0)

        spNumero1.editor.textProperty().addListener { _, oldValue, newValue ->
            if (!newValue.matches(Regex("\\d*")) || newValue.isEmpty()) {
                // Permitir solo números
                spNumero1.editor.text = oldValue
            }else if((newValue.isNotEmpty() && newValue.toInt() > 100)){
                spNumero1.editor.text= "100"

            }
        }


        spNumero2.editor.textProperty().addListener { _, oldValue, newValue ->
            if (!newValue.matches(Regex("\\d*")) || newValue.isEmpty()) { // Permitir solo números
                spNumero2.editor.text = oldValue

            }else if((newValue.isNotEmpty() && newValue.toInt() > 100)){
                spNumero2.editor.text= "100";
            }
        }
    }

}