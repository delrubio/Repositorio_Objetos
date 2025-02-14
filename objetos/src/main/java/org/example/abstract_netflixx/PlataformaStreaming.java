package org.example.abstract_netflixx;

public class PlataformaStreaming {
    public static void main(String[] args) {
        Suscripcion[] suscripciones = {new PlanGratis("Gratis", 0), new PlanPremium("Premium", 14.99)};

        for (Suscripcion sub: suscripciones){
            sub.mostrarInfo();
        }
    }
}
