package clases;

public class Transaccion {
    public static int contadorTransaccion = 1;
    private int id;
    private String tipo;
    private double monto;
    private Cuenta cuenta;
    
    public Transaccion(String tipo, double monto, Cuenta cuenta){
        this.id = contadorTransaccion++;
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Transacción ID: " + id + " | Tipo: " + tipo + " | Monto: " + monto + " | Cuenta ID: " + cuenta.getId();
    }

    
}
