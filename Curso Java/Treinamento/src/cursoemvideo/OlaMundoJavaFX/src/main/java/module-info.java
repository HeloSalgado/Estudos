module com.example.olamundoswing {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.olamundoswing to javafx.fxml;
    exports com.example.olamundoswing;
}