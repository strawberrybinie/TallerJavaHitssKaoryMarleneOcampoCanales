package models;

import java.util.List;
import models.*;

public class Venta {
    public int id;
    public Cliente cliente;
    public Empleado empleado;
    public List<Producto> productos;
    public double total;

    public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos, double total) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = productos.stream().mapToDouble(p -> p.precio).sum();
    }
}