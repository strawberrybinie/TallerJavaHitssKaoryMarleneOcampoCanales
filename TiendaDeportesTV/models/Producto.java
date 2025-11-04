package models;

import java.util.Map;
import java.util.HashMap;

public class Producto implements Comparable<Producto> {
    private String sku;
    private String nombre;
    private String categoria;
    private Map<String, Integer> stockPorSucursal;

    public Producto(String sku, String nombre, String categoria) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stockPorSucursal = new HashMap<>();
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void actualizarStock(String sucursal, int cantidad){
        stockPorSucursal.put(sucursal, stockPorSucursal.getOrDefault(sucursal, 0) + cantidad);
    }

    public int getStock(String sucursal){
        return stockPorSucursal.getOrDefault(sucursal, 0);
    }

    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return "Producto -> [ SKU: " + sku +
         ", Nombre: " + nombre + 
         ", Categoría: " + categoria +
         ", Stock: " + stockPorSucursal + " ]";
    }
}
