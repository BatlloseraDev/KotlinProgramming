module com.example.controles2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.controles2 to javafx.fxml;
    exports com.example.controles2;
}