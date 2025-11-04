package test;

import java.util.Scanner;
import models.Producto;
import models.Inventario;

public class TestTiendaDeportes {
    private static Inventario inventario = new Inventario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do{
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> registrarProducto();
                case 2 -> consultarProducto();
                case 3 -> reporteInsercion();
                case 4 -> reporteAlfabetico();
                case 5 -> actualizarStock();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    
    private static void mostrarMenu() {
        System.out.println("""
            \n--- MENÚ DE INVENTARIO ---
            1. Registrar producto
            2. Consultar producto por SKU
            3. Reporte por orden de inserción
            4. Reporte ordenado por nombre
            5. Actualizar stock
            6. Salir
            Selecciona una opción:
        """);
    }

    private static void registrarProducto() {
        System.out.print("SKU: ");
        String sku = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Categoría: ");
        String categoria = scanner.nextLine();
        
        Producto producto = new Producto(sku, nombre, categoria);
        if (inventario.registrarProducto(producto)) {
            System.out.println("Producto registrado exitosamente.");
        } else {
            System.out.println("Ya existe un producto con ese SKU.");
        }
    }

    private static void consultarProducto() {
        System.out.print("SKU del producto: ");
        String sku = scanner.nextLine();
        Producto producto = inventario.consultarPorSKU(sku);
        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    
    private static void reporteInsercion() {
        System.out.println("Reporte por orden de inserción:");
        for (Producto p : inventario.reportePorInsercion()) {
            System.out.println(p);
        }
    }

    private static void reporteAlfabetico() {
        System.out.println("Reporte ordenado por nombre:");
        for (Producto p : inventario.reportePorNombre()) {
            System.out.println(p);
        }
    }

    
    private static void actualizarStock() {
        System.out.print("SKU del producto: ");
        String sku = scanner.nextLine();
        System.out.print("Sucursal: ");
        String sucursal = scanner.nextLine();
        System.out.print("Cantidad a agregar (puede ser negativa): ");

        int cantidad = scanner.nextInt();
        scanner.nextLine();

        if (inventario.actualizarStock(sku, sucursal, cantidad)) {
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

}
