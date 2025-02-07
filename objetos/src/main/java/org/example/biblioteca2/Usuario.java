package org.example.biblioteca2;

import lombok.Data;

import java.util.ArrayList;

/**
 * Nos evitamos tener que hacer constructores, gettes, settes, toString...
 */
@Data
public class Usuario {

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Id del usuario.
     */
    private int idUsuario;

    /**
     * Lista de libros que se han prestado.
     */
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor que inicializa el nombre, el idUsuario y la lista de libros prestados.
     *
     * @param nombre El nombre del usuario.
     * @param idUsuario El id del usuario.
     */
    public Usuario(String nombre, int idUsuario){
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        librosPrestados = new ArrayList<>();
    }

    /**
     * Añade el libro que se quiere prestar a la lista de libros prestados.
     *
     * @param libro El libro que el usuario desea prestar.
     */
    public void prestarLibro(Libro libro){
        librosPrestados.add(libro);
    }

    /**
     * Borramos de la lista de libros prestados el libro y vuelve a estar disponible.
     *
     * @param libro El libro que el usuario desea devolver.
     */
    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);
    }

    /**
     * Devuelve la lista de libros.
     *
     * @return La lista de libros prestados por el usuario.
     */
    public ArrayList<Libro> listarLibrosPrestados(Libro libro){
        return librosPrestados;
    }
}
