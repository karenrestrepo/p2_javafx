package co.edu.uniquindio.parcial1.parcial1app.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private String numeroChasis;
    Propietario propietarioAsociado;
    List<Propietario> listaPropietariosAsociados = new ArrayList<>();


    /*Constructor*/

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color, String numeroChasis) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
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

    public void setModelo(String modelo) {
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
