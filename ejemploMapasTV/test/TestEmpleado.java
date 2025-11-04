package test;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        //Crear HashMap donde la clave de cada elemento es el ID y el valor es un Empleado
        Map<Integer, Empleado> empleados = new HashMap<>();

        //Agregar empleados
        empleados.put(2, new Empleado(2, "Kaory Marlene", "TI"));
        empleados.put(5, new Empleado(5, "Angel Santos", "Construccion"));
        empleados.put(10, new Empleado(10, "Juan Lopez", "Ventas"));

        TestEmpleado.imprimirMapa(empleados);

        //Acceder a un elemento por su ID
        System.out.println("Buscar empleado con ID 5");
        System.out.println(empleados.get(5));

        //Verificar si existe un empleado
        int buscarId = 10;
        if (empleados.containsKey(buscarId))
            System.out.println("El empleado " + buscarId + ", si existe.");
        else
            System.out.println("El empleado " + buscarId + " no esta registrado");

        //Eliminar un empleado
        System.out.println("Empleado eliminado: " + empleados.remove(buscarId));
        empleados.put(12, new Empleado(12, "Noemi Garcia", "Gerencia"));
        TestEmpleado.imprimirMapa(empleados);
    }

    public static void imprimirMapa(Map<Integer, Empleado> empleados){
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " -> " + empleado.getValue());
            }
    }
}
