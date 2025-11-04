package poo;

public class Automovil{
    //Atributos (public, private, protected, default)
    private String marca;
    private String color;
    private int ano;
    private Integer numPuertas = 4;

    
    //Constructor
    public Automovil(){}


    //Metodos de acceso (Getter & Setter)
    //Get
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }

    public Integer getNumPuertas() {
        return numPuertas;
    }

    //Set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPuertas(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }


    //Metodos de Logica o Comportamiento
    public void arrancar(){
        System.out.println("Brrrr brrrr brrrrrrr");
    }
}