package sintaxis;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Enteros ==> byte (Tió de referencia: Byte)
        byte enteroByte = 127;
        System.out.println("Byte: " + enteroByte);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);

        //Enteros ==> short (Tipo de referencia: Short)
        short enteroShort = 32767;
        System.out.println("Short: " + enteroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);

        //Enteros ==> int (Tipo de referencia: Integer)
        int entero = 3276;
        System.out.println("Int: " + entero);
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);

        //Enteros ==> long (Tipo de referencia: Long)
        long enteroLong = 2147483648l;
        System.out.println("Long: " + enteroLong);
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);

        //Punto flotante ==> float (Tipo de referencia: float)
        float numDecimal = 34.23E4F;
        System.out.println("Float: " + numDecimal);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);

        //Punto flotante ==> double (Tipo de referencia: Double)
        double numDoble = 34.23;
        System.out.println("Double: " + numDoble);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);

        //Caracteres ==> char (Tipo de referencia: Character)
        char caracter = 'c';
        System.out.println("Caracter: " + caracter);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        //Booleanos ==> boolean (Tipo de referencia: Boolean)
        boolean esValido = true;
        System.out.println("Boolean: " + esValido);
        System.out.println(Boolean.FALSE);

        //Tipo de referencia: Cadenas
        String nombre = "Kaory";
        System.out.println("Nombre Mayusculas: " + nombre.toUpperCase());
        System.out.println("Nombre: " + nombre);

        //Conversión de tipos
        int i = 100;
        System.out.println("Entero: " + i);
        double d = i;
        System.out.println("Double: " + d);
        //Conversión explicita
        int x = (int) d;
        System.out.println("Entero: " + x);
    }
}
