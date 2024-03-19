package co.edu.uniquindio.parcial1.parcial1app.model.builder;

import co.edu.uniquindio.parcial1.parcial1app.model.VehiculoCarga;

public class VehiculoCargaBuilder {

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected String numeroChasis;
    protected double capacidad;
    protected int numeroEjes;

    public VehiculoCargaBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoCargaBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoCargaBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoCargaBuilder color(String color) {
        this.color = color;
        return this;
    }

    public VehiculoCargaBuilder numeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
        return this;
    }

    public VehiculoCargaBuilder capacidad(double capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public VehiculoCargaBuilder numeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
        return this;
    }

    public VehiculoCarga build(){
        return new VehiculoCarga(placa, modelo, marca, color, numeroChasis, capacidad, numeroEjes);
    }
}
