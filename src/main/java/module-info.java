module com.example.ejercicio431 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio431 to javafx.fxml;
    exports com.example.ejercicio431;
}