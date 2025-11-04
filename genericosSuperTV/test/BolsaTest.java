package test;

import entidades.Fruta;
import entidades.Lacteo;
import entidades.Limpieza;
import entidades.NoPerecible;

public class BolsaTest {
    public static void main(String[] args) {
        
        Lacteo[] bolsaLacteos = {
            new Lacteo("Leche", 25.5, 1, 8),
            new Lacteo("Yogurt", 18.0, 1, 5),
            new Lacteo("Queso", 45.0, 0, 10),
            new Lacteo("Crema", 30.0, 1, 6),
            new Lacteo("Kéfir", 22.0, 1, 7)
        };

        Fruta[] bolsaFrutas = {
            new Fruta("Manzana", 12.0, 0.3, "Rojo"),
            new Fruta("Plátano", 10.0, 0.25, "Amarillo"),
            new Fruta("Uva", 15.0, 0.2, "Morado"),
            new Fruta("Pera", 11.0, 0.35, "Verde"),
            new Fruta("Mango", 14.0, 0.5, "Amarillo")
        };

        
        Limpieza[] bolsaLimpieza = {
            new Limpieza("Detergente", 35.0, "Sulfatos", 1.5),
            new Limpieza("Jabón", 20.0, "Glicerina", 0.5),
            new Limpieza("Cloro", 18.0, "Hipoclorito", 1.0),
            new Limpieza("Desinfectante", 25.0, "Alcohol", 0.75),
            new Limpieza("Limpiador multiusos", 30.0, "Amoniaco", 1.2)
        };

        NoPerecible[] bolsaNoPerecibles = {
            new NoPerecible("Arroz", 22.0, 500, 350),
            new NoPerecible("Frijoles", 24.0, 400, 300),
            new NoPerecible("Lentejas", 20.0, 450, 320),
            new NoPerecible("Atún", 28.0, 150, 200),
            new NoPerecible("Sopa instantánea", 12.0, 100, 180)
        };

        System.out.println("=== Bolsa de Lacteos ===");
        for (Lacteo l : bolsaLacteos) {
            System.out.println("Nombre: " + l.getNombre() + ", Precio: " + l.getPrecio() +
                               ", Cantidad: " + l.getCantidad() + ", Proteínas: " + l.getProteinas());
        }

        
        System.out.println("\n=== Bolsa de Frutas ===");
        for (Fruta f : bolsaFrutas) {
            System.out.println("Nombre: " + f.getNombre() + ", Precio: " + f.getPrecio() +
                               ", Peso: " + f.getPeso() + ", Color: " + f.getColor());
        }

        System.out.println("\n=== Bolsa de Limpieza ===");
        for (Limpieza l : bolsaLimpieza) {
            System.out.println("Nombre: " + l.getNombre() + ", Precio: " + l.getPrecio() +
                               ", Componentes: " + l.getComponentes() + ", Litros: " + l.getLitros());
        }

        System.out.println("\n=== Bolsa de No Perecibles ===");
        for (NoPerecible np : bolsaNoPerecibles) {
            System.out.println("Nombre: " + np.getNombre() + ", Precio: " + np.getPrecio() +
                               ", Contenido: " + np.getContenido() + "g, Calorías: " + np.getCalorias());
        }

    }
}
