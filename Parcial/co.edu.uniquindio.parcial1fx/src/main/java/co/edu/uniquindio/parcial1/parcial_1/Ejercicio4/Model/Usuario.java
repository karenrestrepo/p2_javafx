package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder.UsuarioBuilder;

public class Usuario extends Persona {
    private  int edad;
    VehiculoTransporte vehiculoAsociado;


    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    /*Constructor*/

    public Usuario(int edad) {

    }

    public Usuario(String nombre, String identidicacion, String email, String celular, int edad) {
        super(nombre, identidicacion, email, celular);
        this.edad = edad;
    }


}
