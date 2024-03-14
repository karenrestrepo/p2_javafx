package co.edu.uniquindio.parcial1fx.parcial1fx.ejercicio4.factory;

public class ModelFactory {

    private static ModelFactory modelFactory;

    /*Constructor*/
    private ModelFactory(){

    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
}
