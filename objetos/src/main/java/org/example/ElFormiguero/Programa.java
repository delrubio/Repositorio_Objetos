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

    public Empleado getDirector() {
        return director;
    }

    public void setDirector() {
        System.out.println("¿Quien es el director del programa: " + getNombre() +"?");
        String nombre = teclado.next();
        agregarEmpleados(nombre, "director");
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, this.temporadas);
        listaInvitados.add(nuevoInvitado);
    }

    public void agregarEmpleados(String nombre, String cargo) {
        Empleado nuevoEmpleado = new Empleado(nombre, cargo);
        listaEmpleados.add(nuevoEmpleado);

        if (nuevoEmpleado.getCargo().equals("director")){
            director=nuevoEmpleado;
        }else {
            nuevoEmpleado.setDirector(director);
        }

    }

    public void invitadosTemporada(int temporadas){
        for (Invitado invitado : listaInvitados) {
            System.out.println("Temporada: " + getTemporadas() + " | Invitado: " + invitado.getNombre() + ", profesión: " + invitado.getProfesión());
        }

    }

    public int vecesInvitado(String nombre){
        int veces=0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().matches(nombre)){
                veces++;
            }
        }
        return veces;
    }

    public void rastrearInvitado(String nombre){
        int veces = vecesInvitado(nombre);
        for (Invitado invitado : listaInvitados){
            System.out.println("Invitado: " + invitado.getNombre() + "Haido un total de " + (veces == 1?" vez" : veces + " veces") + ", el día " + invitado.getFecha_visita() + "y la temporada" + invitado.getTemporada());
        }
    }

    @Override
    public String toString(){
        return getNombre() + " | Cadena: " + cadena + " | Temporada: " + getTemporadas() + " | Director: " + director.getNombre() + " " + listaEmpleados;
    }
}
