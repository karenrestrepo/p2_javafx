package co.edu.uniquindio.parcial1.parcial1app.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    List<Propietario> listaPropietarios = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();


    /* Constructor*/

    public EmpresaTransporte() {
    }

    public boolean crearPropietario(String nombre,
                                    String cedula,
                                    String email,
                                    String celular) {
        Propietario propietarioEncontrado = obtenerPropietario(cedula);
        if (propietarioEncontrado == null) {
            Propietario propietario = getBuildPropietario(nombre, cedula, email, celular);
            getListaPropietarios().add(propietario);
            return true;
        } else {
            return false;
        }

    }


    private  Propietario getBuildPropietario(String nombre, String cedula, String email, String celular) {
        return Propietario.builder()
                .nombre(nombre)
                .cedula(cedula)
                .email(email)
                .celular(celular)
                .build();
    }

    private Propietario obtenerPropietario(String cedula) {
        Propietario propietario = null;

        for (Propietario propietario1 : getListaPropietarios()) {
            if (propietario1.getCedula().equalsIgnoreCase(cedula)) {
                propietario = propietario1;
                break;
            }
        }
        return propietario;
    }

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }

    /* Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String obtenerUsuariosMayoresEdad() {
        String resultado = "";

        for (Usuario usuario : getListaUsuarios()) {
            if (usuario.getEdad() >= 18) {
                resultado += usuario.toString();
            }
            else {
                resultado = "No hay ususarios mayores de edad";
            }

        }
        return resultado;
    }
}
