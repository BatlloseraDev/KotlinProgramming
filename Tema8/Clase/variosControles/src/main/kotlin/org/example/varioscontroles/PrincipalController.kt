package org.example.varioscontroles

import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*
import java.net.URL
import java.util.*

class PrincipalController : Initializable {
    @FXML
    private lateinit var txtNombre: TextField

    @FXML
    private lateinit var btMarcarDesmarcar: ToggleButton

    @FXML
    private lateinit var coNombres: ComboBox<String>

    @FXML
    private lateinit var cbChoiceBox: ChoiceBox<String>

    @FXML
    private lateinit var chBox1: CheckBox

    @FXML
    private lateinit var chBox2: CheckBox

    @FXML
    private lateinit var chBox3: CheckBox

    private lateinit  var checkBoxes: ArrayList<CheckBox>

    @FXML
    fun onAddPulsado(event: ActionEvent) {
        if (txtNombre.text.isNotBlank()) {
            coNombres.items.add(txtNombre.text)
            println(coNombres.items.toString())
        }
    }

    @FXML
    fun onSalirPulsado(event: ActionEvent) {
        val alert = Alert(Alert.AlertType.CONFIRMATION)
        alert.title = "Salir"
        alert.headerText = "¿Estás seguro de que deseas salir?"
        alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)

        val result = alert.showAndWait()
        if (result.orElse(ButtonType.NO) == ButtonType.YES) {
            Platform.exit()
        }
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        coNombres.items.add("R2D2")
        coNombres.items.add("C3PO")
        cbChoiceBox.items.addAll(coNombres.items)
        cbChoiceBox.items.add("Vader")
        cbChoiceBox.selectionModel.select(0)
        checkBoxes = arrayListOf(chBox1, chBox2, chBox3)

    }

    @FXML
    fun onBorrarPulsado(event: ActionEvent) {
        if(coNombres.selectionModel.selectedIndex != -1) {
            coNombres.items.removeAt(coNombres.selectionModel.selectedIndex)
        }
    }

    @FXML
    fun onComboclick(event: ActionEvent) {
        println(coNombres.selectionModel.selectedIndex)
        println(coNombres.selectionModel.selectedItem)
        txtNombre.text = coNombres.selectionModel.selectedItem
    }


    @FXML
    fun onMarcarDesmarcasrPulsado(event: ActionEvent) {
        if (btMarcarDesmarcar.isSelected) {
            checkBoxes.forEach { it.isSelected = true }
            btMarcarDesmarcar.text = "Desmarcar"
        } else {
            checkBoxes.forEach { it.isSelected = false }
            btMarcarDesmarcar.text = "Marcar"
        }

    }

    @FXML
    fun onObtenerSelPulsado(event: ActionEvent) {
        val seleccionados = checkBoxes
            .filter { it.isSelected }
            .map { it.text }
        val alert = Alert(Alert.AlertType.INFORMATION)
        alert.title = "Seleccionados"
        alert.headerText = "Seleccionados: ${checkBoxes.count { it.isSelected }}"
        alert.contentText = seleccionados.joinToString(separator = "\n")
        alert.show()
    }
}