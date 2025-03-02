package org.example.CopaDelRey;

public class AppMutxamelFC {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("David", 19, 9, "senior", "DELANTERO");
        Jugador jugador2 = new Jugador("Hector", 18, 9, "juvenil", "defensa");
        Jugador jugador3 = new Jugador("Ruben", 23, 9, "senior", "portero");
        Jugador jugador4 = new Jugador("Miguel", 13, 9, "infantil", "defensa");
        Jugador jugador5 = new Jugador("Sergio", 16, 9, "cadete", "centrocampista");

        iniciarMantenimiento(jugador1, jugador2, jugador3, jugador4, jugador5);

//        Masajista masajista = new Masajista("Paco", 43, "Sexy", 23);
//
//        masajista.darMasaje(jugador1);
//
//        Entrenador entrenador = new Entrenador("Miguel", 51, Equipos.CADETE);
//
//        entrenador.entrenar();
//
//        Acompañante acompañante = new Acompañante("Sara", 21, jugador1, "Hermano");
//
//        acompañante.celebrarGol();
//        acompañante.viajar("Ciudad Real");
    }

    public static void iniciarMantenimiento(Jugador... jugador){
        AppMantenimiento.setLista_jugadores(jugador);
        AppMantenimiento.main();
    }
}
