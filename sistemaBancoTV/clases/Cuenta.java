package clases;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private static int contador = 1;
    
    private  int id;
    private String titular;
    private double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(String titular, double depositoInicial){
        this.id = contador++;
        this.titular = titular;
        this.saldo = depositoInicial;
        this.transacciones = new ArrayList<>();

        if (depositoInicial > 0) {
            Transaccion t = new Transaccion("Deposito Inicial", depositoInicial, this);
            transacciones.add(t);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            Transaccion t = new Transaccion("Deposito", monto, this);
            transacciones.add(t);
        }
    }

    public boolean retirar (double monto){
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            Transaccion t = new Transaccion("Retiro", monto, this);
            transacciones.add(t);
            return true;
        } else{
            System.out.println("No hay saldo suficiente en la cuenta." + titular);
            return false;
        }
    }

    public void mostrarInfo(){
        System.out.println("Cuenta ID: " + id + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    public void mostrarTransacciones(){
        System.out.println("Historial de transacciones de " + titular + ": ");
        for (Transaccion t : transacciones) {
            System.out.println(t);
        }
        System.out.println();
    }
}