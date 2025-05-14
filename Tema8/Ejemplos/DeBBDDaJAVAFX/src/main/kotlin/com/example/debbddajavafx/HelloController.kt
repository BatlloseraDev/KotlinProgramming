package com.example.debbddajavafx

import com.example.debbddajavafx.Presentacion.CategoriasController
import com.example.debbddajavafx.Presentacion.EmpleadoController
import com.example.debbddajavafx.Presentacion.ProductoController
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.MenuItem
import javafx.stage.Stage

class HelloController {

    @FXML
    private lateinit var menuItemCategorias: MenuItem // Opcional, solo si quieres manipularlo

    @FXML
    fun abrirCategorias(event: ActionEvent) {
        try {
            //val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
            val loader = FXMLLoader(CategoriasController::class.java.getResource("/com/example/debbddajavafx/categorias-view.fxml"))

            //val loader = FXMLLoader(javaClass.getResource("/com/example/debbddajavafx/categorias-view.fxml"))
            val root: Parent = loader.load()
            val stage = Stage()
            stage.scene = Scene(root)
            stage.title = "Gestión de Categorías"
            stage.showAndWait()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @FXML
    fun abrirEmpleados(event: ActionEvent) {
        try {
            val loader = FXMLLoader(EmpleadoController::class.java.getResource("/com/example/debbddajavafx/empleado-view.fxml"))
            val root: Parent = loader.load()
            val stage = Stage()
            stage.scene = Scene(root)
            stage.title = "Gestion Empleados"
            stage.showAndWait()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    @FXML
    fun abrirProductos(event: ActionEvent) {
        try {
            val loader= FXMLLoader(ProductoController::class.java.getResource("/com/example/debbddajavafx/productos-view.fxml"))
            val root: Parent = loader.load()
            val stage = Stage()
            stage.scene = Scene(root)
            stage.title = "Gestion Productos"
            stage.showAndWait()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}