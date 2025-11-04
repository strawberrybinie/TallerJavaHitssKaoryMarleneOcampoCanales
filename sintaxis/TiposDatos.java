package sintaxis;

public class TiposDatos {
    static String nombre;
    static boolean esValido;
    public static void main(String[] args) {
        int edad = 20;
        System.out.println("Edad: " + edad);
        //TiposDatos objeto = new TiposDatos();
        //objeto.saludar();
        saludar();
    }

    public static void saludar(){
        int edad = 40;
        nombre = "Kaory";
        System.out.println("Edad en metodo: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Es valido: " + esValido);
    }
}
