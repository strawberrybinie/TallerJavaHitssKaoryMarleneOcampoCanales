package test;

import clases.Producto;
import clases.Venta;

public class TestMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche Santa Clara 1L", 30.5);
        Producto p2 = new Producto("Galletas Marias Gamesa 30g", 12.35);
        Producto p3 = new Producto("Pan Bimbo", 36.1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();
        Venta v1 = new Venta(p1, 2);
        Venta v2 = new Venta(p1, 3);
        Venta v3 = new Venta(new Producto("Refresco Cocacola 600ml", 20.0), 4);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}