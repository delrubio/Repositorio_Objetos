package org.example.abstract_pokemon;

public abstract class Pokemon {

    private int nivel;

    public Pokemon(int nivel){
        this.nivel=nivel;
    }

    public abstract void atacar();
    //este metodo obliga a ser implementado en todas las clases que lo quieras implementar y cadauno se lo rellena
    //como quiere. Por ejemplo, los de fuego tendrán unas cosas y los de agua otras.

    public void imprimirNivel(){
        System.out.println("Nivel: " + nivel);
    }
}
