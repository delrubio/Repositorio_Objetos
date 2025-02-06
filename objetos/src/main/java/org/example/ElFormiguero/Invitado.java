package org.example.ElFormiguero;

import java.time.LocalDate;

public class Invitado {

    LocalDate fechaActual = LocalDate.now(); //cojo la decha de ahora
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre=nombre;
        this.profesion=profesion;
        setFecha_visita();
        this.temporada=temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesión() {
        return profesion;
    }

    public void setProfesión(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {
        fecha_visita = fechaActual;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString(){
        return "Invitado: " + getNombre() + " " + getProfesión() + " " + getFecha_visita() + " " + getTemporada();
    }
}
