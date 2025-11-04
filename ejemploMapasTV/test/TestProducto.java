package test;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Producto;

public class TestProducto {
    public static void main(String[] args) {
        //LinkedHashMap, mantiene el orden de inserción
        Map<String, Producto> inventario = new LinkedHashMap<>();
        
        //Agregar productos
        inventario.put("P001",
            new Producto("P001", "Laptop", 5));
        inventario.put("P005",
            new Producto("P005", "Celular", 2));
        inventario.put("P002",
            new Producto("P002", "Teclado", 7));

            TestProducto.imprimirMapa(inventario);

            //Actualizar un producto
            System.out.println("------- Actualizando producto P002");
            String codigo = "P002";
            if (inventario.containsKey(codigo)) {
                System.out.println("Nombre del producto: " + inventario.get(codigo).getDescripcion());
            }
            inventario.get("P002").setCantidad(10);
            TestProducto.imprimirMapa(inventario);

            //Eliminar producto
            System.out.println("Producto  eliminado: " + inventario.remove(codigo));
            TestProducto.imprimirMapa(inventario);

            inventario.put("P006",
                new Producto("P006", "Monitor", 2));
            System.out.println("--------- Despues de agregar un nuevo producto");
            TestProducto.imprimirMapa(inventario);
    }

    public static void imprimirMapa(Map<String, Producto> productos){
        for (Map.Entry<String, Producto> producto : productos.entrySet()) {
            System.out.println(producto.getKey() + " -> " + producto.getValue());
            }
    }
}