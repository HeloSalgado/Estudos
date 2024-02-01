module com.example.destinosviagens {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.destinosviagens to javafx.fxml;
    exports com.example.destinosviagens;
}