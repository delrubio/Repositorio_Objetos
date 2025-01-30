package org.example;

import org.w3c.dom.ls.LSOutput;

public class Libro {

    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;
    public static final String ID_LIBROS= "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean dispo;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial){
        this.titulo=titulo;
        this.autor=autor;
        this.id=calcularId();
        this.dispo=true;
        cantidadLibros ++;
        librosDisponibles ++;
        estudiantePrestado=null;
        this.editorial=editorial;
    }

    public static String calcularId(){
        return ID_LIBROS + String.format("%03d",cantidadLibros);
        //ID_LIBROS es un prefijo que se aplica a todos, y el String.format los une con 2 ceros + el número de la cuenta
    }

    public Prestamo prestarLibro(Estudiante estudiante){
        if (dispo && estudiante.getLibroprestado()==null) {
            dispo = false;
            System.out.println("Se ha prestado el libro " + titulo + " con éxito a " + estudiante.getNombre());
            librosDisponibles--;
            estudiantePrestado=estudiante;
            estudiante.setLibroprestado(this);
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Nuevo prestamo : " + prestamo);
            return prestamo;
        } else if (estudiante.getLibroprestado()!=null){
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado.");
        } else{
            System.out.println("El libro " + titulo + " no se puede prestar. (No Disponible)");
        }
        return null;
    }

    public void devolverLibro(Estudiante estudiante){
        if (!dispo){
            dispo=true;
            System.out.println("¡GRACIAS! Se ha devuelto el libro " + titulo + " con éxito por " + estudiantePrestado.getNombre());
            librosDisponibles++;
            estudiantePrestado=null;
            estudiante.setLibroprestado(null);
        }else{
            System.out.println("El libro " + titulo + " está disponible.");
        }
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    public boolean getDisponible(){
        return dispo;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public String estaDisponible(){
        if (getDisponible()){
            return "El libro " + titulo + " está disponible.";
        }else {
            return "El libro " + titulo + " no está disponible. Lo siento.";
        }
    }

    @Override
    public String toString(){
        return "LIBRERÍA [Titulo = " + getTitulo() + ", Autor = " + getAutor() + ", ID = " + getId() + ", Disponibilidad = " + getDisponible() + ", Estudiante Prestado = " + getEstudiantePrestado() + ", Ediotrial = " + getEditorial() +"]";
    }
}
