package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiante = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre, String curso, String email){
        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiante++;
        nia=contadorEstudiante;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiante++;
        nia=contadorEstudiante;
        librosPrestados = new ArrayList<>();
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiante;
    }

    public static boolean validarCorreo(String email){
        if (email.matches(FORMATO_CORREO)){
            return true;
        }else {
            return false;
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso=curso;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public ArrayList<Libro> getLibrosPrestados(){
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void insertarLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
        if (!librosPrestados.isEmpty()) {
            return "Estudiante: [nombre = " + getNombre() + ", curso = " + getCurso() + ", nia = " + this.nia + ", email = " + getEmail() + ", Libro Prestado = " + librosPrestados + "]";
        } else{
            return "Estudiante: [nombre = " + getNombre() + ", curso = " + getCurso() + ", nia = " + this.nia + ", email = " + getEmail() + "]";
        }
    }
}