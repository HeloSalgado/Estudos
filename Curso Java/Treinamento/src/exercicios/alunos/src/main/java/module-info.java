module com.example.alunos {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.alunos to javafx.fxml;
    exports com.example.alunos;
}