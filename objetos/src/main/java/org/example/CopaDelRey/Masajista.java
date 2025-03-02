package org.example.CopaDelRey;

public class Masajista extends MutxamelFC {

    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println(jugador.imprimirNombre() + " me ha dicho que le descarge el quadriceps.");
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajeando a los últimos jugadores antes de empezar...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("De camino en el Autobús hacia " + ciudad + " con todo el equipo.");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Vamos equipos que podemos!");
    }
}
