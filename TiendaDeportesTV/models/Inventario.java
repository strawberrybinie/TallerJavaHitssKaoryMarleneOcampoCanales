package models;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class Inventario {
    private Map<String, Producto> productosPorSKU = new HashMap<>();
    private LinkedHashMap<String, Producto> productosPorInsercion = new LinkedHashMap<>();
    private TreeSet<Producto> productosPorNombre = new TreeSet<>();

    public boolean registrarProducto(Producto producto){
        if (productosPorSKU.containsKey(producto.getSku()))
            return false;
        productosPorSKU.put(producto.getSku(), producto);
        productosPorInsercion.put(producto.getSku(), producto);
        productosPorNombre.add(producto);
        return true;
    }

    public Producto consultarPorSKU(String sku) {
        return productosPorSKU.get(sku);
    }

    public Collection<Producto> reportePorInsercion() {
        return productosPorInsercion.values();
    }

    public Collection<Producto> reportePorNombre() {
        return productosPorNombre;
    }

    
    public boolean actualizarStock(String sku, String sucursal, int cantidad) {
        Producto producto = productosPorSKU.get(sku);
        if (producto == null) return false;
        producto.actualizarStock(sucursal, cantidad);
        return true;
    }

}
