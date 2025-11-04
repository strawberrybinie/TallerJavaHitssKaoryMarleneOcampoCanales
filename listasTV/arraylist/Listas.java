package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import modelos.Persona;

public class Listas {
    public static void main(String[] args) {
        List<String> empleados = new ArrayList<>();
        List<String> nuevosEmpleados = new ArrayList<>();
        empleados.add("Eloy");
        empleados.add("Angel");
        empleados.add("Kaory");
        empleados.add("Mizue");
        System.out.println("Lista de empleados: " + empleados);
        empleados.add(4, "Pedro");
        System.out.println("Lista de empleados: " + empleados);
        empleados.addFirst("Juan");
        System.out.println("Lista de empleados: "+ empleados);

        empleados.addAll(nuevosEmpleados);
        System.out.println("Lista de nuevos empelados: " + nuevosEmpleados);

        //Modificar un elemento de la lista
        System.out.println("Total: " + empleados.size());
        System.out.println("Valor modificado: " + empleados.set(2, "Ameri"));
        System.out.println(empleados);

        //Eliminar un elemento de la lista
        System.out.println("Elemento eliminado: " + empleados.remove(4));
        System.out.println("Lista de empleados: " + empleados);
        System.out.println("Elemento eliminado: " + empleados.remove("Juan"));
        System.out.println("Lista de empleados: " + empleados);

        //Obtener un elemento de forma directa
        System.out.println("Elemento: " + empleados.get(1));

        //Iteraciones
        empleados.add(3, "Andrea");
        System.out.println("Lista de empleados: " + empleados);

        System.out.println("-----------| Utilizando iteradores |-----------");
        //List, Set y Map
        var iterador = empleados.iterator();
        while (iterador.hasNext()) {
            //System.out.println("Elemento: " + iterador.next());
            if (iterador.next().equals("Kaory")) {
                iterador.remove();
            }
        }
        System.out.println("Lista de empleados: " + empleados);

        System.out.println("Después del primer recorrido del iterador...");
        while (iterador.hasNext()) {
            System.out.println("Elemento: " + iterador.next());
        }

        //List
        System.out.println("-----------| ListIterator |-----------");
        ListIterator<String> listIterator = empleados.listIterator();
        System.out.println("Recorrer de inicio a fin");
        while (listIterator.hasNext()) {
            System.out.println("Indice: " + listIterator.nextIndex());
            System.out.println("Elemento: " + listIterator.next());
        }

        System.out.println("Recorrer del final al inicio");
        while (listIterator.hasPrevious()) {
            System.out.println("Indice: " + listIterator.previousIndex());
            System.out.println("Elemento: " + listIterator.previous());
        }
        listIterator.add("Kaory");
        System.out.println(empleados);


        //Ordenamiento
        Collections.sort(empleados);
        System.out.println(empleados);

        List<Integer> enteros = new ArrayList<>();
        enteros.add(45);
        enteros.add(15);
        enteros.add(25);
        enteros.add(5);
        enteros.add(55);
        System.out.println(enteros);
        Collections.sort(enteros);
        System.out.println(enteros);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Kaory", 20));
        personas.add(new Persona(2, "Angel", 21));
        personas.add(new Persona(3, "Eloy", 40));
        personas.add(new Persona(4, "Mizue", 1));
        personas.add(new Persona(5, "Dante", 14));
        personas.add(new Persona(6, "Fernando", 22));
        System.out.println("------------| Lista de personas antes de ordenar |------------");
        //System.out.println(personas);
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
        Collections.sort(personas);
        System.out.println("------------| Lista después de ordenar |------------");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
