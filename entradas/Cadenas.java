package entradas;

public class Cadenas {
    public static void main(String[] args) {
        String nombre1 = "Kaory Marlene Ocampo Canales";
        String nombre2 = "Miguel Angel Casimiro Santos";
        String nombre3 = "   Kaory Marlene ocampo Canales   ";
        String nombre4 = "Miguel Angel hola Casimiro Santos hola Miguel Angel hola Casimiro Santos";

        System.out.println("length() n1: " + nombre1.length());
        System.out.println("length() n2: " + nombre2.length());
        System.out.println("(==): " + (nombre1 == nombre2));
        System.out.println("equals(): " + nombre1.equals(nombre3));
        System.out.println("equalsIgnoreCase(String b): " + nombre1.equalsIgnoreCase(nombre3));

        System.out.println("Nombre: " + nombre3);
        System.out.println("trim(): " + nombre3.trim());
        System.out.println("charAt(int i): " + nombre2.charAt(7));

        //Subcadenas
        System.out.println("substring(int a, int b): " + nombre4.substring(7, 9));
        System.out.println("substring(int a): " + nombre4.substring(8));

        System.out.println("indexOf(String cadena): " + nombre4.indexOf("hola"));
        System.out.println("lastIndexOf(String cadena): " + nombre4.lastIndexOf("hola"));

        System.out.println("startsWith(String prefijo): " + nombre4.startsWith("An"));
        System.out.println("endsWith(String sufijo): " + nombre4.endsWith("os"));
    }
}
