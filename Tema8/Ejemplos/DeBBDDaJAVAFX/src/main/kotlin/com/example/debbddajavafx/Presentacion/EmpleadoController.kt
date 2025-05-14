package com.example.debbddajavafx.Presentacion

import com.example.debbddajavafx.AccesoDatos.EmpleadoDAOImpl
import com.example.debbddajavafx.Negocio.Empleado
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.stage.Stage
import javafx.scene.Node
import javafx.scene.control.Alert


class EmpleadoController {



    @FXML private lateinit var comboEmpleados: ComboBox<Empleado>
    @FXML private lateinit var txtDNI: TextField
    @FXML private lateinit var txtNombre: TextField
    @FXML private lateinit var txtPuesto: TextField

    private val dao= EmpleadoDAOImpl()

    @FXML
    fun initialize() {
        cargarEmpleados()

        comboEmpleados.setOnAction {
            val seleccionada = comboEmpleados.selectionModel.selectedItem
            if (seleccionada!=null){
                txtDNI.text = seleccionada.dni.toString()
                txtNombre.text = seleccionada.nombre
                txtPuesto.text = seleccionada.puesto.toString()

            }
        }

    }

    private fun cargarEmpleados() {
        val lista = FXCollections.observableArrayList(dao.getAllEmpleados())
        comboEmpleados.items = lista
    }


    @FXML
    fun anadirEmpleado(event: ActionEvent) {
        try{
            val nuevoDNI = dao.getAllEmpleados().maxOfOrNull{ it.dni }?.plus(1)?:1
            val nombre = txtNombre.text
            val puesto = txtPuesto.text.toInt()

            if(nombre.isEmpty() || txtPuesto.text.isEmpty()){
                mostrarAlerta("Adevertencia", "El nombre o puesto no rellenado")
            }

            if(dao.insertEmpleado(Empleado(nuevoDNI,nombre,puesto))){
                mostrarAlerta("Exito","Empleado con dni $nuevoDNI insertado")
                cargarEmpleados()
                limpiarCampos()
            } else {
                mostrarAlerta("Error", "No se pudo insertar el empleado")
            }
        }catch(e:Exception){
            mostrarAlerta("Error", "Error al insertar ${e.message}")
        }
    }

    @FXML
    fun borrarEmpleado(event: ActionEvent) {
        try{
            val dni= txtDNI.text.toInt()
            if(dao.deleteEmpleado(dni)){
                mostrarAlerta("Exito","Empleado borrado correctamente")
                cargarEmpleados()
                limpiarCampos()
            }else{
                mostrarAlerta("Error", "No se pudo borrar el empleado")

            }

        }catch(e:Exception){
            mostrarAlerta("Error", "Datos inválidos: ${e.message}")
        }


    }

    @FXML
    fun cerrarVentana(event: ActionEvent) {
        val nodo= event.source as Node
        val ventana = nodo.scene.window as Stage
        ventana.close()
    }

    @FXML
    fun modificarEmpleado(event: ActionEvent) {
        try{
            val dni= txtDNI.text.toInt()
            val nombre = txtNombre.text
            val puesto = txtPuesto.text.toInt()

            if(dao.updateEmpleado(Empleado(dni,nombre,puesto))){
                mostrarAlerta("Exito","Empleado actualizado")
                cargarEmpleados()
                limpiarCampos()
            } else {
                mostrarAlerta("Error","No se pudo ser actualizado")
            }
        }catch(e:Exception){
            mostrarAlerta("Error","Datos invalidos: ${e.message}")
        }


    }

    private fun limpiarCampos(){
        txtDNI.clear()
        txtNombre.clear()
        txtPuesto.clear()
        comboEmpleados.selectionModel.clearSelection()
    }

    private fun mostrarAlerta(titulo:String, contenido:String){
        val alert= Alert(Alert.AlertType.INFORMATION)
        alert.title = titulo
        alert.contentText = contenido
        alert.showAndWait()
    }

}