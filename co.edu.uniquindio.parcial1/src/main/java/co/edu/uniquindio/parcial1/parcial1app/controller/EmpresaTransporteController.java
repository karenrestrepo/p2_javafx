package co.edu.uniquindio.parcial1.parcial1app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1.parcial1app.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import co.edu.uniquindio.parcial1.parcial1app.factory.ModelFactory;

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
    private Button btnPropietarioMayorEdad;

    @FXML
    private Button btnTotalPasajerosVehiculoTransporte;

    @FXML
    private Button btnUsuariosMayoresEdad;

    @FXML
    private Button btnUsuariosMovilizadosVehiculoTransporte;

    @FXML
    private Button btnUsuariosPesoSuperior;

    @FXML
    private TextField txtCapacidadVehiculoCarga;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCedulaUsuario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtChasisVehiculoCarga;

    @FXML
    private TextField txtChasisVehiculoTransporte;

    @FXML
    private TextField txtColorVehiculoCarga;

    @FXML
    private TextField txtColorVehiculoTransporte;

    @FXML
    private TextField txtEdadPropietario;

    @FXML
    private TextField txtEdadUsuario;

    @FXML
    private TextField txtEjesVehiculoCarga;

    @FXML
    private TextField txtEmailPropietario;

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
    private TextField txtPesoUsuario;

    @FXML
    private TextField txtPesoUsuariosSuperior;

    @FXML
    private TextField txtPlacaUsuarioVehiculoTransporte;

    @FXML
    private TextField txtPlacaVehiculoCarga;

    @FXML
    private TextField txtPlacaVehiculoTransporte;

    @FXML
    private TextArea txtPropietarioCreado;

    @FXML
    private TextArea txtResultadoPropietario;

    @FXML
    private TextArea txtResultadoUsuario;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextArea txtResultadoVehiculoTransporte;

    @FXML
    private TextArea txtUsuarioCreado;

    @FXML
    private TextArea txtVehiculoCargaCreado;

    @FXML
    private TextArea txtVehiculoTransporteCreado;

    @FXML
    void onCrearPropietario(ActionEvent event) {
        crearPropietario();

    }

    @FXML
    void onCrearUsuario(ActionEvent event) {
        crearUsuario();

    }

    @FXML
    void onCrearVehiculoCarga(ActionEvent event) {
        crearVehiculoCarga();

    }

    @FXML
    void onCrearVehiculoTransporte(ActionEvent event) {
        crearVehiculoTransporte();

    }

    @FXML
    void onPropietarioMayorEdad(ActionEvent event) {
        obtenerPropietarioMayorEdad();

    }

    @FXML
    void onTotalPasajerosVehiculoTransporte(ActionEvent event) {

    }

    @FXML
    void onUsuariosMayoresEdad(ActionEvent event) {
        obtenerUsuariosMayoresEdad();

    }

    @FXML
    void onUsuariosMovilizadosVehiculoTransporte(ActionEvent event) {
        obtenerUsuariosMovilizados();

    }

    @FXML
    void onUsuariosPesoSuperior(ActionEvent event) {

    }

    @FXML
    void initialize() {
            modelFactory = ModelFactory.getInstance();
        }


    private Propietario propietario;

    private void crearPropietario() {
        if (modelFactory.crearPropietario(txtNombrePropietario.getText(),
                txtCedulaPropietario.getText(),
                txtEmailPropietario.getText(),
                txtCelularPropietario.getText(),
                Integer.parseInt(txtEdadPropietario.getText()))) {
            propietario = Propietario.builder()
                    .nombre(txtNombrePropietario.getText())
                    .cedula(txtCedulaPropietario.getText())
                    .email(txtEmailPropietario.getText())
                    .celular(txtCelularPropietario.getText())
                    .edad(Integer.parseInt(txtEdadPropietario.getText()))
                    .build();
            txtPropietarioCreado.setText(String.valueOf(propietario));

        } else {
            txtPropietarioCreado.setText("Este propietario ya existe");
        }
    }

    private Usuario usuario;

    private void crearUsuario() {
        if (modelFactory.crearUsuario(txtNombreUsuario.getText(),
                txtCedulaUsuario.getText(),
                Integer.parseInt(txtPesoUsuario.getText()),
                Integer.parseInt(txtEdadUsuario.getText()))) {
            usuario = Usuario.builder()
                    .nombre(txtNombreUsuario.getText())
                    .cedula(txtCedulaUsuario.getText())
                    .peso(Integer.parseInt(txtPesoUsuario.getText()))
                    .edad(Integer.parseInt(txtEdadUsuario.getText()))
                    .build();
            txtUsuarioCreado.setText(String.valueOf(usuario));

        } else {
            txtUsuarioCreado.setText("Este usuario ya existe");
        }
    }

    private VehiculoCarga vehiculoCarga;

    private void crearVehiculoCarga() {
        if (modelFactory.crearVehiculoCarga(txtPlacaVehiculoCarga.getText(),
                txtModeloVehiculoCarga.getText(),
                txtMarcaVehiculoCarga.getText(),
                txtColorVehiculoCarga.getText(),
                txtChasisVehiculoCarga.getText(),
                Double.valueOf(txtCapacidadVehiculoCarga.getText()),
                Integer.parseInt(txtEjesVehiculoCarga.getText()))) {
            vehiculoCarga = VehiculoCarga.builder()
                    .placa(txtPlacaVehiculoCarga.getText())
                    .modelo(txtModeloVehiculoCarga.getText())
                    .marca(txtMarcaVehiculoCarga.getText())
                    .color(txtColorVehiculoCarga.getText())
                    .numeroChasis(txtChasisVehiculoCarga.getText())
                    .capacidad(Double.valueOf(txtCapacidadVehiculoCarga.getText()))
                    .numeroEjes(Integer.parseInt(txtEjesVehiculoCarga.getText()))
                    .build();
            txtVehiculoCargaCreado.setText(String.valueOf(vehiculoCarga));

        } else {
            txtVehiculoCargaCreado.setText("Este vehículo de carga ya existe");
        }
    }

    private VehiculoTransporte vehiculoTransporte;

    private void crearVehiculoTransporte() {
        if (modelFactory.crearVehiculoTransporte(txtPlacaVehiculoTransporte.getText(),
                txtModeloVehiculoTransporte.getText(),
                txtMarcaVehiculoTransporte.getText(),
                txtColorVehiculoTransporte.getText(),
                txtChasisVehiculoTransporte.getText(),
                Integer.parseInt(txtMaximoPasajerosVehiculoTransporte.getText()))) {
            vehiculoTransporte = VehiculoTransporte.builder()
                    .placa(txtPlacaVehiculoTransporte.getText())
                    .modelo(txtModeloVehiculoTransporte.getText())
                    .marca(txtMarcaVehiculoTransporte.getText())
                    .color(txtColorVehiculoTransporte.getText())
                    .numeroChasis(txtChasisVehiculoTransporte.getText())
                    .maximoPasajeros(Integer.parseInt(txtMaximoPasajerosVehiculoTransporte.getText()))
                    .build();
            txtVehiculoTransporteCreado.setText(String.valueOf(vehiculoTransporte));

        } else {
            txtVehiculoTransporteCreado.setText("Este vehículo de transporte ya existe");
        }
    }

    private void obtenerUsuariosMayoresEdad() {
        String resultado = modelFactory.obtenerUsuariosMayoresEdad(txtEdadUsuario.getText());
        txtResultadoUsuario.setText(resultado);
    }

    private void obtenerUsuariosMovilizados() {
        if(!txtPlacaUsuarioVehiculoTransporte.getText().isEmpty()){
            int resultado = modelFactory.obtenerUsuariosMovilizados(txtPlacaUsuarioVehiculoTransporte.getText());
            txtResultadoVehiculoTransporte.setText(String.valueOf(resultado));
        }else{
            txtResultadoVehiculoTransporte.setText("El campo esta vacio, es requerido....");
        }

    }

    private void obtenerPropietarioMayorEdad() {

        int resultado = modelFactory.obtenerPropietarioMayorEdad();
        txtResultadoPropietario.setText(String.valueOf(resultado));


    }

}