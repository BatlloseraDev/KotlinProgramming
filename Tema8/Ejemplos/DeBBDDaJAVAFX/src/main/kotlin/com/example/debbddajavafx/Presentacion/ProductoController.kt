package com.example.debbddajavafx.Presentacion

import com.example.debbddajavafx.AccesoDatos.ProductoDAOImpl
import com.example.debbddajavafx.Negocio.Producto
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.stage.Stage
import javafx.scene.Node
import javafx.scene.control.Alert

class ProductoController {


    @FXML private lateinit var comboProductos: ComboBox<Producto>

    @FXML private lateinit var txtCOD_Prod: TextField
    @FXML private lateinit var txtCantidad: TextField
    @FXML private lateinit var txtCod_Cat: TextField
    @FXML private lateinit var txtNombreCategoria: TextField
    @FXML private lateinit var txtNombre: TextField
    @FXML private lateinit var txtPrecio: TextField

    private val dao= ProductoDAOImpl()


    @FXML
    fun initialize() {
        cargarProductos()

        comboProductos.setOnAction {
            val seleccionado = comboProductos.selectionModel.selectedItem
            if (seleccionado!=null){
                txtCOD_Prod.text=seleccionado.cod_prod.toString()
                txtCod_Cat.text=seleccionado.cod_cat.toString()
                txtNombreCategoria.text= dao.getCategoriaNombre(seleccionado.cod_cat)
                txtNombre.text=seleccionado.nombre
                txtCantidad.text=seleccionado.cantidad.toString()
                txtPrecio.text=seleccionado.precio.toString()
            }
        }
    }

    private fun cargarProductos() {
        val lista = FXCollections.observableArrayList(dao.getAllProductos())
        comboProductos.items = lista
    }


    @FXML
    fun anadirProducto(event: ActionEvent) {
        try{
            val nuevoCod_Prod = dao.getAllProductos().maxOfOrNull { it.cod_prod }?.plus(1)?:1
            val cod_cat = txtCod_Cat.text.toInt()
            val nombre = txtNombre.text
            val cantidad = txtCantidad.text.toInt()
            val precio = txtPrecio.text.toInt()


            if(nombre.isEmpty()|| txtCod_Cat.text.isEmpty()||txtPrecio.text.isEmpty()||txtCantidad.text.isEmpty()){
                mostrarAlerta("Advertencia","Hay algun campo vacío")
            }

            if(dao.insertProducto(Producto(nuevoCod_Prod,cod_cat,nombre,cantidad,precio))){
                mostrarAlerta("Exito","Producto con codigo $nuevoCod_Prod")
                cargarProductos()
                limpiarCampos()
            }else {
                mostrarAlerta("Error","No se pudo insertar el producto con nombre $nombre")
            }

        }catch(e:Exception){
            mostrarAlerta("Error", "Error al insertar ${e.message}")
        }

    }

    @FXML
    fun borrarProducto(event: ActionEvent) {
        try{
            val cod_prod= txtCOD_Prod.text.toInt()
            if(dao.deleteProducto(cod_prod)){
                mostrarAlerta("Exito","Producto eliminado correctamente")
                cargarProductos()
                limpiarCampos()
            }else{
                mostrarAlerta("Error","No se pudo borrar")
            }

        }catch(e:Exception){
            mostrarAlerta("Error","Datos invalidos: ${e.message}")
        }
    }

    @FXML
    fun cerrarVentana(event: ActionEvent) {
        val nodo = event.source as Node
        val ventana = nodo.scene.window as Stage
        ventana.close()
    }
    @FXML
    fun modificarProducto(event: ActionEvent) {
        try{
            val cod_prod = txtCOD_Prod.text.toInt()
            val cod_cat = txtCod_Cat.text.toInt()
            val nombre = txtNombre.text
            val cantidad = txtCantidad.text.toInt()
            val precio = txtPrecio.text.toInt()

            if(dao.updateProducto(Producto(cod_prod,cod_cat,nombre,cantidad,precio))){
                mostrarAlerta("Exito","Producto actualizado correctamente")
                cargarProductos()
                limpiarCampos()
            } else {
                mostrarAlerta("Error","No se pudo actualizar el producto")
            }

        }catch(e:Exception){
            mostrarAlerta("Error","Datos invalidos: ${e.message}")
        }
    }




    private fun limpiarCampos(){
        txtCOD_Prod.clear()
        txtCod_Cat.clear()
        txtNombre.clear()
        txtCantidad.clear()
        txtPrecio.clear()
        comboProductos.selectionModel.clearSelection()
    }

    private fun mostrarAlerta(titulo:String, contenido:String){
        val alert= Alert(Alert.AlertType.INFORMATION)
        alert.title = titulo
        alert.contentText = contenido
        alert.showAndWait()
    }


}