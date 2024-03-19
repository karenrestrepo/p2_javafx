package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.factory;

import co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.model.EmpresaTransporte;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private EmpresaTransporte empresaTransporte;



    /*Constructor*/
    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();

    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public boolean crearPropietario(String nombre,
                                    String identificacion,
                                    String email,
                                    String celular) {
        return empresaTransporte.crearPropietario(nombre, identificacion, email, celular);
    }

    public String obtenerUsuariosMayoresEdad(String edad) {
        return empresaTransporte.obtenerUsuariosMayoresEdad(Integer.parseInt(edad));
    }
}
