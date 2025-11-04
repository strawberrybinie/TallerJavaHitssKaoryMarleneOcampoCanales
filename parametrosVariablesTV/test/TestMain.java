package test;

public class TestMain{
    public static int sumar(int ... numeros){
        int suma = 0;
        for(int n : numeros){
            suma += n;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar());
        System.out.println("Suma: " + sumar(3, 5, 10));
        System.out.println("Suma: " + sumar(54, 36, 49, 70, 2));
    }
}