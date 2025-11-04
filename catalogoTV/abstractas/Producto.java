package abstractas;

import interfaces.InterProducto;

public abstract class Producto implements InterProducto {
    protected int precio;
    
    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
