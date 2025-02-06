package org.example.ElFormiguero;

import org.example.casa.Propietario;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    Scanner teclado = new Scanner(System.in);

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre){
        this.nombre=nombre;
        this.cadena=getCadena();
        this.temporadas=0;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        setDirector();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector() {
        System.out.println("¿Quien es el director del programa: " + getNombre() +"?");
        String nombre = teclado.nextLine();
        agregarEmpleados(nombre, "director");//pregunto por el nombre del director nada mas crear el programa y se lo paso
                                                    // al metodo que se encarga de agregar empleados ya se del cargo director,
                                                    // presentador... con el cargo director porque el metodo necesita el nombre
                                                    //y el cargo del nuevo empleado
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, this.temporadas);//creo el nuevo invitado con una llamada
        // desde el Main, llamo a el constructor de Invitado en la clase Invitado y lo añado en la lista de invitados
        listaInvitados.add(nuevoInvitado);
    }

    public void agregarEmpleados(String nombre, String cargo) {
        Empleado nuevoEmpleado = new Empleado(nombre, cargo);//creo el nuevo empleado con una llamada
        // desde el Main, llamo a el constructor de Empleado en la clase Empleado y lo añado en la lista de empleados
        listaEmpleados.add(nuevoEmpleado);

        if (nuevoEmpleado.getCargo().equals("director")){//si el cargo es director, lo hago el director del nuevo programa
            director=nuevoEmpleado;
        }else {
            nuevoEmpleado.setDirector(director);//si no lo es le digo quien es su director
        }

    }

    public void invitadosTemporada(int temporadas){
        for (Invitado invitado : listaInvitados) {//cojo la lista de invitados con un for y miro que sea la temporada correspondiente
            if (getTemporadas()==temporadas){
                System.out.println("Temporada: " + getTemporadas() + " | Invitado: " + invitado.getNombre() + ", profesión: " + invitado.getProfesión());
            }
        }

    }

    public int vecesInvitado(String nombre){
        int veces=0;
        for (Invitado invitado : listaInvitados) { //cuento cuantas veces ha sido esta persona invitada al programa cogiendola
                                                    // de la lista
            if (invitado.getNombre().matches(nombre)){
                veces++;
            }
        }
        return veces;
    }

    public void rastrearInvitado(String nombre){
        int veces = vecesInvitado(nombre);
        for (Invitado invitado : listaInvitados){//utilizo el metodo anterior para averiguar las veces y con este doy mas
                                                // información sobre el invitado, la fecha y a que se dedica
            System.out.println("Invitado: " + invitado.getNombre() + "Ha ido un total de " + (veces == 1?" vez" : veces + " veces") + ", el día " + invitado.getFecha_visita() + "y la temporada" + invitado.getTemporada());
        }
    }

    @Override
    public String toString(){
        return getNombre() + " | Cadena: " + cadena + " | Temporada: " + getTemporadas() + " | Director: " + director.getNombre() + listaEmpleados + listaInvitados;
    }
}
