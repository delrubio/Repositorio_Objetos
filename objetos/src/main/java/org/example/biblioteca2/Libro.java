package org.example.biblioteca2;

import lombok.Data;

@Data
public class Libro {

    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int anyoPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anyoPublicacion=anyoPublicacion;
        disponible=true;
    }

    public void prestarLibro(){
        disponible=false;
    }

    public void devolverLibro(){
        disponible=true;
    }

    public String mostrarInformacion(){
        return "Título del Libro: " + getTitulo() + ", autor: " + getAutor() + (disponible==true ? ", está disponible" : ", no está disponible."  + " | " + anyoPublicacion);
    }
}