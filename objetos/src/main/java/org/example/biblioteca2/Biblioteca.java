package org.example.biblioteca2;

import lombok.Data;

import java.util.ArrayList;

/**
 * Nos evitamos tener que hacer constructores, gettes, settes, toString...
 */
@Data
public class Biblioteca {

    /**
     * Lista de libros.
     */
    private ArrayList<Libro> catalogo;

    /**
     * Lista de usuarios.
     */
    private ArrayList<Usuario> usuariosRegistrados;

    /**
     * Constructor para poder iniciar las 2 listas.
     */
    public Biblioteca(){
        catalogo = new ArrayList<>();
        usuariosRegistrados = new ArrayList<>();
    }

    /**
     * Agrega un libro al catálogo.
     *
     * @param libro El libro que se va a agregar al catálogo.
     */
    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }

    /**
     * Registra un usuario.
     *
     * @param usuario El usuario que se va a registrar.
     */
    public void registrarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);
    }

    /**
     * Convierte la lista en una variable con el bucle forEach para poder buscarlo por su titulo y devolverlo.
     *
     * @param titulo El título del libro que se desea buscar.
     */
    public void buscarLibro(String titulo){
        for (Libro cat : catalogo){
            if (cat.getTitulo().equals(titulo)){
                cat.devolverLibro();
            }
        }
    }

    /**
     * Devuelve el catálogo de libros.
     *
     * @return Un ArrayList con todos los libros del catálogo.
     */
    public ArrayList<Libro> mostrarCatalogo(){
        return catalogo;
    }

}
