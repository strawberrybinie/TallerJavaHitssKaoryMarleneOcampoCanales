package test;

import java.time.LocalDate;

import models.Cliente;
import models.Factura;
import models.Producto;

public class PruebaFacturacion {
    /*
     *   
     *      [[ Sistema de Facturación ]]
     *  Una empresa necesita manejar:
     *      - Clientes
     *      - Productos
     *      - Facturas
     *      - Ventas (lineas de factura)
     * 
     *  Y generar reportes como:
     *      1. Total de ventas por cliente
     *      2. Ventas en un rango de fechas
     *      3. Top 3 productos más vendidos
     *      4. Clientes con facturas vencidas
     *      5. Validar políticas (¿todos los clientes tienen email corporativo?)
     * 
     */

     Cliente c1 = new Cliente(1, "Kaory", "kaory@hitss.com");
     Cliente c2 = new Cliente(2, "Angel", "angel@hitss.com");
     Cliente c3 = new Cliente(3, "Miguel", "miguel@hitss.com");
     Cliente c4 = new Cliente(4, "Marlene", "marlene@hitss.com");
     Cliente c5 = new Cliente(5, "Dante", "dante@hitss.com");

    Producto p1 = new Producto(1, "Laptop", 12000);
    Producto p2 = new Producto(1, "Mouse", 250);
    Producto p3 = new Producto(1, "Teclado", 500);
    Producto p4 = new Producto(1, "Monitor", 3500);
    Producto p5 = new Producto(1, "Camara", 1500);

    Factura f1 = new Factura(1, c1, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 10), fl.agregarVenta(new Venta(p2, 4));
}