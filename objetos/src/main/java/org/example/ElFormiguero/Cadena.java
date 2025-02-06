package org.example.ElFormiguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa>listaProgramas;
    private Programa programa;

    public Cadena(String nombre){
        this.nombre=nombre;
        listaProgramas=new ArrayList<>();
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

    public void setListaProgramas(Programa programa) {
        listaProgramas.add(programa);
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public String toString(){
        return "Cadena: " + getNombre() + " | Programas: " + listaProgramas;
    }
}
