package models;

public class Cliente {
    int id;
    public String nombre;
    public String tipo;

    public Cliente(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }
}