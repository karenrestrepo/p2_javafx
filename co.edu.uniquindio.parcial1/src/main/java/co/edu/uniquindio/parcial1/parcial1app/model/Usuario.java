package co.edu.uniquindio.parcial1.parcial1app.model;
import co.edu.uniquindio.parcial1.parcial1app.model.builder.UsuarioBuilder;

public class Usuario {

    private String nombre;
    private String cedula;
    private int edad;
    private double peso;
    VehiculoTransporte vehiculoAsociado;


    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    /*Constructor*/

    public Usuario() {
    }

    public Usuario(String nombre, String cedula, int edad, double peso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
