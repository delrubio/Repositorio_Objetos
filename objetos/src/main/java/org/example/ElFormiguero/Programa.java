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
        if (cargo.equals("director")){
                    //tengo que agregar al director
        }
        Empleado nuevoEmpleado = new Empleado(nombre, cargo);
        listaEmpleados.add(nuevoEmpleado);
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector() {
        System.out.println("¿Como se llama el Director de este programa?");
        String nombre = teclado.next();
        agregarEmpleados(nombre, "director");
    }
}
