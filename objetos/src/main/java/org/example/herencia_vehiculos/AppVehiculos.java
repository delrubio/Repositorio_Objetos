package org.example.herencia_vehiculos;

public class AppVehiculos {
    public static void main(String[] args) {
        Avion airbus = new Avion("Boeing", "12345F", 4);
        airbus.mostrarInfo();

        Tren ave = new Tren("ave", "649667A",8);
        ave.mostrarInfo();

    }
}
