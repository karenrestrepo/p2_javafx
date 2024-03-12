package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.builder.VehiculoCargaBuilder;

public class VehiculoCarga extends Vehiculo{

    private double capacidad;
    private int numeroEjes;


    public static VehiculoCargaBuilder builder(){
        return new VehiculoCargaBuilder();
    }

    /*Constructor*/

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidad, int numeroEjes) {
        super(placa, modelo, marca, color);
        this.capacidad = capacidad;
        this.numeroEjes = numeroEjes;
    }

    /*Getters and Setters*/

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidad=" + capacidad +
                ", numeroEjes=" + numeroEjes +
                "} " + super.toString();
    }
}
