package test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import models.Empleado;
import models.Evaluacion;

public class EvaluacionTest {
    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
            new Empleado(1, "Kaory Marlene", "IT", 25000, 1, Arrays.asList(
                new Evaluacion(2023, 90), new Evaluacion(2024, 95))),
            new Empleado(2, "Angel Santos", "HR", 30000, 2, Arrays.asList(
                new Evaluacion(2023, 95), new Evaluacion(2024, 90))),
            new Empleado(3, "Ana Martinez", "RH", 35000, 4, Arrays.asList(
                new Evaluacion(2023, 85), new Evaluacion(2024, 90))),
            new Empleado(4, "Min Yoongi", "IT", 80000, 12, Arrays.asList(
                new Evaluacion(2023, 95), new Evaluacion(2024, 98))),
            new Empleado(5, "Graciela Fuentes", "Ventas", 20000, 2, Arrays.asList(
                new Evaluacion(2023, 80), new Evaluacion(2024, 83)))
        );

        System.out.println("1. Empleados del departamento de IT ordenados alfabeticamente");
        empleados.stream()
            .filter(e -> e.getDepartamento().equalsIgnoreCase("IT"))
            .sorted(Comparator.comparing(Empleado::getNombre))
            .forEach(System.out::println);
        
        System.out.println("\n2. Salario promedio por departamento");
        empleados.stream()
            .collect(Collectors.groupingBy(Empleado::getDepartamento,Collectors.averagingDouble(Empleado::getSalario)))
            .forEach((dept, prom) -> System.out.println(dept + ": " + prom));
        
        System.out.println("\n3. Empleado con mayor salario");
        empleados.stream()
            .max(Comparator.comparingDouble(Empleado::getSalario))
            .ifPresent(System.out::println);
        
        System.out.println("\n4. Empleados con >5 de experiencia y salario > $ 50,000");
        empleados.stream()
            .filter(e -> e.getExperiencia() > 5 && e.getSalario() > 50000)
            .forEach(System.out::println);

        System.out.println("\n5. Top 3 empleados con mejor puntaje en la ultima evaluación");
        int ultimoano = empleados.stream()
            .flatMap(e -> e.getEvaluaciones().stream())
            .mapToInt(Evaluacion::getAno).max().orElse(0);
        empleados.stream()
            .sorted((e1, e2) -> Integer.compare(
                e2.getEvaluaciones().stream()
                    .filter(ev -> ev.getAno() == ultimoano)
                    .findFirst().map(Evaluacion::getPuntaje).orElse(0),
                e1.getEvaluaciones().stream()
                    .filter(ev -> ev.getAno() == ultimoano)
                    .findFirst().map(Evaluacion::getPuntaje).orElse(0)))
            .limit(3).forEach(System.out::println);
        
        System.out.println("\n6. Cantidad de empleados con al menos una evaluación superior a 90 pts");
        long count = empleados.stream()
            .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
            .count();
        System.out.println(count);

        System.out.println("\n7. Ranking promedio de puntajes por empleado");
        empleados.stream()
            .map(e -> new AbstractMap.SimpleEntry<>(
                e.getNombre(), e.getEvaluaciones().stream()
                    .mapToInt(Evaluacion::getPuntaje).average().orElse(0)))
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach(entry -> System.out.printf("%s -> Promedio: %.2f%n", entry.getKey(), entry.getValue()));
    }
}
