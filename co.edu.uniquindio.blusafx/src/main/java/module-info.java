module co.edu.uniquindio.blusafx.blusaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.blusafx.blusaapp to javafx.fxml;
    exports co.edu.uniquindio.blusafx.blusaapp;
}