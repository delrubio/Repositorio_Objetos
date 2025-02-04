package org.example.ElFormiguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa>listaProgramas;

    public Cadena(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }
}
