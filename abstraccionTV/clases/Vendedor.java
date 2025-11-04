package clases;

public class Vendedor extends Empleado{

    public Vendedor(String nombre, double salario, double totalVentas) {
        super(nombre, salario);
        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularBono() {
        // Vendedor -> bonificación del 5% sobre sus ventas
        return totalVentas * 0.05;
    }
    
}
