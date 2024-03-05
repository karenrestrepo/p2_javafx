package co.edu.uniquindio.blusafx.blusaapp.model;

public class BlusaBuilder {
    protected String referencia;
    protected String talla;
    protected String color;
    protected String tipoBlusa;
    protected String diseno;
    protected int altodiseno;
    protected int anchodiseno;
    protected String tipoAdorno;
    protected int cantidadAdorno;

    public BlusaBuilder referencia(String referencia){
        this.referencia = referencia;
        return this;
    }

    public BlusaBuilder talla(String talla){
        this.talla = talla;
        return this;
    }

    public BlusaBuilder color(String color){
        this.color = color;
        return this;
    }

    public BlusaBuilder tipoBlusa(String tipoBlusa){
        this.tipoBlusa = tipoBlusa;
        return this;
    }

    public BlusaBuilder diseno(String diseno){
        this.diseno = diseno;
        return this;
    }

    public BlusaBuilder altoDiseno(int altodiseno ){
        this.altodiseno = altodiseno;
        return this;
    }

    public BlusaBuilder anchoDiseno(int anchodiseno){
        this.anchodiseno = anchodiseno;
        return this;
    }

    public BlusaBuilder tipoAdorno(String tipoAdorno){
        this.tipoAdorno = tipoAdorno;
        return this;
    }

    public BlusaBuilder cantidadAdorno(int cantidadAdorno){
        this.cantidadAdorno = cantidadAdorno;
        return this;
    }

    public Blusa build() {
        return new Blusa(referencia, talla, color, tipoBlusa, diseno,
                altodiseno, anchodiseno, tipoAdorno,cantidadAdorno);
    }
}
