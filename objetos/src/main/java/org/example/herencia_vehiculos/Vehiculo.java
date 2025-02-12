package org.example.herencia_vehiculos;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca=marca;
        this.matricula=matricula;
    }

    public void mostrarInfo(){
        System.out.println("El vehiculo " + this.marca + ", tiene la matrícula " + this.matricula);
    }

    public void ruido(){
        System.out.println("PIIIII PII");
    }
}
