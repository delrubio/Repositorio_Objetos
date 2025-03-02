package org.example.CopaDelRey;

import lombok.Data;

@Data
public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, int dorsal, String cat, String pos) {
        super(nombre, edad);
        this.dorsal=dorsal;
        setCategoria(cat);
        setPosicion(pos);
    }

    public void setCategoria(String cat){

        for (Equipos categoria1 : Equipos.values()){
            if (cat.toUpperCase().equals(categoria1.name())){
                categoria=categoria1;
            }
        }
    }

    public void setPosicion(String pos){

        for (Posiciones posiciones1 : Posiciones.values()){
            if (pos.toUpperCase().equals(posiciones1.name())){
                posicion=posiciones1;
            }
        }
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public Equipos getCategoria(){
        return categoria;
    }

    public void calentar(){
        System.out.println("Poniendome un peto para calentar...");
    }

    public void descansar(){
        System.out.println("Uf, necesito agua fría, que cansado estoy.");
    }

    public void marcarGol(){
        System.out.println("Regateo a uno, a otro y... chuto y... GOOOOL.");
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

    @Override
    public void entrenar() {
        System.out.println("Comenzamos el calentamiento apras entrenar a tope!");
    }

    @Override
    public void juagrPartido(String rival) {
        System.out.println("El partido de hoy es contra " + rival + ", vamos a darlo todo!");
    }

    @Override
    public String toString(){
        return "JUGADOR: " + this.imprimirNombre() + ", " + this.imprimirEdad() + " años, categoría " + categoria + ", dorsal " + dorsal + " y es " + posicion;
    }
}
