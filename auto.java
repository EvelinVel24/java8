// Auto.java
public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    // Constructor
    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido = false; // El auto comienza apagado
    }

    // Método para encender el auto
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Se ha encendido su auto");
        } else {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra encendido");
        }
    }

    // Método para apagar el auto
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Se ha apagado su auto");
        } else {
            System.out.println("No se puede realizar esta acción porque su auto ya está apagado");
        }
    }

    // Método para acelerar el auto
    public void acelerar() {
        if (encendido) {
            System.out.println("El auto está acelerando.");
        } else {
            System.out.println("El auto está apagado, no puede acelerar.");
        }
    }

    // Método para mostrar los detalles del auto
    public void mostrarDetalles() {
        System.out.println("Felicidades por su nuevo auto.");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Encendido: " + encendido);
    }
}


