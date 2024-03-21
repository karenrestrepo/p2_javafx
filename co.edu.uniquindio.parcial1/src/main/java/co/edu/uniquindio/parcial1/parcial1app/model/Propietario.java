package co.edu.uniquindio.parcial1.parcial1app.model;

import co.edu.uniquindio.parcial1.parcial1app.model.builder.PropietarioBuilder;
import java.util.List;

public class Propietario {

    private String nombre;
    private String cedula;
    private String email;
    private int edad;
    private String celular;
    EmpresaTransporte ownedByEmpresaTransporte;
    Vehiculo vehiculoPrincipal;
    List<Vehiculo> listaVehiculosAsociados;

    public static PropietarioBuilder builder() {
        return new PropietarioBuilder();
    }

    /*Constructor*/

    public Propietario() {

    }

    public Propietario(String nombre, String cedula, String email, int edad, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getCelular() {
        return celular;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setOwnedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", celular='" + celular + '\'' +
                '}';
    }
}


