package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.Propietario;

public class PropietarioBuilder {

    protected String nombre;
    protected String identificacion;
    protected String email;
    protected String celular;

    public PropietarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropietarioBuilder identidicacion(String identidicacion) {
        this.identificacion = identidicacion;
        return this;
    }

    public PropietarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PropietarioBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }



    public Propietario build(){
        return new Propietario(nombre, identificacion, email, celular);
    }
}