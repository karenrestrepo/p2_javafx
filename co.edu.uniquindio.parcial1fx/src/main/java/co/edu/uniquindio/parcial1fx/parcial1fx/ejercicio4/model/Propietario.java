package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder.PropietarioBuilder;

import java.util.List;

public class Propietario extends Persona {

    Vehiculo vehiculoPrincipal;
    List<Vehiculo> listaVehiculosAsociados;

    public static PropietarioBuilder builder(){
        return new PropietarioBuilder();
    }

    /*Constructor*/
    public Propietario() {
    }

    public Propietario(String nombre, String identidicacion, String email, String celular) {
        super(nombre, identidicacion, email, celular);
    }
}
