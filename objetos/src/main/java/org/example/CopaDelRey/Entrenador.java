package org.example.CopaDelRey;

public class Entrenador extends MutxamelFC{

    public static final String defFormacion = "4-3-3";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void concentrarse() {
        System.out.println("Atentos equipo, esto comienza...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("De camino en el Autobús hacia " + ciudad + " con todo el equipo.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Goooooool, vamos, vamos. Esto no ha terminado, seguimos así!");
    }
}
