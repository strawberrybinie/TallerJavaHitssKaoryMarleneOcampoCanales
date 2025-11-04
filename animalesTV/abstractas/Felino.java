package abstractas;

public abstract class Felino extends Mamiferos {
    protected double tamGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamGarras, int velocidad) {
        super();
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    
    public double getTamGarras() {
        return tamGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
