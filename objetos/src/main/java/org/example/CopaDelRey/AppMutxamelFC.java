package org.example.CopaDelRey;

public class AppMutxamelFC {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("David", 19, 9, "senior", "DELANTERO");
        Jugador jugador2 = new Jugador("Hector", 18, 11, "juvenil", "defensa");
        Jugador jugador3 = new Jugador("Ruben", 23, 2, "senior", "portero");
        Jugador jugador4 = new Jugador("Miguel", 13, 1, "infantil", "defensa");
        Jugador jugador5 = new Jugador("Sergio", 16, 34, "cadete", "centrocampista");

//        iniciarMantenimiento(jugador1, jugador2, jugador3, jugador4, jugador5);

        System.out.println(jugador1);
        jugador1.calentar();
        jugador1.concentrarse();

        Masajista masajista = new Masajista("Paco", 43, "Master Universitario", 23);
        masajista.darMasaje(jugador1);

        Entrenador entrenador = new Entrenador("Miguel", 51, Equipos.CADETE);
        entrenador.entrenar();
        entrenador.planificarEntrenamiento();

        Acompañante acompañante = new Acompañante("Sara", 21, jugador2, "Hermano");
        acompañante.animarEquipo();

        acompañante.celebrarGol();
        acompañante.viajar("Ciudad Real");
    }

    //lo utilizo parapoderiniciar la lista de todos los jugadores que creamos aquí
    public static void iniciarMantenimiento(Jugador... jugador){
        AppMantenimiento.setLista_jugadores(jugador);
        AppMantenimiento.main();
    }
}
