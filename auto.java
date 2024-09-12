class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido = false;
    }

    public void encender() {
        if (encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra encendido");
        } else {
            encendido = true;
            System.out.println("Se ha encendido su auto");
        }
    }

    public void apagar() {
        if (!encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra apagado");
        } else {
            encendido = false;
            System.out.println("Se ha apagado su auto");
        }
    }

    public void acelerar() {
        if (!encendido) {
            System.out.println("No puede acelerar porque su auto está apagado");
        } else {
            System.out.println("El auto está acelerando...");
        }
    }

    public void mostrarInfo() {
        System.out.println("Felicidades por su nuevo auto.");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Encendido: " + encendido);
    }
}
