package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Propietario;

public class PropietarioBuilder {

    protected String nombre;
    protected String identificacion;
    protected String email;
    protected String celular;

    public PropietarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropietarioBuilder identificacion(String identificacion) {
        this.identificacion = identificacion;
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