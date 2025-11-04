package test;

import poo.Automovil;
import poo.Persona;

public class TestMain {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Persona p1 = new Persona();
        Persona p2 = new Persona("Angel");
        Persona p3 = new Persona(21);
        Persona p4 = new Persona("Kaory", 20);

        automovil.setMarca("Hyundai");
        automovil.setColor("Negro");
        automovil.setAno(2020);
        automovil.setNumPuertas(2);

        System.out.println("--------------------------");
        System.out.println("Marca: " + automovil.getMarca());
        System.out.println("Color: " + automovil.getColor());
        System.out.println("Año: " + automovil.getAno());
        System.out.println("Numero de Puertas: " + automovil.getNumPuertas());
        automovil.arrancar();
    }
}
