package org.example.ElFormiguero;

import java.util.ArrayList;

public class Cadena {

    private String nombre; //necesitamos que la cadena tenga un nombre si o si.
    private ArrayList<Programa>listaProgramas;//para poder tener registrados los programas
    private Programa programa;

    public Cadena(String nombre){//con el constructor solo necesito el nombre
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

    public void setListaProgramas(Programa programa) {//cuando en el Main le pongamos cadena.setListaprogramas añadimos
                                                    // a la lista un objeto de tipo Programa como puede ser programa1.
        listaProgramas.add(programa);
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {//para poder establecer un programa que quede constancia dentro de Cadena.
        this.programa = programa;
    }

    @Override
    public String toString(){
        return "Cadena: " + getNombre() + " | Programas: " + listaProgramas;
    }
}
