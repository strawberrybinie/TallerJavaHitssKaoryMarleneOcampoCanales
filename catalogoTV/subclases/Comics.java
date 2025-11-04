package subclases;

import java.sql.Date;
import interfaces.impl.Libro;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial,
            String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta(){
        return getPrecio() * 1.08;
    }
}
