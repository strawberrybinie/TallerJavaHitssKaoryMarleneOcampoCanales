import java.util.*;

public class Jugador implements Comparable<Jugador>{
    private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    public int compareTo(Jugador otro){
        return this. nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return "☑ ID: " + id + ", Nombre: " + nombre;
    }
    
}