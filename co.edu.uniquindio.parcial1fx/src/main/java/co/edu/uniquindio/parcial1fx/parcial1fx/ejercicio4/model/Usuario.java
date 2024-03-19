package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

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

    public int getEdad() {
        return edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                '}';
    }
}
