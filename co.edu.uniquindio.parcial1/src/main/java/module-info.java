module co.edu.uniquindio.parcial1.parcial1app {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1.parcial1app to javafx.fxml;
    exports co.edu.uniquindio.parcial1.parcial1app;
}