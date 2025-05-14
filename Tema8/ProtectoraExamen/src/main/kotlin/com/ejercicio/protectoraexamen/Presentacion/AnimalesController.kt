package com.ejercicio.protectoraexamen.Presentacion


import com.ejercicio.protectoraexamen.AccesoDatos.AnimalesDAOImpl
import com.ejercicio.protectoraexamen.Negocio.*
import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES
import javafx.application.Platform
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.Node
import javafx.scene.control.*
import javafx.scene.control.Alert.AlertType
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage


class AnimalesController {

    @FXML private lateinit var btnAdoptar: Button
    @FXML private lateinit var comboAnimales: ComboBox<Animal>
    @FXML private lateinit var comboOpcion: ComboBox<TIpoSolicitud>
    @FXML private lateinit var txtApadrinado: TextField
    @FXML private lateinit var txtEdad: TextField
    @FXML private lateinit var txtEsterilizado: TextField
    @FXML private lateinit var txtLeishmania: TextField
    @FXML private lateinit var txtNombre: TextField
    @FXML private lateinit var txtPPP: TextField
    @FXML private lateinit var txtRaza: TextField
    @FXML private lateinit var txtSexo: TextField
    @FXML private lateinit var txtSociable: TextField
    @FXML private lateinit var txtTIpo: TextField
    @FXML private lateinit var txtTamanio: TextField
    @FXML private lateinit var ctEmail: AnchorPane
    @FXML private lateinit var txtEmail: TextField

    private val animalDAO= AnimalesDAOImpl()


    @FXML
    fun initialize() {
        cargarAnimales()

        comboAnimales.setOnAction {
            val seleccionado = comboAnimales.selectionModel.selectedItem
            if(seleccionado!=null){
                limpiarCampos();

                txtNombre.setText(seleccionado.nombre)
                txtTIpo.setText(seleccionado.tipo.toString().lowercase())
                txtSexo.setText(if(seleccionado.sexo) "Macho" else "Hembra")
                txtEdad.setText(seleccionado.edad.toString())
                txtSociable.setText(if(seleccionado.sociable)"Si" else "No")
                txtApadrinado.setText(if(seleccionado.apadrinado) "Si" else "No")
                if(seleccionado is Perro){
                    txtRaza.setText(seleccionado.raza)
                    txtPPP.setText(if(seleccionado.ppp) "Si" else "No")
                    txtLeishmania.setText(if(seleccionado.leishmania) "Si" else "No")
                    txtTamanio.setText(seleccionado.tamanio.toString())


                    txtEsterilizado.isDisable= true;


                }
                else if(seleccionado is Gato){
                    txtEsterilizado.setText(if(seleccionado.esterilizado)"Si" else "No" )

                    txtRaza.isDisable= true
                    txtPPP.isDisable= true
                    txtLeishmania.isDisable= true
                    txtTamanio.isDisable= true
                }

                if(seleccionado.get_SizeSolicitudes()<CONSTANTES.MAX_SOL){
                    comboOpcion.items.add(TIpoSolicitud.ADOPCION)
                    if(!seleccionado.get_Acogido()){
                        comboOpcion.items.add(TIpoSolicitud.ACOGIDA)
                    }
                    btnAdoptar.isDisable= false
                }else{
                    comboOpcion.isDisable = true
                    btnAdoptar.isDisable = true

                }

            }
        }
        comboOpcion.setOnAction {
            val seleccionado = comboOpcion.selectionModel.selectedItem
            if(seleccionado!=null){
                ctEmail.isVisible=true
            }
            else{
                ctEmail.isVisible=false
            }



        }


    }
    private fun limpiarCampos() {

        txtApadrinado.setText("")
        txtEdad.setText("")
        txtEsterilizado.setText("")
        txtLeishmania.setText("")
        txtNombre.setText("")
        txtPPP.setText("")
        txtRaza.setText("")
        txtSexo.setText("")
        txtSociable.setText("")
        txtTIpo.setText("")
        txtTamanio.setText("")


        txtRaza.isDisable= false
        txtPPP.isDisable= false
        txtLeishmania.isDisable= false
        txtTamanio.isDisable= false
        txtEsterilizado.isDisable= false

        comboOpcion.isDisable= false
        comboOpcion.items.clear()

        txtEmail.clear()
        btnAdoptar.isDisable= true
    }

    private fun cargarAnimales() {
        val lista = FXCollections.observableArrayList(animalDAO.getAllAnimales())
        comboAnimales.items = lista
    }


    @FXML
    fun onAdoptarPressed(event: ActionEvent) {

        val animal:Animal= comboAnimales.selectionModel.selectedItem
        val opcion: TIpoSolicitud = comboOpcion.selectionModel.selectedItem
        if(opcion!=null){
            if(txtEmail.text.isEmpty()){
                mostrarAlerta("Problema", "Email obligatorio", Alert.AlertType.WARNING)
            }
            else{
                val sol = Solicitud(opcion,txtEmail.text)
                animal.aniadirSolicitud(sol)
                if(animalDAO.escribirSolicitudFichero(animal))
                {
                    mostrarAlerta("Exito!","Solicitud realizada",Alert.AlertType.INFORMATION)

                }
                else{
                    mostrarAlerta("Problema","Hubo un problema inesperado", AlertType.WARNING)
                }

                comboAnimales.selectionModel.clearSelection() //select(animal)//refresca automaticamente
                comboAnimales.selectionModel.select(animal)



            }
        }

    }




    @FXML
    fun cerrarVentana(event: ActionEvent) {
        val source: Node = event.source as Node
        val stage = source.scene.window as Stage
        stage.close()


//        val alert = Alert(Alert.AlertType.CONFIRMATION)
//        alert.title = "Saliendo de la ventana de animales"
//        alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
//        alert.contentText="¿Está seguro?"
//        val res = alert.showAndWait()
//        if(res.isPresent){
//            if(res.get() == ButtonType.YES){
//                Platform.exit()
//            }
//        }


    }

    private fun mostrarAlerta(titulo:String, contenido:String, tipoAlerta:AlertType){
        val alert= Alert(tipoAlerta)
        alert.title = titulo
        alert.contentText = contenido
        alert.showAndWait()
    }


}