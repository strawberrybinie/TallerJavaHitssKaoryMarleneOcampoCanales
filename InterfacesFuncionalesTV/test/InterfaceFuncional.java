package test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfaceFuncional {
    public static void main(String[] args) {
        //Predicate<T>  ->  recibe un argumento tipo T, devuelve un booleano
        //Uso: Validaciones o filtros
        Predicate<String> longitud = s -> s.length() > 5;
        System.out.println(longitud.test("Hola"));
        System.out.println(longitud.test("Programacion"));

        //Function<T, R>  ->  recibe un argumento tipo T, devuelve un valor de tipo R
        //Uso: Mapear objetos a otros tipos  ->  DTO's a entidades
        Function<String, Integer> tam = s -> s.length();
        System.out.println("Longitud: " + tam.apply("Angel Santos"));

        //Consumer<T>  ->  recibe un argumento de tipo T, no devuelve nada
        //Uso: imprimir, guardar en log, etc.
        Consumer<String> mayusculas = s -> System.out.println(s.toUpperCase());
        List<String> nombres = List.of("Kaory", "Angel", "Paulina", "Andrea");
        nombres.forEach(mayusculas);

        //Supplier<T>  ->  No recibe argumentos y devuelve un valor de tipo T
        //Uso: Genera valores bajo demanda, generar ID
        Supplier<Integer> numero = () -> new Random().nextInt(100);
        System.out.println("Numero aleatorio: " + numero.get());
        System.out.println("Numero Aleatorio: " + numero.get());
        Supplier<String> codigo = () -> UUID.randomUUID().toString();
        System.out.println("ID: " + codigo.get());
        System.out.println("ID: " + codigo.get());
        System.out.println("ID: " + codigo.get());

        //BiPredicate<T, U>  ->  recibe dos argumentos (T, U), devuelve un booleano
        //Uso: Validaciones con dos entradas
        BiPredicate<String, Integer> evaluarCadena = (s, l) -> s.length() > l;
        System.out.println(evaluarCadena.test("Hola", 5));
        System.out.println(evaluarCadena.test("Programación", 10));

        //BiFunction<T, U, R>  ->  recibe dos argumentos (T, U), devuelve un valor tipo R
        //Uso: Operaciones matematicas, commbinación de objetos
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        System.out.println("Multiplicación: " + mul.apply(6, 10));

        //BiConsume<T, U>  ->  recibe dos argumentos (T, U). No devuelve nada
        //Uso: Operaciones con Map(Clave, valor)
        BiConsumer<String, Integer> imprimir = (k, v) -> System.out.println(k + " tiene edad: " + v);
        Map<String, Integer> personas = Map.of("Kaory", 20, "Angel", 21, "Fernando", 23, "Yoongi", 32);
        personas.forEach(imprimir);

        //UnaryOperator, BinaryOperator  ->  son especiales de Function
        UnaryOperator<Integer> cuadrado = x -> x * x;
        System.out.println("Cuadrado: " + cuadrado.apply(5));
    }
}
