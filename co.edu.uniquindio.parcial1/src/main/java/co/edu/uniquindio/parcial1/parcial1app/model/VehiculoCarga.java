package co.edu.uniquindio.parcial1.parcial1app.model;

import co.edu.uniquindio.parcial1.parcial1app.model.builder.VehiculoCargaBuilder;

public class VehiculoCarga extends Vehiculo {
    private double capacidad;
    private int numeroEjes;


    public static VehiculoCargaBuilder builder() {
        return new VehiculoCargaBuilder();
    }

    /*Constructor*/

    public VehiculoCarga () {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, String numeroChasis, double capacidad, int numeroEjes) {
        super(placa, modelo, marca, color, numeroChasis);
        this.capacidad = capacidad;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidad=" + capacidad +
                ", numeroEjes=" + numeroEjes +
                "} " + super.toString();
    }
}
