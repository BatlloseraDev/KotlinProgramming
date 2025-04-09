package com.example.controles



import javafx.beans.Observable
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.CheckBox
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.control.RadioButton
import javafx.scene.control.TextField
import javafx.scene.control.ToggleGroup
import javafx.scene.image.Image
import javafx.scene.input.MouseEvent
import javafx.stage.Stage
import java.net.URL
import java.time.format.DateTimeFormatter
import java.util.*


class HelloController: Initializable{
    @FXML
    lateinit var cbPulsame: CheckBox

    lateinit var radioCon: RadioButton
    lateinit var radioSin: RadioButton
    lateinit var lblSolucion: Label
    lateinit var estado: ToggleGroup

    lateinit var pbTrabajo: ProgressBar
    lateinit var lblProgreso: Label

    lateinit var txtFecha: TextField
    lateinit var txtDia: TextField
    lateinit var txtMes: TextField
    lateinit var txtAnio: TextField
    lateinit var dpFecha: DatePicker

    lateinit var comboNombre:ComboBox<String>
    private lateinit var obsLista: ObservableList<String>
    lateinit var txtNombre: TextField
    lateinit var txtAniadir: TextField

   override fun initialize(location: URL?, resources: ResourceBundle?) {
       obsLista = FXCollections.observableArrayList("Ana", "Pedro", "Juan")
       obsLista.add("María")
       comboNombre.items = obsLista

       lblProgreso.text = pbTrabajo.progress.toString()
   }


   // combo box
    @FXML
    private fun cbPulsamePulsado() {
       if (cbPulsame.isSelected){
           cbPulsame.text = "Pulsado"
       }else{
           cbPulsame.text = "no Pulsado"
       }
    }
    //radio Button
    @FXML
    private fun radioConSeleccionado() {
        if (radioCon.isSelected){
            lblSolucion.text = "Tienes Hambre"
        }
    }
    @FXML
    private fun btnInicializarPulsado() {
        radioCon.isSelected=false
        lblSolucion.text="Solución"
        radioSin.isSelected=false
    }

    @FXML
    private fun btnRevisarPulsado() {
        for (toggle in estado.toggles) {
            val radioButton = toggle as RadioButton
            if (radioButton.isSelected){
                lblSolucion.text = radioButton.text
            }
        }
    }

    //Progress Bar
    @FXML
    private fun btnMasPulsado() {
        pbTrabajo.progress += 0.01
        if (pbTrabajo.progress > 1){
            pbTrabajo.progress= 1.0
        }
        lblProgreso.text = pbTrabajo.progress.toString()
    }


    @FXML
    private fun btnMenosPulsado() {
        pbTrabajo.progress -= 0.1
        if (pbTrabajo.progress < 0){
            pbTrabajo.progress= 0.0
        }
        lblProgreso.text = (pbTrabajo.progress).toString()
    }

    @FXML
    private fun pbTrabajoClicked(event: MouseEvent) {
        val mouseX = event.x
        val progressBarWidth = pbTrabajo.width
        val progress = mouseX / progressBarWidth
        pbTrabajo.progress = progress
        lblProgreso.text = (pbTrabajo.progress).toString()
    }

    //Date Picker

    @FXML
    private fun dpFechaPulsado() {
        var formato = "dd-MM-YYYY"
        var formatoDia = "dd"
        var formatoMes = "MM"
        var formatoAnio = "YYYY"
        var fechaFormateada= DateTimeFormatter.ofPattern(formato)
        txtFecha.text = fechaFormateada.format(dpFecha.value)

        fechaFormateada= DateTimeFormatter.ofPattern(formatoDia)
        txtDia.text = fechaFormateada.format(dpFecha.value)

        fechaFormateada= DateTimeFormatter.ofPattern(formatoMes)
        txtMes.text = fechaFormateada.format(dpFecha.value)

        fechaFormateada= DateTimeFormatter.ofPattern(formatoAnio)
        txtAnio.text = fechaFormateada.format(dpFecha.value)
    }


    //combobox

    @FXML
    private fun comboNombrePulsado() {
        txtNombre.text = comboNombre.value
    }

    @FXML
    private fun btnAniadirPulsado() {
        if (!txtAniadir.text.isEmpty()){
            obsLista.add(txtAniadir.text)
            comboNombre.items = obsLista
        }
    }

    //cambiar aspecto sin css

    @FXML
    private fun btnCambiarPulsado() {
        var ventanaPrincipal = txtNombre.scene.window as Stage //devuelve un scene que lo combertimos a Stage
        ventanaPrincipal.title = "Lo He cambiado"

        txtNombre.style ="-fx-background-color:green"

        var icono = Image("icon.png")
        ventanaPrincipal.icons.add(icono)

    }
}