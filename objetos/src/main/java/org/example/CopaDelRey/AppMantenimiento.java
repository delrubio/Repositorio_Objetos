package org.example.CopaDelRey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMantenimiento {

    static Scanner teclado = new Scanner(System.in);
    public static ArrayList<Jugador> lista_jugadores;

    public static void main() {
        menuPrincipal();
    }

    public static void menuPrincipal(){
        System.out.println("=== App de mantenimiento del Mutxamel FC ===");
        System.out.println("1. Mantenimiento de juagdores");
        System.out.println("   - Gestión de los jugadores. Añadir, modificar, borrar...");
        System.out.println("2. Mantenimiento de entrenadores");
        System.out.println("   - Gestión de los entrenadores. Añadir, modificar, borrar...");
        System.out.println("3. Mantenimiento de masajistas");
        System.out.println("   - Gestión de los masajistas. Añadir, modificar, borrar...");
        System.out.println("4. Consulta de equipos");
        System.out.println("   - Gestión de los equipos.");
        System.out.println("5. SALIR");
        System.out.println("============================================");

        System.out.println("Selecciona una opción > ");
        eleccionUsuario(teclado.nextInt());

    }

    public static void eleccionUsuario(int opc){
        switch (opc){
            case 1:
                gestionJugadores();
                break;
            case 2:
                System.out.println("EN MANTENIMIENTO!");
                break;
            case 3:
                System.out.println("EN MANTENIMIENTO!");
                break;
            case 4:
                System.out.println("EN MANTENIMIENTO!");
                break;
            case 5:
                break;
            default:
                System.out.println("ERROR. Valor incorrecto");
                System.exit(1);
        }
    }

    //cojo todos los jugadores que me metan en el main de AppMutxamelFC y los meto en la lista
    public static void setLista_jugadores(Jugador... jugador){
        lista_jugadores = new ArrayList<>();
        lista_jugadores.addAll(List.of(jugador));
    }

    //metodo para imprimir la lista de jugadores
    public static void listaJugadores(){
        int cont = 0;
        for (Jugador jugador : lista_jugadores){
            System.out.println(cont + " - " + jugador);
            cont++;
        }
    }

    public static void gestionJugadores(){
        System.out.println("=== Mantenimiento de jugadores ===");
        System.out.println("1. Añadir jugador");
        System.out.println("2. Modificar datos");
        System.out.println("3. Crear acompañante");
        System.out.println("4. Volver al menú principal");
        System.out.println("==================================");

        System.out.println("Selecciona una opción > ");
        eleccionJugadores(teclado.nextInt());
    }

    public static void eleccionJugadores(int opc){
        switch (opc){
            case 1:
                nuevoJugador();
                break;
            case 2:
                modifJugadores();
                break;
            case 3:
                crearAcompa();
                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("ERROR. Valor incorrecto");
                System.exit(1);
        }
    }

    public static void nuevoJugador(){
        System.out.println("=== Añadir Jugadores ===");
        System.out.println("Nombre: ");
        String nom = teclado.next();
        System.out.println("Edad: ");
        int eda = teclado.nextInt();
        System.out.println("Categoría: ");
        String cat = teclado.next().toUpperCase();
        System.out.println("Dorsal: ");
        int cont = 0;
        int dor = 0;

        //compruebo que el jugador no tenga el mismo dorsal y no juege en la misma categoría
        for (Jugador jugador : lista_jugadores){
            if (jugador.getDorsal()== teclado.nextInt() && jugador.getCategoria().equals(lista_jugadores.get(cont).getCategoria())){
                System.out.println("ERROR. Ese dorsal ya está cogido.");
                System.out.println("Estás siendo redirigido...");
                nuevoJugador();
            }else{
                dor = teclado.nextInt();
            }
            cont++;
        }


        System.out.println("Posición: ");
        String pos = teclado.next().toUpperCase();

        Jugador jugador = new Jugador(nom, eda, dor, cat, pos);
        lista_jugadores.add(jugador);
    }

    public static void modifJugadores(){

        System.out.println("=== Modificar Jugadores ===");
        System.out.println("¿De qué jugador hay que hacer cambios?");

        listaJugadores();

        System.out.println("Selecciona una opción > ");
        int opc1 = teclado.nextInt();

        System.out.println("Que quiere cambiar: [nombre, edad, categoria, dorsal, posicion]");
        String opc2 = teclado.next().toUpperCase();

        System.out.println("Modificando " + lista_jugadores.get(opc1));

        switch (opc2){
            case "NOMBRE": //meto el nombre nuevo a pelo
                System.out.println("Dime el nuevo nombre > ");
                lista_jugadores.get(opc1).setNombre(teclado.next());
                break;
            case "EDAD": //meto la edad nueva a pelo
                System.out.println("Dime la nueva edad >");
                lista_jugadores.get(opc1).setEdad(teclado.nextInt());
                break;
            case "CATEGORIA": //meto la categoría nueva a pelo
                System.out.println("Dime la categoría > ");
                lista_jugadores.get(opc1).setCategoria(teclado.next());
                break;
            case "DORSAL": //vuelvo a comprobar lo del dorsal
                System.out.println("Dime el nuevo dorsal > ");
                for (Jugador jugador : lista_jugadores){
                    if (jugador.getDorsal()== teclado.nextInt() && jugador.getCategoria().equals(lista_jugadores.get(opc1).getCategoria())){
                        System.out.println("ERROR. Ese dorsal ya está cogido.");
                        System.out.println("Estás siendo redirigido...");
                        modifJugadores();
                    }else{
                        lista_jugadores.get(opc1).setDorsal(teclado.nextInt());
                    }
                }
                break;
            case "POSICION": //meto la posicion nueva a pelo
                System.out.println("Dime la nueva posicion > ");
                lista_jugadores.get(opc1).setPosicion(teclado.next());
                break;
            default:
                System.out.println("ERROR. Valor incorrecto");
                System.exit(1);
        }
        System.out.println("EXITOSO");
        listaJugadores();
    }

    public static void crearAcompa(){
        System.out.println("=== Crear Acompañante ===");
        System.out.println("¿A quien quieres acompañar?");

        listaJugadores();

        System.out.println("Selecciona una opción > ");
        int opc1 = teclado.nextInt();

        //compruebo el jugador juega con los SENIOR
        if (!lista_jugadores.get(opc1).getCategoria().equals(Equipos.SENIOR)){
            System.out.println("ERROR. Solo pueden acompañarse los SENIORS.");
            System.exit(1);
        }

        System.out.println("Nombre: ");
        String nom = teclado.next();
        System.out.println("Edad: ");
        int eda = teclado.nextInt();
        System.out.println("Parentesco: ");
        String pare = teclado.next();

        Acompañante acomp = new Acompañante(nom, eda, lista_jugadores.get(opc1), pare);
    }

}
