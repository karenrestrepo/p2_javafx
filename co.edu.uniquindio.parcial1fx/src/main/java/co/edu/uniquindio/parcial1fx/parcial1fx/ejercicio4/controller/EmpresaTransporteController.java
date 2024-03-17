package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.factory.ModelFactory;
import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.Propietario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpresaTransporteController {

    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearPropietario;

    @FXML
    private Button btnCrearUsuario;

    @FXML
    private Button btnCrearVehiculoCarga;

    @FXML
    private Button btnCrearVehiculoTransporte;

    @FXML
    private Button btnPropietariosMayoresEdad;

    @FXML
    private Button btnTotalCargasTransportadas;

    @FXML
    private Button btnUsuariosMayoresEdad;

    @FXML
    private Button btnUsuariosTransportados;

    @FXML
    private Button btnUsuariosTransportadosVehiculo;

    @FXML
    private TextField txtCapacidadVehiculoCarga;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtCelularUsuario;

    @FXML
    private TextField txtColorVehiculoCarga;

    @FXML
    private TextField txtColorVehiculoTransporte;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtEjesVehiculoCarga;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtEmailUsuario;

    @FXML
    private TextField txtIdentificacionPropietario;

    @FXML
    private TextField txtIdentificacionUsuario;

    @FXML
    private TextField txtMarcaVehiculoCarga;

    @FXML
    private TextField txtMarcaVehiculoTransporte;

    @FXML
    private TextField txtMaximoPasajerosVehiculoTransporte;

    @FXML
    private TextField txtModeloVehiculoCarga;

    @FXML
    private TextField txtModeloVehiculoTransporte;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNombreUsuario;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPlacaVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculoTransporte;

    @FXML
    private TextArea txtPropietarioCreado;

    @FXML
    private TextArea txtSolicitudPropietario;

    @FXML
    private TextArea txtSolicitudUsuario;

    @FXML
    private TextArea txtSolicitudVehiculoCarga;

    @FXML
    private TextArea txtSolicitudVehiculoTransporte;

    @FXML
    private TextArea txtUsuarioCreado;

    @FXML
    private TextArea txtVehiculoCargaCreado;

    @FXML
    private TextArea txtVehiculoTransporteCreado;

    @FXML
    void onCrearPropietario(ActionEvent event) {

    }

    @FXML
    void onCrearUsuario(ActionEvent event) {

    }

    @FXML
    void onCrearVehiculoCarga(ActionEvent event) {

    }

    @FXML
    void onCrearVehiculoTransporte(ActionEvent event) {

    }

    @FXML
    void onPropietariosMayoresEdad(ActionEvent event) {

    }

    @FXML
    void onTotalCargasTransportadas(ActionEvent event) {

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
        modelFactory = ModelFactory.getInstance();
    }


    private void crearPropietario() {
        modelFactory.crearPropietario(txtNombrePropietario.getText(),
                txtIdentificacionPropietario.getText(),
                txtEmailPropietario.getText(),
                txtCelularPropietario.getText());
    }

}