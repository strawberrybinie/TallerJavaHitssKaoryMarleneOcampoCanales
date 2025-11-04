package entradas;

import java.util.Scanner;

public class EjercicioDosArray {
    public static void main(String[] args) {
        int[] numeros;
        int[] frecuencia;
        Scanner sc = new Scanner(System.in);
        numeros = new int[10];
        frecuencia = new int[10];

        System.out.println("Ingrese 10 números ENTEROS entre 1 y 9");

        for(int i=0; i<10; i++){
            int tmp;
            do{ 
                System.out.println("Número " + ( i + 1 ) + ": ");
                tmp = sc.nextInt();

                if (tmp < 1 || tmp > 9) {
                    System.out.println("Solo números entre el 1 y el 9");
                }
            } while(tmp < 1 || tmp > 9);
                numeros[i] = tmp;
                frecuencia[tmp]++;
        }
        
        int maxOcurrencia = 1;
        int numMayor = frecuencia[1];

        for(int i = 2; i <= 9; i++){
            if (frecuencia[i] > maxOcurrencia) {
                maxOcurrencia = frecuencia[i];
                numMayor = i;
            }
        }

        System.out.println("Arreglo ingresado: ");
        for(int n : numeros){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Frecuencia de la ocurrencia: " + numMayor);
        System.out.println("El elemento que más se repite es: " + maxOcurrencia);

        sc.close();
    }
}