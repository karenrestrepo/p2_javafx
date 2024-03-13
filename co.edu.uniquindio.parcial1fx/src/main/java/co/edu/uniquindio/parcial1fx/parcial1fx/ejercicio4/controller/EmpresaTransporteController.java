package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpresaTransporteController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnCrearPropietario;

        @FXML
        private Button btnUsuariosMayoresEdad;

        @FXML
        private Button btnUsuariosTransportados;

        @FXML
        private Button btnUsuariosTransportadosVehiculo;

        @FXML
        private TextField txtCedulaPropietario;

        @FXML
        private TextField txtEmailPropietario;

        @FXML
        private TextField txtIdentificacionPropietario;

        @FXML
        private TextField txtNombrePropietario;

        @FXML
        private TextField txtPlaca;

        @FXML
        private TextArea txtPropietarioCreado;

        @FXML
        private TextArea txtSolicitudPropietario;

        @FXML
        void onCrearPropietario(ActionEvent event) {

        }

        @FXML
        void onUsuariosMayoresEdad(ActionEvent event) {

        }

        @FXML
        void onUsuariosTransportados(ActionEvent event) {

        }

        @FXML
        void onUsuariosTransportadosVehiculo(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnCrearPropietario != null : "fx:id=\"btnCrearPropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert btnUsuariosMayoresEdad != null : "fx:id=\"btnUsuariosMayoresEdad\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert btnUsuariosTransportados != null : "fx:id=\"btnUsuariosTransportados\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert btnUsuariosTransportadosVehiculo != null : "fx:id=\"btnUsuariosTransportadosVehiculo\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtCedulaPropietario != null : "fx:id=\"txtCedulaPropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtEmailPropietario != null : "fx:id=\"txtEmailPropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtIdentificacionPropietario != null : "fx:id=\"txtIdentificacionPropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtNombrePropietario != null : "fx:id=\"txtNombrePropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtPlaca != null : "fx:id=\"txtPlaca\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtPropietarioCreado != null : "fx:id=\"txtPropietarioCreado\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";
            assert txtSolicitudPropietario != null : "fx:id=\"txtSolicitudPropietario\" was not injected: check your FXML file 'EmpresaTransporte.fxml'.";

        }


}
