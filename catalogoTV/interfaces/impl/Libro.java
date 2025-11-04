package interfaces.impl;

import java.sql.Date;
import abstractas.Producto;
import interfaces.InterLibro;

public class Libro extends Producto implements InterLibro {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;
    
    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public double getPrecioVenta(){
        return getPrecio() * 1.05;
    }
}
