package subclases;

import abstractas.Electronico;

public class iPhone extends Electronico {
    private String modelo;
    private String color;

    public iPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }

    public double getPrecioVenta(){
        return getPrecio() * 1.15;
    }
}
