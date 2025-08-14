import java.util.Scanner;

public class EjercicioCuatroRestaurante {
    public static void main(String[] args) {
        //Inicializamos valores
        Scanner sc = new Scanner(System.in);
        double totalVentas = 0.0;
        int opcion;

        do {
            //Muestra el menú de opciones
            System.out.println("\n~~~~~ Sistema ~~~~~~");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Tecleea el número de la opción deseada: ");
            
            //Valida que la entrada sea númerica
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, ingresa un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();


            //Menú, entra al caso especifico según la opción seleccionada
            switch (opcion) {
                
                //Entra si la opción seleccionada es 1
                case 1:
                    System.out.print("Ingresa el precio del pedido: ");
                    
                    /*while (!sc.hasNextDouble()) {
                        System.out.print("Por favor, ingresa un precio válido: ");
                        sc.next();
                    }
                    */
                    double precio = sc.nextDouble();
                    
                    //Validar que es un número positivo
                    if (precio > 0) {
                        totalVentas += precio;
                        System.out.println("Pedido registrado exitosamente.");
                    } else {
                        System.out.println("El precio debe ser positivo. Intenta nuevamente.");
                    }
                    break;

                //Entra si la opción seleccionada es 2
                case 2:
                    //Imprime el total de las ventas registradas
                    System.out.printf("El total de ventas es: $%.2f\n", totalVentas);
                    break;

                //Entra si la opción seleccionada es 3
                case 3:
                    //Muestra un mensaje de salida del sistema
                    System.out.println("Saliendo del sistema...");
                    break;

                //En caso de ingresar una opción que no este en el menú
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 3);
        
        sc.close();
    }
}
