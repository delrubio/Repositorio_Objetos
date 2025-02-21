package org.example.enum_semaforo;

public enum Semaforo {

    ROJO, VERDE, AMARILLO;

    public Semaforo siguiente(Semaforo estado){

        switch (estado){
            case AMARILLO:
                return Semaforo.ROJO;
            case VERDE:
                return Semaforo.AMARILLO;
            case ROJO:
                return Semaforo.VERDE;
            default:
                return Semaforo.AMARILLO;
        }

    }
}
