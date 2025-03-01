package org.example.biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fecha;

    public Prestamo(Estudiante estudiante, Libro libro){
        this.estudiante=estudiante;
        this.libro=libro;
        fecha=LocalDate.now();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString(){
        return "PRESTAMO DE LIBROS: Estudiante = " + getEstudiante() + ", Libro = " + getLibro() + ". Fecha = " + getFecha() + ".";
    }
}
