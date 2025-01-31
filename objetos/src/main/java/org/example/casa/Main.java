package org.example.casa;

public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 50);
        casa.agregarHabitacion("Cocina", 25);
        casa.agregarHabitacion("Baño", 40);

        casa.mostrarHabitaciones();

        System.out.println("La habitación más grande de la casa es: " + casa.getHabitacionMasGrande());

        casa.agregarHabitacion("Baño", 10);
        casa.agregarHabitacion("Garage", 70);
        casa.mostrarHabitaciones();

        casa.eliminarHabitacion("Cocina");
        casa.mostrarHabitaciones();
    }
}
