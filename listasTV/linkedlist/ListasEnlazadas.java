package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListasEnlazadas {
    public static void main(String[] args) {
        //Listas doblemente enlazadas
        List<String> personas = new LinkedList<>();
        personas.add("Kaory");
        personas.add("Angel");
        personas.add("Mizue");
        personas.add("Ameri");
        personas.add("Andrea");
        System.out.println("Lista de personas: " + personas);
        
        personas.add(3, "Paulina");
        System.out.println("Lista de personas: " + personas);

        System.out.println("Elemento eliminado: " + personas.remove(3));
        System.out.println("Lista de personas: " + personas);

        personas.set(3, "Fernando");
        System.out.println("Lista de personas: " + personas);

        System.out.println("Contiene: " + personas.contains("Angel"));
    }
}
