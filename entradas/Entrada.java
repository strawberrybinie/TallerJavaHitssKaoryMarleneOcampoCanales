package entradas;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double estatura;
        long telefono;

        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingresa tu estatura: ");
        estatura = entrada.nextDouble();
        System.out.print("Ingresa tu telefono: ");
        telefono = entrada.nextLong();

        System.out.println("Tus datos son... " + nombre);
        System.out.println("Tienes " + edad + " años, mides " + estatura + "m y tu contacto es: " + telefono);
        entrada.close();
    }
}
