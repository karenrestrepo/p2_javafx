package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder;
import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String identificacion;
    protected String email;
    protected String celular;
    protected  int maximoPasajeros;

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

    public UsuarioBuilder maximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
        return this;
    }

    public Usuario build(){
        return new Usuario(nombre, identificacion, email, celular, maximoPasajeros);
    }
}
