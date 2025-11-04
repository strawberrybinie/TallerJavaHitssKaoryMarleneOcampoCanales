package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import models.Cliente;
import models.Empleado;
import models.Producto;
import models.Venta;

public class TestSupermercado {
    //1. Filtrar productos con stock bajo (stock < 5)
    public static List<Producto> filtrarStockBajo(List<Producto> productos){
        Predicate<Producto> stockBajo = p -> p.stock < 5;
        return productos.stream().filter(stockBajo).collect(Collectors.toList());
    }

    //2. Calcular el total de una venta a partir de la lista de productos
    public static double calcularTotal(List<Producto> productos){
        Function<List<Producto>, Double> calcular = list -> list.stream().mapToDouble(p -> p.precio).sum();
        return calcular.apply(productos);
    }

    //3. Imprimir los detalles de una venta
    public static void imprimirVneta(Venta venta){
        Consumer<Venta> imprimir = v -> {
            System.out.println("Venta #" + v.id);
            System.out.println("Cliente: " + v.cliente.nombre);
            System.out.println("Empleado: " + v.empleado.nombre);
            System.out.println("Productos: ");
            v.productos.forEach(p -> System.out.println(" - " + p));
            System.out.println("Total: $" + v.total + " MXN");
        };
        imprimir.accept(venta);
    }

    //4.Generar un producto de muestra para pruebas
    public static Producto generarProductoMuestra() {
        Supplier<Producto> muestra = () -> new Producto(999, "Producto Muestra", 99.99, 10);
        return muestra.get();
    }

    //5. Aplicar un descuento del 10% a ún cliente
    public static Producto aplicarDescuento(Producto producto) {
        UnaryOperator<Producto> descuento = p -> new Producto(p.id, p.nombre, p.precio * 0.9, p.stock);
        return descuento.apply(producto);
    }

    //6. Comparar productos y devolver el más caro
    public static Producto productoMasCaro(Producto p1, Producto p2) {
        BinaryOperator<Producto> comparar = (a, b) -> a.precio > b.precio ? a : b;
        return comparar.apply(p1, p2);
    }

    //7. Verificar si el cliente puede acceder al descuento
    public static boolean puedeDescuento(Cliente cliente, double totalCompra) {
        BiPredicate<Cliente, Double> verificar = (c, t) -> c.tipo.equals("VIP") && t > 1000;
        return verificar.test(cliente, totalCompra);
    }

    //8. Generar tickets de venta
    public static void generarTicket(Venta venta) {
        BiConsumer<Cliente, Venta> ticket = (c, v) -> {
            System.out.println("=== TICKET DE VENTA ===");
            System.out.println("Cliente: " + c.nombre + " (" + c.tipo + ")");
            System.out.println("Total: $" + v.total);
            System.out.println("=======================");
        };
        ticket.accept(venta.cliente, venta);
    }    
    //9. Notificar al cliente
    public static void notificarCliente(Cliente cliente, Empleado empleado) {
        BiConsumer<Cliente, Empleado> notificar = (c, e) ->
            System.out.println("Hola " + c.nombre + ", tu compra fue procesada por " + e.nombre + ".");
        notificar.accept(cliente, empleado);
    }

    public static void main(String[] args) {
        
        Producto p1 = new Producto(1, "Leche", 25.0, 3);
        Producto p2 = new Producto(2, "Pan", 15.0, 10);
        Producto p3 = new Producto(3, "Queso", 50.0, 2);

        Cliente cliente = new Cliente(1, "Ana", "VIP");
        Empleado empleado = new Empleado(1, "Luis", "Cajero");

        List<Producto> productos = Arrays.asList(p1, p2, p3);
        Venta venta = new Venta(1, cliente, empleado, productos, 0);
   
        TestSupermercado.imprimirVneta(venta);
        TestSupermercado.generarTicket(venta);
        TestSupermercado.notificarCliente(cliente, empleado);

        System.out.println("Productos con stock bajo:");
        TestSupermercado.filtrarStockBajo(productos).forEach(System.out::println);

        System.out.println("Producto con descuento:");
        System.out.println(TestSupermercado.aplicarDescuento(p1));

        System.out.println("Producto más caro:");
        System.out.println(TestSupermercado.productoMasCaro(p1, p3));
    }

}