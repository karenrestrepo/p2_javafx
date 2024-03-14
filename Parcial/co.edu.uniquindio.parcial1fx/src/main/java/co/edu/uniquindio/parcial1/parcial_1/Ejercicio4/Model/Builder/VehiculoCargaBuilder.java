package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.VehiculoCarga;

public class VehiculoCargaBuilder {

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
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

    public VehiculoCargaBuilder capacidad(double capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public VehiculoCargaBuilder numeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
        return this;
    }

    public VehiculoCarga build(){
        return new VehiculoCarga(placa, modelo, marca, color, capacidad, numeroEjes);
    }
}
