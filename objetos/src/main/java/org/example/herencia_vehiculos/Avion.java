package org.example.herencia_vehiculos;

public class Avion extends Vehiculo{

    private int alas;

    public Avion(String marca, String matricula, int alas) {
        super(marca, matricula);
        this.alas=alas;
    }

    @Override
    public void ruido(){
        System.out.println("FIUUMMMMMMM");
    }
}
