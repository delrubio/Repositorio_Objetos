package org.example.ElFormiguero;

import java.util.Arrays;

public class Empleado {

    public static final String ID_EMPLEADO= "EP";
    public static int numeroEmpleados = 0;
    public static String[] listaCargos = {"director", "técnico", "presentador", "colaborador"};

    private String id;
    private String nombre;
    private String cargo;

    private Empleado director;

    public Empleado(String nombre, String cargo){
        setId();
        this.nombre=nombre;
        setCargo(cargo);
        setDirector(this);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (Arrays.asList(listaCargos).contains(cargo)){
            this.cargo=cargo;
        }else {
            this.cargo="pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        if (director.getCargo().equals("director")){
            this.director=director;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id=ID_EMPLEADO + String.format("%03d", ++numeroEmpleados);
    }

    @Override
    public String toString(){
        return "Empleado | Nombre: " + getNombre() + " | ID: " + getId() + " | Cargo: " + getCargo() + " | Director : " + director.getNombre();
    }

}
