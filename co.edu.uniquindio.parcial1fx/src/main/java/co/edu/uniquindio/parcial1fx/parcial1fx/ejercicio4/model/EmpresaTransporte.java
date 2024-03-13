package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    List<Persona> listaPersonas = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();



    /* Constructor*/

    public EmpresaTransporte() {
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

    public List<VehiculoTransporte> getListaVehiculosPasajero() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosPasajero(List<VehiculoTransporte> listaVehiculosPasajero) {
        this.listaVehiculosTransporte = listaVehiculosPasajero;
    }

    public List<Persona> getListaAsociados() {
        return listaPersonas;
    }

    public void setListaAsociados(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
