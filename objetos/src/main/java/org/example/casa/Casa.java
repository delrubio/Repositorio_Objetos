package org.example.casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casa {

    Scanner teclado = new Scanner(System.in);
    private String direccion;
    private List<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el propietario: ");
        String nombre = teclado.next();
        System.out.println("Dime la edad: ");
        int edad = teclado.nextInt();
        propietario = new Propietario(nombre, edad);
    }

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion hab : habitaciones){
            if (hab.getNombre().equals(nombre)){
                System.out.println("Esta habitación ya existe. (" + nombre + ")");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(String nombre){
        for (Habitacion hab : habitaciones){
            if (hab.equals(nombre)){
                habitaciones.remove(hab);
                break;
            }
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones.");
        for (Habitacion hab : habitaciones){
            System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + "m2)");
        }
        System.out.println("Propietario: " + propietario);
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion aux = habitaciones.get(0);
        for (Habitacion hab : habitaciones){
            if (hab.getMetrosCuadrados()>aux.getMetrosCuadrados()){
                aux=hab;
            }
        }
        return aux;
    }
}
