package sintaxis;

public class Operadores {
    public static void main(String[] args) {
        int a = 13, b = 5;
        //double c = 5.4;

        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicacion: " + (a*b));
        System.out.println("Division: " + a / b);
        System.out.println("Modulo: " + a % b);
        System.out.println("Expresión: " + (a + b * b / 2 % b - a));

        //Operadores de asignación
        a += b+2;
        System.out.println(a);
        a -= 5;
        a *= 2;
        a /= b;
        a %= 4;
        System.out.println(a);

        //Operadores relacionales o de comparación
        System.out.println("Igual: " + (a == b));
        System.out.println("Diferente: " + (a != b));
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Mayor o igual que : " + (a >= b));
        System.out.println("Menor o igual que: " + (a <= b));

        //Operadores lógicos
        System.out.println("AND: " + ((a != b) && (a <= b)));
        System.out.println("OR: " + ((a != b) || (a >= b)));
        System.out.println("NOT: " + (!(a != b)));

        //Operadores ++ y --
        int x= 5, y = 5;
        System.out.println("Pre incremento: " + (++x));
        System.out.println("Post incremento: " + (x++));
        System.out.println("X: " + x);
        System.out.println("Pre decremento: " + (--y));
        System.out.println("Post decremento: " + (y--));
        System.out.println("Y: " + y);
    }
}
