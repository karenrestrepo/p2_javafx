module co.edu.uniquindio.parcial1fx.parcial1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.parcial1fx to javafx.fxml;
    opens co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.controller;
    exports co.edu.uniquindio.parcial1fx.parcial1fx;
    exports co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.controller;
}