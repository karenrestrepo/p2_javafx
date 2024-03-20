package co.edu.uniquindio.parcial1.parcial1app.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    List<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    List<Propietario> listaPropietarios = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();


    /* Constructor*/

    public EmpresaTransporte() {
    }

    public boolean crearPropietario(String nombre,
                                    String cedula,
                                    String email,
                                    String celular,
                                    int edad) {
        Propietario propietarioEncontrado = obtenerPropietario(cedula);
        if (propietarioEncontrado == null) {
            Propietario propietario = getBuildPropietario(nombre, cedula, email, celular, edad);
            getListaPropietarios().add(propietario);
            return true;
        } else {
            return false;
        }

    }


    private  Propietario getBuildPropietario(String nombre, String cedula, String email, String celular, int edad) {
        return Propietario.builder()
                .nombre(nombre)
                .cedula(cedula)
                .email(email)
                .celular(celular)
                .edad(edad)
                .build();
    }

    private Propietario obtenerPropietario(String cedula) {
        Propietario propietario = null;

        for (Propietario propietario1 : getListaPropietarios()) {
            if (propietario1.getCedula().equalsIgnoreCase(cedula)) {
                propietario = propietario1;
                break;
            }
        }
        return propietario;
    }

    public boolean crearUsuario(String nombre,
                                String cedula,
                                int peso ,
                                int edad) {
        Usuario usuarioEncontrado = obtenerUsuario(cedula);
        if (usuarioEncontrado == null) {
            Usuario usuario = getBuildUsuario(nombre, cedula, peso, edad);
            getListaUsuarios().add(usuario);
            return true;
        } else {
            return false;
        }

    }


    private  Usuario getBuildUsuario(String nombre, String cedula, int peso, int edad) {
        return Usuario.builder()
                .nombre(nombre)
                .cedula(cedula)
                .peso(peso)
                .edad(edad)
                .build();
    }

    private Usuario obtenerUsuario(String cedula) {
        Usuario usuario = null;

        for (Usuario usuario1 : getListaUsuarios()) {
            if (usuario1.getCedula().equalsIgnoreCase(cedula)) {
                usuario = usuario1;
                break;
            }
        }
        return usuario;
    }


    public boolean crearVehiculoCarga(String placa, String modelo, String marca, String color, String numeroChasis, Double capacidad, int numeroEjes) {
        VehiculoCarga vehiculoCargaEncontrado = obtenerVehiculoCarga(placa);
        if (vehiculoCargaEncontrado == null) {
            VehiculoCarga vehiculoCarga = getBuildVehiculoCarga(placa, modelo, marca, color, numeroChasis, capacidad, numeroEjes);
            getListaVehiculosCarga().add(vehiculoCarga);
            return true;
        } else {
            return false;
        }

    }


    private  VehiculoCarga getBuildVehiculoCarga(String placa, String modelo, String marca, String color, String numeroChasis, Double capacidad, int numeroEjes) {
        return VehiculoCarga.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .numeroChasis(numeroChasis)
                .capacidad(capacidad)
                .numeroEjes(numeroEjes)
                .build();
    }

    private VehiculoCarga obtenerVehiculoCarga(String placa) {
        VehiculoCarga vehiculoCarga = null;

        for (VehiculoCarga vehiculoCarga1 : getListaVehiculosCarga()) {
            if (vehiculoCarga1.getPlaca().equalsIgnoreCase(placa)) {
                vehiculoCarga = vehiculoCarga1;
                break;
            }
        }
        return vehiculoCarga;
    }

    public boolean crearVehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis, int maximoPasajeros) {
        VehiculoTransporte vehiculoTransporteEncontrado = obtenerVehiculoTransporte(placa);
        if (vehiculoTransporteEncontrado == null) {
            VehiculoTransporte vehiculoTransporte = getBuildVehiculoTransporte(placa, modelo, marca, color, numeroChasis, maximoPasajeros);
            getListaVehiculosTransporte().add(vehiculoTransporte);
            return true;
        } else {
            return false;
        }

    }


    private VehiculoTransporte getBuildVehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis, int maximoPasajeros) {
        return VehiculoTransporte.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .numeroChasis(numeroChasis)
                .maximoPasajeros(maximoPasajeros)
                .build();
    }

    private VehiculoTransporte obtenerVehiculoTransporte(String placa) {
        VehiculoTransporte vehiculoTransporte = null;

        for (VehiculoTransporte vehiculoTransporte1 : getListaVehiculosTransporte()) {
            if (vehiculoTransporte1.getPlaca().equalsIgnoreCase(placa)) {
                vehiculoTransporte = vehiculoTransporte1;
                break;
            }
        }
        return vehiculoTransporte;
    }

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }

    /* Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(List<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String obtenerUsuariosMayoresEdad() {
        String resultado = "";

        for (Usuario usuario : getListaUsuarios()) {
            if (usuario.getEdad() >= 18) {
                resultado += usuario.toString();
            }
            else {
                resultado = "No hay ususarios mayores de edad";
            }

        }
        return resultado;
    }

}
