package test;

import java.sql.Date;

import interfaces.InterProducto;
import interfaces.impl.Libro;
import subclases.Comics;
import subclases.TvLcd;
import subclases.iPhone;

public class CatalogoTest {
    public static void main(String[] args) {
        InterProducto[] productos = new InterProducto[6];

        productos[0] = new iPhone(26000, "Apple", "iPhone 16", "Blanco");
        productos[1] = new TvLcd(40000, "Sony", 40);
        productos[2] = new TvLcd(25000, "Samsung", 32);
        productos[3] = new Libro(450, new Date(2025, 03, 18), "Susan Collins", "Amanecer en la Cosecha", "Molino");
        productos[4] = new Libro(340, new Date(2015, 12, 06), "Toshikazu Kawaguchi", "Antes de que el café se enfríe", "DeBolsillo");
        productos[5] = new Comics(159, new Date(2025, 10, 02), "Kaare Andrews", "Spiderman Reign 2", "Marvel Comics", "Spiderman");

        for(InterProducto p : productos){
            System.out.println("Precio Base: $" + p.getPrecio());
            System.out.println("Precio Venta: $" + p.getPrecioVenta());
            System.out.println("--------------------------------");
        }
    }
}
