package entradas;

import java.util.Scanner;

public class EjercicioDosBucleFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;

        System.out.println("Ingresa la cantidad de números a comparar (minímo 10): ");
        cantidad = entrada.nextInt();

        while(cantidad < 10){
            System.out.println("Deben ser minimo 10 valores, intente de nuevo: ");
            cantidad = entrada.nextInt();
        }

        int menor = Integer.MAX_VALUE;

        for(int i=1; i < cantidad; i++){
            System.out.println("Ingrese el número: ");
            int num = entrada.nextInt();

            if (num < menor) {
                menor = num;
            }
        }

        if(menor < 10){
            System.out.println("El número menor es menor a 10");
        }else{
            System.out.println("El número menor es igual o mayor a 10");
        }
        entrada.close();
    }
}
