package entradas;

import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer número entero: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el segundo número entero: ");
        int num2 = entrada.nextInt();

        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        int resultado = 0;
        
        for (int i = 0; i < b; i++){
            resultado += a;
        }

        if (esNegativo) {
            resultado = -resultado;
        }

        System.out.println("El resultado es: " + resultado);
        entrada.close();
    }
}
