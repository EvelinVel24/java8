import java.util.Scanner;

public class Main {  // Esta clase debe estar en Main.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos del auto
        System.out.println("Ingrese la marca del auto:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese el color del auto:");
        String color = scanner.nextLine();
        System.out.println("Ingrese la velocidad máxima del auto:");
        int velocidadMaxima = scanner.nextInt();

        // Crear el objeto Auto
        Auto miAuto = new Auto(marca, modelo, color, velocidadMaxima);
        miAuto.mostrarInfo();  // Mostrar la información inicial del auto

        int opcion;
        do {
            // Menú interactivo
            System.out.println("\nSeleccione qué desea hacer:");
            System.out.println("1. Encender el auto");
            System.out.println("2. Apagar el auto");
            System.out.println("3. Acelerar el auto");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miAuto.encender();  // Intentar encender el auto
                    break;
                case 2:
                    miAuto.apagar();  // Intentar apagar el auto
                    break;
                case 3:
                    miAuto.acelerar();  // Intentar acelerar el auto
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

