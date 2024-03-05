module co.edu.uniquindio.blusafx.blusaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.blusafx.blusaapp to javafx.fxml;
    exports co.edu.uniquindio.blusafx.blusaapp;
    opens co.edu.uniquindio.blusafx.blusaapp.controller;
    exports co.edu.uniquindio.blusafx.blusaapp.controller;
    opens co.edu.uniquindio.blusafx.blusaapp.model;

}