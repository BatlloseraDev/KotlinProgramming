module com.ejercicio.ejercicioformulario {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicioformulario to javafx.fxml;
    exports com.ejercicio.ejercicioformulario;
}