import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TorneoDeportivo {
    private static Map<String, Disciplina> disciplinas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDisciplinas();
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer
            switch (opcion) {
                case 0 -> registrarNuevoJugador();
                case 1 -> mostrarJugadoresPorDeporte();
                case 2 -> contarJugadores();
                case 3 -> fusionarEquipos();
                case 4 -> jugadoresEnComun();
                case 5 -> transferirJugador();
                case 6 -> mostrarOrdenadosPorNombre();
                case 7 -> mostrarOrdenInscripcion();
                case 8 -> mostrarRankingPorID();
                case 9 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 9);
    }

private static void inicializarDisciplinas() {
        disciplinas.put("futbol", new Disciplina("Fútbol"));
        disciplinas.put("basquetbol", new Disciplina("Básquetbol"));
        disciplinas.put("voleibol", new Disciplina("Voleibol"));
    }

    private static void mostrarMenu() {
        System.out.println("""
            \n ────୨ৎ MENÚ DEL TORNEO ୨ৎ────
            0. Registrar nuevo jugador
            1. Mostrar jugadores por deporte
            2. Contar jugadores en cada disciplina
            3. Fusionar equipos (fútbol + básquetbol)
            4. Ver jugadores en común (fútbol y básquetbol)
            5. Transferir jugador de un deporte a otro
            6. Mostrar todos los jugadores ordenados por nombre
            7. Mostrar todos los jugadores en orden de inscripción
            8. Mostrar ranking de jugadores por ID
            9. Salir
            Selecciona una opción:
        """);
    }

    
    private static Jugador crearJugadorDesdeInput() {
        System.out.print("ID del jugador: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre del jugador: ");
        String nombre = scanner.nextLine();
        return new Jugador(id, nombre);
    }

    private static void mostrarJugadoresPorDeporte() {
        for (Disciplina d : disciplinas.values()) {
            System.out.println("\n" + d.getNombre() + ":");
            for (Jugador j : d.getJugadoresHashSet()) {
                System.out.println(j);
            }
        }
    }

    
    private static void contarJugadores() {
        for (Disciplina d : disciplinas.values()) {
            System.out.println(d.getNombre() + ": " + d.getJugadoresHashSet().size() + " jugadores");
        }
    }

    private static void fusionarEquipos() {
        Set<Jugador> fusion = new HashSet<>(disciplinas.get("futbol").getJugadoresHashSet());
        fusion.addAll(disciplinas.get("basquetbol").getJugadoresHashSet());
        System.out.println("Jugadores fusionados (Fútbol + Básquetbol):");
        fusion.forEach(System.out::println);
    }

    
    private static void jugadoresEnComun() {
        Set<Jugador> comun = new HashSet<>(disciplinas.get("futbol").getJugadoresHashSet());
        comun.retainAll(disciplinas.get("basquetbol").getJugadoresHashSet());
        System.out.println("Jugadores en común entre Fútbol y Básquetbol:");
        comun.forEach(System.out::println);
    }

    
    private static void transferirJugador() {
        System.out.println("Transferencia de Básquetbol a Fútbol:");
        Jugador jugador = crearJugadorDesdeInput();
        if (disciplinas.get("basquetbol").eliminarJugador(jugador)) {
            disciplinas.get("futbol").registrarJugador(jugador);
            System.out.println("Transferencia exitosa.");
        } else {
            System.out.println("Jugador no encontrado en Básquetbol.");
        }
    }

    
    private static void mostrarOrdenadosPorNombre() {
        TreeSet<Jugador> todos = new TreeSet<>();
        for (Disciplina d : disciplinas.values()) {
            todos.addAll(d.getJugadoresTreeSet());
        }
        System.out.println("Jugadores ordenados por nombre:");
        todos.forEach(System.out::println);
    }

    private static void mostrarOrdenInscripcion() {
        LinkedHashSet<Jugador> todos = new LinkedHashSet<>();
        for (Disciplina d : disciplinas.values()) {
            todos.addAll(d.getJugadoresLinkedHashSet());
        }
        System.out.println("Jugadores en orden de inscripción:");
        todos.forEach(System.out::println);
    }

    
    private static void mostrarRankingPorID() {
        TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        for (Disciplina d : disciplinas.values()) {
            ranking.addAll(d.getJugadoresHashSet());
        }
        System.out.println("Ranking de jugadores por ID:");
        ranking.forEach(System.out::println);
    }

    private static void registrarNuevoJugador(){
        System.out.println("Ingresa el deporte (futbol, basquetbol, voleibol): ");
        String disciplinaNombre = scanner.nextLine().toLowerCase();

        Disciplina disciplina = disciplinas.get(disciplinaNombre);
        if (disciplina == null) {
            System.out.println("Disciplina no válida");
            return;
        }

        Jugador nuevoJugador = crearJugadorDesdeInput();
        if (disciplina.registrarJugador(nuevoJugador)) {
            System.out.println("Jugador registrado exítosamente en " + disciplina.getNombre());
        } else {
            System.out.println("El jugador ya esta inscrito en esta disciplina.");
        }
    }

}
