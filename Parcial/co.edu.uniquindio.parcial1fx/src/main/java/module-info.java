module co.edu.uniquindio.parcial1.parcial_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1.parcial_1 to javafx.fxml;
    exports co.edu.uniquindio.parcial1.parcial_1;
    opens co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Controller;
    exports co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Controller;
}