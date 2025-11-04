package test;

import clases.Cuenta;

public class testBanco {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Angel", 5000);
        Cuenta c2 = new Cuenta("Kaory", 5200);

        c1.depositar(200);
        c1.retirar(600);

        c2.depositar(3000);
        c2.retirar(2400);

        System.out.println("Información de las cuentas:");
        c1.mostrarInfo();
        c2.mostrarInfo();

        System.out.println("\nMostrar Transacciones:");
        c1.mostrarTransacciones();
        c2.mostrarTransacciones();
    }
}
