package entidades;

/*
 * RECORD
 * - Inmutable por defecto
 * - Sintaxis reducido
 * - Se usan para modelos de datos
 * - Implementan automaticamente: Constructor, Getters (con nombre del campo),
 *   equals(), hasCode() y toString()
 * - Pueden tener metodos tradicionales, validaciones en el constructor,
 *   e interfaces implementadas
*/

public record Persona(String nombre, int edad) {
    public Persona{
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no debe ser menor o igual a cero.");
            //System.out.println("La edad no debe ser menor o igual a 0");
        }
    }

    public String mensaje(String cadena){
        return cadena;
    }
}
