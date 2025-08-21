package ejercicios;

import java.util.Scanner;

public class EjercicioTresMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de n: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Error!, el valor debe ser un número entero positivo.");
            sc.close();
            return;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == j || i + j == n - 1) {
                    System.out.print("X");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}