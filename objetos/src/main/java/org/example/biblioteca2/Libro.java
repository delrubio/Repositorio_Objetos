package org.example.biblioteca2;

import lombok.Data;

/**
 * Nos evitamos tener que hacer constructores, gettes, settes, toString...
 */
@Data
public class Libro {

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Autor del libro.
     */
    private String autor;

    /**
     * Año de publicación del libro.
     */
    private int anyoPublicacion;

    /**
     * Estado del libro. Si es true el libro está disponible, si es false, no está disponible.
     */
    private boolean disponible;

    /**
     * Constructor del Libro, el título, autor, año de publicación son necesarios y el libro lo pone disponible.
     *
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anyoPublicacion El año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anyoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        disponible = true;  // Inicializa el libro como disponible.
    }

    /**
     * Marca el libro como no disponible.
     */
    public void prestarLibro(){
        disponible = false;
    }

    /**
     * Marca el libro como disponible.
     */
    public void devolverLibro(){
        disponible = true;
    }

    /**
     * Muestra la información del libro.
     *
     * @return Una cadena de texto con la información del libro.
     */
    public String mostrarInformacion(){
        return "Título del Libro: " + getTitulo() + ", autor: " + getAutor() +
                (disponible == true ? ", está disponible" : ", no está disponible.") + " | " + anyoPublicacion;
    }
}
