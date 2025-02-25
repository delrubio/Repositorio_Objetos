package org.example.CopaDelRey;

public class Acompañante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println("Suena el Himno!, ha llegado la hora de la verdad.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("De camino a " + ciudad + " para ver a mi " + parentesco + ".");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Vaya GOLAZO que ha marcado mi " + parentesco + " " + integrante.getNombre());
    }
}
