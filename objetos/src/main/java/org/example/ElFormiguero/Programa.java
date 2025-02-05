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

    public void agregarEmpleados(String nombre, String cargo) {
        Empleado nuevoEmpleado = new Empleado(nombre, cargo);
        listaEmpleados.add(nuevoEmpleado);

        if (nuevoEmpleado.getCargo().equals("director")){
            director=nuevoEmpleado;
        }else {
            nuevoEmpleado.setDirector(director);
        }

    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void agregarInvitado(String nombre, String profesion, int temporada) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(nuevoInvitado);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector() {
        System.out.println("¿Como se llama el Director de este programa?");
        String nombre = teclado.next();
        agregarEmpleados(nombre, "director");
    }

    @Override
    public String toString(){
        return getNombre() + " | Cadena: " + getCadena() + " | Temporada: " + getTemporadas() + " | Director: " + listaEmpleados;
    }
}
