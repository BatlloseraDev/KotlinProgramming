package com.example.debbddajavafx.Presentacion

import com.example.debbddajavafx.AccesoDatos.CategoriaDAOImpl
import com.example.debbddajavafx.Negocio.Categoria
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.stage.Stage
import javafx.scene.control.Alert

class CategoriasController {

    @FXML private lateinit var comboCategorias: ComboBox<Categoria>
    @FXML private lateinit var txtCodigo: TextField
    @FXML private lateinit var txtDescripcion: TextField

    private val dao = CategoriaDAOImpl()

    @FXML
    fun initialize() {
        cargarCategorias()

        comboCategorias.setOnAction {
            val seleccionada = comboCategorias.selectionModel.selectedItem
            if (seleccionada != null) {
                txtCodigo.text = seleccionada.codigo.toString()
                txtDescripcion.text = seleccionada.descripcion
            }
        }
    }

    private fun cargarCategorias() {
        val lista = FXCollections.observableArrayList(dao.getAllCategorias())
        comboCategorias.items = lista
    }

    @FXML
    fun cerrarVentana(event: ActionEvent) {
        val nodo = event.source as Node
        val ventana = nodo.scene.window as Stage
        ventana.close()
    }

    @FXML
    fun anadirCategoria(event: ActionEvent) {
        try {
            val nuevoCodigo = dao.getAllCategorias().maxOfOrNull { it.codigo }?.plus(1) ?: 1
            val descripcion = txtDescripcion.text

            if (descripcion.isBlank()) {
                mostrarAlerta("Advertencia", "La descripción no puede estar vacía.")
                return
            }

            if (dao.insertCategoria(Categoria(nuevoCodigo, descripcion))) {
                mostrarAlerta("Éxito", "Categoría añadida con código $nuevoCodigo.")
                cargarCategorias()
                limpiarCampos()
            } else {
                mostrarAlerta("Error", "No se pudo añadir la categoría.")
            }
        } catch (e: Exception) {
            mostrarAlerta("Error", "Error al añadir: ${e.message}")
        }
    }

    @FXML
    fun modificarCategoria(event: ActionEvent) {
        try {
            val codigo = txtCodigo.text.toInt()
            val descripcion = txtDescripcion.text

            if (dao.updateCategoria(Categoria(codigo, descripcion))) {
                mostrarAlerta("Éxito", "Categoría modificada correctamente.")
                cargarCategorias()
                limpiarCampos()
            } else {
                mostrarAlerta("Error", "No se pudo modificar la categoría.")
            }
        } catch (e: Exception) {
            mostrarAlerta("Error", "Datos inválidos: ${e.message}")
        }
    }

    @FXML
    fun borrarCategoria(event: ActionEvent) {
        try {
            val codigo = txtCodigo.text.toInt()

            if (dao.deleteCategoria(codigo)) {
                mostrarAlerta("Éxito", "Categoría borrada correctamente.")
                cargarCategorias()
                limpiarCampos()
            } else {
                mostrarAlerta("Error", "No se pudo borrar la categoría.")
            }
        } catch (e: Exception) {
            mostrarAlerta("Error", "Datos inválidos: ${e.message}")
        }
    }

    private fun limpiarCampos() {
        txtCodigo.clear()
        txtDescripcion.clear()
        comboCategorias.selectionModel.clearSelection()
    }

    private fun mostrarAlerta(titulo: String, contenido: String) {
        val alert = Alert(Alert.AlertType.INFORMATION)
        alert.title = titulo
        alert.contentText = contenido
        alert.showAndWait()
    }
}
