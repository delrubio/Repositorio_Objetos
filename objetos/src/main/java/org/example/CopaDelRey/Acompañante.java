package org.example.CopaDelRey;

import lombok.Data;

@Data
public class Acompañante extends MutxamelFC{

    private Jugador jugador;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador jugador, String parentesco) {
        super(nombre, edad);
        this.jugador=jugador;
        this.parentesco=parentesco;
    }

    public void animarEquipo(){
        System.out.println("ANIMO!" + jugador.getCategoria());
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
        System.out.println("Vaya GOLAZO que ha marcado mi " + parentesco + " " + jugador.imprimirNombre());
    }
}
