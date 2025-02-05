package org.example.ElFormiguero;

public class AppProgramas {
    public static void main(String[] args) {
        Programa programa1 = new Programa("El Hormiguero");

        System.out.println(programa1);

        programa1.agregarEmpleados("Prueba", "técnico");

        System.out.println(programa1);
    }
}