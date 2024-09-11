// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los detalles del auto
        System.out.println("Ingrese la marca del auto:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese el color del auto:");
        String color = scanner.nextLine();
        System.out.println("Ingrese la velocidad máxima del auto:");
        int velocidadMaxima = scanner.nextInt();

        // Crear la instancia del auto
        Auto miAuto = new Auto(marca, modelo, color, velocidadMaxima);

        // Mostrar detalles del auto
        miAuto.mostrarDetalles();

        // Menú que se repite hasta que el usuario elija salir
        int opcion;
        do {
            System.out.println("\nSeleccione qué desea hacer:");
            System.out.println("1. Encender el auto");
            System.out.println("2. Apagar el auto");
            System.out.println("3. Acelerar el auto");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miAuto.encender();
                    break;
                case 2:
                    miAuto.apagar();
                    break;
                case 3:
                    miAuto.acelerar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
