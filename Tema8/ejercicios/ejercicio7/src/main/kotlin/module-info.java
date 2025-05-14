module com.ejercicio.ejercicio7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicio7 to javafx.fxml;
    exports com.ejercicio.ejercicio7;
}