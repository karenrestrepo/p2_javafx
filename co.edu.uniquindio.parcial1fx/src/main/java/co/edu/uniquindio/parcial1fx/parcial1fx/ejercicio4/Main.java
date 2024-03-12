package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4;

import co.edu.uniquindio.empresaTransporte.Model.*;
import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        crearObjeto();
       calcularTotalPasajeros();
    }

    private static void crearObjeto() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();

        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .placa("abc123")
                .modelo("2020")
                .marca("Mercedez")
                .color("Azul")
                .capacidad(80)
                .numeroEjes(12)
                .build();

        VehiculoCarga vehiculoCarga2 = VehiculoCarga.builder()
                .placa("def456")
                .modelo("2018")
                .marca("Mercedez")
                .color("Negro")
                .capacidad(40)
                .numeroEjes(6)
                .build();

        VehiculoTransporte vehiculoTransporte1 = VehiculoTransporte.builder()
                .placa("ghi789")
                .modelo("2003")
                .marca("Volvo")
                .color("Blanco")
                .maximoPasajeros(24)
                .build();

        VehiculoTransporte vehiculoTransporte2 = VehiculoTransporte.builder()
                .placa("jkl014")
                .modelo("2020")
                .marca("Volvo")
                .color("Blanco")
                .maximoPasajeros(40)
                .build();

        Propietario propietario1 = Propietario.builder()
                .nombre("Karen")
                .identidicacion("1005065")
                .email("karen@gmail.com")
                .celular("300489")
                .build();

        Propietario propietario2 = Propietario.builder()
                .nombre("Camilo")
                .identidicacion("1006158")
                .email("camilo@gmail.com")
                .celular("314589")
                .build();

        Usuario usuario1 = Usuario.builder()
                .nombre("Steven")
                .identidicacion("196065")
                .email("steven@gmail.com")
                .celular("311598")
                .maximoPasajeros(1)
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Ana")
                .identidicacion("194465")
                .email("ana@gmail.com")
                .celular("310998")
                .maximoPasajeros(2)
                .build();

        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculosPasajero().add(vehiculoTransporte1);
        empresaTransporte.getListaVehiculosPasajero().add(vehiculoTransporte2);
        empresaTransporte.getListaUsuarios().add(usuario1);
        empresaTransporte.getListaUsuarios().add(usuario2);
        

    }

    private static void calcularTotalPasajeros() {
        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte();
        vehiculoTransporte1.setMaximopasajeros(20);

        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();
        vehiculoTransporte2.setMaximopasajeros(30);

        List<VehiculoTransporte> vehiculoTransportes = new ArrayList<>();
        vehiculoTransportes.add(vehiculoTransporte1);
        vehiculoTransportes.add(vehiculoTransporte2);
        int[] viajesPorVehiculo = {6, 7};

        int totalPasajeros = calcularTotalPasajeros(vehiculoTransportes, viajesPorVehiculo);
    }

    private static int calcularTotalPasajeros(List<VehiculoTransporte> vehiculoTransportes, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculoTransportes.size(); i++) {
            totalPasajeros += vehiculoTransportes.get(i).getMaximopasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }


}