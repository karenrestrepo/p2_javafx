package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Factory;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.EmpresaTransporte;

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
}
