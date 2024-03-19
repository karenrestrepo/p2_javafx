package co.edu.uniquindio.parcial1.parcial1app.model;

import co.edu.uniquindio.parcial1.parcial1app.model.builder.VehiculoTransporteBuilder;
import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo{
    private int maximopasajeros;
    List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public static VehiculoTransporteBuilder builder(){
        return new VehiculoTransporteBuilder();
    }

    /*Constructor*/

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis, int maximopasajeros) {
        super(placa, modelo, marca, color, numeroChasis);
        this.maximopasajeros = maximopasajeros;
    }

    public int getMaximopasajeros() {
        return maximopasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "maximopasajeros=" + maximopasajeros +
                "} " + super.toString();
    }
}
