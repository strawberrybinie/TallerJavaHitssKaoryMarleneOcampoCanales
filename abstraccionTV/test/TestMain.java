package test;

import clases.Desarrollador;
import clases.Empleado;
import clases.Gerente;
import clases.Vendedor;

public class TestMain {
    public static void main(String[] args) {
        
        /*
        * En una empresa existen distintos tipos de empleados.
        * Todos tienen nombre y salario pero el calculo de
        * bonificación es diferente según el tipo de empleado.
        * ==> Desarrollador - bonificación del 10% sobre el salario.
        * ==> Gerente - bonificación del 20% sobre su salario.
        * ==> Vendedor - bonificación del 5% sobre sus ventas.
        */

        Empleado gerente = new Gerente("Angel", 20000);
        Empleado dev = new Desarrollador("Kaory", 15000);
        Empleado vendedor = new Vendedor("Carlos", 6000, 4000);

        System.out.println("============ Gerente ===========");
        gerente.mostrarInfo();
        System.out.println("Bono: $" + gerente.calcularBono());

        System.out.println("============ Desarrollador ===========");
        dev.mostrarInfo();
        System.out.println("Bono: $" + dev.calcularBono());

        System.out.println("============ Vendedor ===========");
        vendedor.mostrarInfo();
        System.out.println("Bono: $" + vendedor.calcularBono());
    }
}
