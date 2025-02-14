package org.example.abstract_netflixx;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan=nombrePlan;
        this.precio=precio;
    }

    public void mostrarInfo(){
        System.out.println("Tipo de plan: " + nombrePlan);
        System.out.println("Plan: " + precio);
    }

    public abstract void obtenerBeneficios();

}
