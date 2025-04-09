module com.example.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.javafx1 to javafx.fxml;
    exports com.example.javafx1;
}