package org.example;

public class Libro {

    public static int cantidadLibros = 0;
    public static int librosDisponibles = 0;
    public static final String ID_LIBROS= "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean dispo;

    public Libro(String titulo, String autor, String id, boolean dispo){
        this.titulo=titulo;
        this.autor=autor;
        this.id=calcularId();
        this.dispo=true;
        cantidadLibros ++;
        librosDisponibles ++;
    }

    public static String calcularId(){
//        if (cantidadLibros < 10){
//            return ID_LIBROS+"00"+cantidadLibros;
//        } else if (cantidadLibros < 100) {
//            return ID_LIBROS+"0"+cantidadLibros;
//        }else {
//            return ID_LIBROS+cantidadLibros;
//        }

        return ID_LIBROS + String.format("%30d",cantidadLibros);
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

    @Override
    public String toString(){
        return "LIBRERÍA [ Titulo = " + getTitulo() + ", Autor = " + getAutor() + ", ID = " + getId()
    }
}
