package org.example;

public class Estudiante {

    public static int contadorEstudiante = 0;
    public static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libroprestado;

    public Estudiante(String nombre, String curso, String email){
        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiante++;
        nia=contadorEstudiante;
        libroprestado=null;
    }

    public Estudiante(String nombre){
        this.nombre=nombre;
        contadorEstudiante++;
        nia=contadorEstudiante;
        libroprestado=null;
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

    public Libro getLibroprestado(){
        return libroprestado;
    }

    public void setLibroprestado(Libro libroprestado) {
        this.libroprestado = libroprestado;
    }

    @Override
    public String toString() {
        if (libroprestado != null) {
            return "Estudiante: [nombre = " + getNombre() + ", curso = " + getCurso() + ", nia = " + this.nia + ", email = " + getEmail() + ", Libro Prestado = " + libroprestado.getTitulo() + "]";
        } else{
            return "Estudiante: [nombre = " + getNombre() + ", curso = " + getCurso() + ", nia = " + this.nia + ", email = " + getEmail() + "]";
        }
    }
}