package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.VehiculoTransporte;

public class VehiculoTransporteBuilder {

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected int maximopasajeros;


    public static VehiculoTransporteBuilder builder(){
        return new VehiculoTransporteBuilder();
    }


    public VehiculoTransporteBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoTransporteBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoTransporteBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoTransporteBuilder color(String color) {
        this.color = color;
        return this;
    }

    public VehiculoTransporteBuilder maximoPasajeros(int maximopasajeros) {
        this.maximopasajeros = maximopasajeros;
        return this;
    }

    public VehiculoTransporte build(){
        return new VehiculoTransporte(placa, modelo, marca, color, maximopasajeros);
    }
}
