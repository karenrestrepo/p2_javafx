package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder.UsuarioBuilder;

public class Usuario extends Asociado {
    private  int maximoPasajeros;
    VehiculoTransporte vehiculoAsociado;


    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    /*Constructor*/

    public Usuario(int maximoPasajeros) {

    }

    public Usuario(String nombre, String identidicacion, String email, String celular, int maximoPasajeros) {
        super(nombre, identidicacion, email, celular);
        this.maximoPasajeros = maximoPasajeros;
    }


}
