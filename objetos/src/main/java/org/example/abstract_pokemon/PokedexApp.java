package org.example.abstract_pokemon;

public class PokedexApp {

    public static void main(String[] args) {

        Pokemon pikachu = new Electrico(100);
        //SE PUEDE CREAR PARA TENERLOS TODOS EN UN VECTOR Y TIENEN QUE SER DEL MISMO TIPO

        Electrico pikachuu = new Electrico(100);
        Electrico charmander = new Electrico(99);
        Electrico magikarp = new Electrico(75);

        pikachuu.atacar();
        pikachuu.imprimirNivel();

        Pokemon[] pokemos = {new Agua(54), new Fuego(74), new Electrico(81)};
        for (Pokemon pok: pokemos){
            pok.atacar();
        }

    }
}
