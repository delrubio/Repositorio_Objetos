package org.example.CopaDelRey;

public class Jugador extends MutxamelFC{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void concentrarse() {
        System.out.println("¡Estamos todos en el vestuario ya concentrados!");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("De camino en el Autobús hacia " + ciudad + " con todo el equipo.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Que bueno que soy! Vamos que podemos ganar!");
    }
}
