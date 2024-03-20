package co.edu.uniquindio.parcial1.parcial1app.factory;

import co.edu.uniquindio.parcial1.parcial1app.model.*;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private EmpresaTransporte empresaTransporte;



    /*Constructor*/
    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();

    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }


    private void inicializarDatos() {
        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .placa("abc123")
                .modelo("2020")
                .marca("Mercedez")
                .color("Azul")
                .numeroChasis("LJCPCBLCX11000237")
                .capacidad(80)
                .numeroEjes(12)
                .build();

        VehiculoCarga vehiculoCarga2 = VehiculoCarga.builder()
                .placa("def456")
                .modelo("2018")
                .marca("Mercedez")
                .color("Negro")
                .numeroChasis("LJCPCBLCX11000299")
                .capacidad(40)
                .numeroEjes(6)
                .build();

        VehiculoTransporte vehiculoTransporte1 = VehiculoTransporte.builder()
                .placa("ghi789")
                .modelo("2003")
                .marca("Volvo")
                .color("Blanco")
                .numeroChasis("YJCPCBLCX11000230")
                .maximoPasajeros(24)
                .build();

        VehiculoTransporte vehiculoTransporte2 = VehiculoTransporte.builder()
                .placa("jkl014")
                .modelo("2020")
                .marca("Volvo")
                .color("Blanco")
                .numeroChasis("YJCPCBLCX11000211")
                .maximoPasajeros(40)
                .build();

        Propietario propietario1 = Propietario.builder()
                .nombre("Karen")
                .cedula("1005065")
                .email("karen@gmail.com")
                .edad(23)
                .celular("300489")
                .build();

        Propietario propietario2 = Propietario.builder()
                .nombre("Camilo")
                .cedula("1006158")
                .email("camilo@gmail.com")
                .edad(41)
                .celular("314589")
                .build();

        Usuario usuario1 = Usuario.builder()
                .nombre("Steven")
                .cedula("196065")
                .edad(19)
                .peso(60)
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Ana")
                .cedula("194465")
                .edad(20)
                .peso(75)
                .build();

        Usuario usuario3 = Usuario.builder()
                .nombre("Esteban")
                .cedula("167895")
                .edad(60)
                .peso(80)
                .build();

        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte1);
        empresaTransporte.getListaVehiculosTransporte().add(vehiculoTransporte2);
        empresaTransporte.getListaUsuarios().add(usuario1);
        empresaTransporte.getListaUsuarios().add(usuario2);
        empresaTransporte.getListaUsuarios().add(usuario3);
        empresaTransporte.getListaPropietarios().add(propietario1);
        empresaTransporte.getListaPropietarios().add(propietario2);

        vehiculoTransporte1.getListaUsuariosAsociados().add(usuario1);
        vehiculoTransporte1.getListaUsuariosAsociados().add(usuario2);
        vehiculoTransporte2.getListaUsuariosAsociados().add(usuario3);
        vehiculoTransporte1.setPropietarioAsociado(propietario1);
        vehiculoCarga1.setPropietarioAsociado(propietario2);
        vehiculoTransporte2.getListaPropietariosAsociados().add(propietario1);
        vehiculoTransporte2.getListaPropietariosAsociados().add(propietario2);
        vehiculoCarga2.getListaPropietariosAsociados().add(propietario1);
        vehiculoCarga2.getListaPropietariosAsociados().add(propietario2);
    }

    public boolean crearPropietario(String nombre,
                                    String cedula,
                                    String email,
                                    String celular,
                                    int edad) {
        return empresaTransporte.crearPropietario(nombre, cedula, email, celular, edad);
    }

    public String obtenerUsuariosMayoresEdad(String edad) {
        return empresaTransporte.obtenerUsuariosMayoresEdad();
    }

    public boolean crearUsuario(String nombre,
                                String cedula,
                                int peso,
                                int edad) {
        return empresaTransporte.crearUsuario(nombre, cedula, peso, edad);
    }

    public boolean crearVehiculoCarga(String placa,
                                      String modelo,
                                      String marca,
                                      String color,
                                      String numeroChasis,
                                      Double capacidad,
                                      int numeroEjes) {
        return empresaTransporte.crearVehiculoCarga(placa, modelo, marca, color, numeroChasis, capacidad, numeroEjes);
    }

    public boolean crearVehiculoTransporte(String placa,
                                           String modelo,
                                           String marca,
                                           String color,
                                           String numeroChasis,
                                           int maximoPasajeros) {
        return empresaTransporte.crearVehiculoTransporte(placa, modelo, marca, color, numeroChasis, maximoPasajeros);
    }

    public int obtenerUsuariosMovilizados(String placa) {
        return empresaTransporte.obtenerUsuariosMovilizados(placa);
    }

    public int obtenerPropietarioMayorEdad() {
        return empresaTransporte.obtenerPropietarioMayorEdad();
    }
}
