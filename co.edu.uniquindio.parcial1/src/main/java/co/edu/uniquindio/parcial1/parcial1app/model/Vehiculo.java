package co.edu.uniquindio.parcial1.parcial1app.model;

import java.util.ArrayList;
import java.util.List;

/*Principio abierto / cerrado
* en caso de tener que agregar otro vehiculo, se crea una clase
* que extiende de vehículo y de esta forma está abierto a la
* extención y cerrado a la modificación*/

public abstract class Vehiculo {

    private String placa;
    private int modelo;
    private String marca;
    private String color;
    private String numeroChasis;
    EmpresaTransporte ownedByEmpresaTransporte;
    Propietario propietarioAsociado;
    List<Propietario> listaPropietariosAsociados = new ArrayList<>();


    /*Constructor*/

    public Vehiculo() {
    }

    public Vehiculo(String placa, int modelo, String marca, String color, String numeroChasis) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    public void setOwnedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public void setPropietarioAsociado(Propietario propietarioAsociado) {
        this.propietarioAsociado = propietarioAsociado;
    }

    public void setListaPropietariosAsociados(List<Propietario> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroChasis='" + numeroChasis + '\'' +
                '}';
    }
}
