module com.ejercicio.ejercicio5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicio5 to javafx.fxml;
    exports com.ejercicio.ejercicio5;
}