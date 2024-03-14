package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

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
                                    String identificacion,
                                    String email,
                                    String celular) {
        Propietario propietarioEncontrado = obtenerPropietario(identificacion);
        if (propietarioEncontrado == null) {
            Propietario propietario = getBuildPropietario(nombre, identificacion, email, celular);
            getListaPropietarios().add(propietario);
            return true;
        } else {
            return false;
        }

    }


    private  Propietario getBuildPropietario(String nombre, String identificacion, String email, String celular) {
        return (Propietario.builder()
                .nombre(nombre)
                .identificacion(identificacion)
                .email(email)
                .celular(celular)
                .build();
    }

    private Propietario obtenerPropietario(String identificacion) {
        Propietario propietario = null;

        for (Propietario propietario1 : getListaPropietarios()) {
            if (propietario1.getIdentidicacion().equalsIgnoreCase(identificacion)) {
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
}
