package org.example.abstract_pokemon;

public class PokedexApp {

    public static void main(String[] args) {

//        Pokemon pikachu = new Electrico(100);
//        //SE PUEDE CREAR PARA TENERLOS TODOS EN UN VECTOR Y TIENEN QUE SER DEL MISMO TIPO
//
//        Electrico pikachuu = new Electrico(100);
//        Electrico charmander = new Electrico(99);
//        Electrico magikarp = new Electrico(75);
//
//        pikachuu.atacar();
//        pikachuu.imprimirNivel();
//
//        Pokemon[] pokemos = {new Agua(54), new Fuego(74), new Electrico(81)};
//        for (Pokemon pok: pokemos){
//            pok.atacar();
//
//            if (pok instanceof AtaquesAgua){
//                ((AtaquesAgua) pok).hidroBomba();
//                ((AtaquesAgua) pok).sur();
//            }
//        }
//
//        Agua squitle = new Agua(500);
//
//        squitle.pistolaAgua();



        //Las clases anónimassirven para cuando yo a un objeto aquí en el
        // main me apetzca reemplazar algo en un momento dado, escribo la
        // clase y en el @Override reemplazas eso en el momento dado.

        AtaquesAgua agua = new AtaquesAgua() {
            @Override
            public void pistolaAgua() {
                System.out.println("Flis FLIS");
            }

            @Override
            public void salpicadura() {

            }

            @Override
            public void sur() {

            }

            @Override
            public void hidroBomba() {

            }
        };

        agua.pistolaAgua();

        Pokemon raichu = new Pokemon(154) {
            @Override
            public void atacar() {
                System.out.println("BOLA VOLTIO");
            }
        };

        raichu.atacar();
        raichu.imprimirNivel();

        Fuego charizard = new Fuego(9562);

    }
}
