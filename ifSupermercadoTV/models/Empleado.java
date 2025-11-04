package models;

public class Empleado {
    int id;
    public String nombre;
    String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }
}
