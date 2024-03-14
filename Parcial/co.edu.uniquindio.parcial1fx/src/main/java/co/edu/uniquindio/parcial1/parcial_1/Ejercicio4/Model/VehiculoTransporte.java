package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder.VehiculoTransporteBuilder;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {

    private int maximopasajeros;
    List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public static VehiculoTransporteBuilder builder(){
        return new VehiculoTransporteBuilder();
    }

    /*Constructor*/

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maximopasajeros) {
        super(placa, modelo, marca, color);
        this.maximopasajeros = maximopasajeros;
    }

    /*Getters and Setters*/

    public int getMaximopasajeros() {
        return maximopasajeros;
    }

    public void setMaximopasajeros(int maximopasajeros) {
        this.maximopasajeros = maximopasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }
}
