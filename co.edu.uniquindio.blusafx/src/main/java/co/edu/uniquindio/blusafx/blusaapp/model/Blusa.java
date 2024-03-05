package co.edu.uniquindio.blusafx.blusaapp.model;

public class Blusa {
    private String referencia;
    private String talla;
    private String color;
    private String tipoBlusa;
    private String diseno;
    private int altodiseno;
    private int anchodiseno;
    private String tipoAdorno;
    private int cantidadAdorno;

    public static BlusaBuilder builder(){
        return new BlusaBuilder();
    }

    /*Constructor*/

    public Blusa(String referencia,
                 String talla,
                 String color,
                 String tipoBlusa,
                 String diseno,
                 int altodiseno,
                 int anchodiseno,
                 String tipoAdorno,
                 int cantidadAdorno) {
        this.referencia = referencia;
        this.talla = talla;
        this.color = color;
        this.tipoBlusa = tipoBlusa;
        this.diseno = diseno;
        this.altodiseno = altodiseno;
        this.anchodiseno = anchodiseno;
        this.tipoAdorno = tipoAdorno;
        this.cantidadAdorno = cantidadAdorno;
    }

    public Blusa() {
    }

    /*Getters*/

    public String getReferencia() {
        return referencia;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getTipoBlusa() {
        return tipoBlusa;
    }

    public String getDiseno() {
        return diseno;
    }

    public int getAltodiseno() {
        return altodiseno;
    }

    public int getAnchodiseno() {
        return anchodiseno;
    }

    public String getTipoAdorno() {
        return tipoAdorno;
    }

    public int getCantidadAdorno() {
        return cantidadAdorno;
    }


    @Override
    public String toString() {
        return "Blusa{" +
                "referencia='" + referencia + '\'' +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", tipoBlusa='" + tipoBlusa + '\'' +
                ", diseno='" + diseno + '\'' +
                ", altodiseno=" + altodiseno +
                ", anchodiseno=" + anchodiseno +
                ", tipoAdorno='" + tipoAdorno + '\'' +
                ", cantidadAdorno=" + cantidadAdorno +
                '}';
    }
}
