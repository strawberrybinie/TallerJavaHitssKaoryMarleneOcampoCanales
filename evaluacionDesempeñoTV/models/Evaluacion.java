package models;

public class Evaluacion {
    private int ano;
    private int puntaje;

    public Evaluacion(int ano, int puntaje) {
        this.ano = ano;
        this.puntaje = puntaje;
    }

    public int getAno() {
        return ano;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Evaluacion => [ Año - " + ano + "  |  Puntaje: " + puntaje + " ]";
    }
}
