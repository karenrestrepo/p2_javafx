package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;
import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String identificacion;
    protected String email;
    protected String celular;
    protected  int edad;

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder identidicacion(String identidicacion) {
        this.identificacion = identidicacion;
        return this;
    }

    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }

    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public Usuario build(){
        return new Usuario(nombre, identificacion, email, celular, edad);
    }
}
