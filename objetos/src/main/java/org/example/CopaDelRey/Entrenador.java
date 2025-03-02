package org.example.CopaDelRey;

import lombok.Data;

@Data
public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    public static final String DEF_FORMACION = "4-3-3";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo) {
        super(nombre, edad);
        formacionPreferida=DEF_FORMACION;
        this.equipo=equipo;
    }

    public Entrenador(String nombre, int edad, String formacionPreferida, Equipos equipo) {
        super(nombre, edad);
        this.formacionPreferida=formacionPreferida;
        this.equipo=equipo;
    }

    public void planificarEntrenamiento(){
        System.out.println("Venga chicos, toca posesión, máximo 2 toque por persona.");
    }

    public void hacerCambios(){
        System.out.println("Árbitro! Quiero hacer cambios.");
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

    @Override
    public void entrenar() {
        System.out.println("Hoy tengo un entreno duro al equipo " + equipo.name());
    }

    @Override
    public void juagrPartido(String rival) {
        System.out.println("El partido de hoy es contra " + rival + ", vamos a darlo todo!");
    }
}
