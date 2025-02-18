package org.example.ecommerce;

public abstract class MetodoPago {

    private double importe;

    public MetodoPago(double importe){
        this.importe=importe;
    }

    public abstract void procesarPago(double importe);
}
