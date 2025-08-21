package entradas;

import java.util.Scanner;

public class EjercicioTresNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double contUno = 0, contReprobada = 0, contAprobada = 0, sumAprobada = 0, sumReprobada = 0, sumTotal = 0;
        boolean error = false;

        for(int i = 0 ; i <= 20; i++){
            System.out.println("Ingrese la nota: ");
            double nota = sc.nextDouble();
            
            if (nota < 1.0 || nota > 10.0) {
                System.out.println("Error! No puedes ingresar una nota que no este entre el rango de 1.0 y 10.0");
                error = true;
                break;
            }

            if (nota == 1) {
                contUno++;
            }

            if (nota >= 6.0) {
                sumAprobada += nota;
                contAprobada++;
            }else{
                sumReprobada += nota;
                contReprobada++;
            }
            sumTotal += nota;
       }
       
       if (!error) {
        System.out.println("Resultados: ");
        if (contAprobada > 0) {
            System.out.println("Promedio de aprobados (6 ó +): " + (sumAprobada / contAprobada));
        }else{
            System.out.println("No hay aprobados");
        }

        if (contReprobada > 0) {
            System.out.println("Promedio de Reprobados (6 ó -): " + (sumReprobada / contReprobada));
        }else{
            System.out.println("No hubo reprobados");
        }

        System.out.println("Notas iguales a 1: " + contUno);
        System.out.println("Promedio total de las notas: " + (sumTotal / (contAprobada+contReprobada+contUno)));
       }
       sc.close();
    }
}