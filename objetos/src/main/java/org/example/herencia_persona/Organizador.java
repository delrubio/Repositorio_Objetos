package org.example.herencia_persona;

public class Organizador extends Persona{

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol=rol;
    }
}
