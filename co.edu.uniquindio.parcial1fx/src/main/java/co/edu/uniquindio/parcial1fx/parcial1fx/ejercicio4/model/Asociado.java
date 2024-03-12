package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

public abstract class Asociado {

    private String nombre;
    private String identidicacion;
    private String email;
    private String celular;
    EmpresaTransporte ownedByEmpresaTransporte;
    private Vehiculo vehiculo;


    /*Constructor*/

    public Asociado() {
    }

    public Asociado(String nombre, String identidicacion, String email, String celular) {
        this.nombre = nombre;
        this.identidicacion = identidicacion;
        this.email = email;
        this.celular = celular;
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidicacion() {
        return identidicacion;
    }

    public void setIdentidicacion(String identidicacion) {
        this.identidicacion = identidicacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    public void setOwnedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", identidicacion='" + identidicacion + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
