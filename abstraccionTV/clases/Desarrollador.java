package clases;

public class Desarrollador extends Empleado{
    
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        // Desarrollador -> bonificación del 10% sobre el salario
        return salario * 0.10;
    }
}
