package org.example.CopaDelRey;

import lombok.Data;

@Data
public abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String imprimirNombre(){
        return nombre;
    }

    public int imprimirEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
}
