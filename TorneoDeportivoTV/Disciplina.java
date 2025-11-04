import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Disciplina {
    private String nombre;
    private Set<Jugador> jugadoresHashSet = new HashSet<>();
    private Set<Jugador> jugadoresLinkedHashSet = new LinkedHashSet<>();
    private Set<Jugador> jugadoresTreeSet = new TreeSet<>();
    
    public Disciplina(String nombre) {
        this.nombre = nombre;
    }

    public boolean registrarJugador(Jugador jugador){
        if (jugadoresHashSet.contains(jugador)) return false;
        jugadoresHashSet.add(jugador);
        jugadoresLinkedHashSet.add(jugador);
        jugadoresTreeSet.add(jugador);
        return true;
    }

    public boolean eliminarJugador(Jugador jugador){
        return  jugadoresHashSet.remove(jugador) &&
                jugadoresLinkedHashSet.remove(jugador) &&
                jugadoresTreeSet.remove(jugador);
    }

    public boolean estaInscrito (Jugador jugador){
        return jugadoresHashSet.contains(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Jugador> getJugadoresHashSet() {
        return jugadoresHashSet;
    }

    public Set<Jugador> getJugadoresLinkedHashSet() {
        return jugadoresLinkedHashSet;
    }

    public Set<Jugador> getJugadoresTreeSet() {
        return jugadoresTreeSet;
    }
       
}